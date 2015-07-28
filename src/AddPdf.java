
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.coobird.thumbnailator.Thumbnails;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;


/**
 * Servlet implementation class AddPdf
 */
public class AddPdf extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPdf() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		addPic(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		addPic(request, response);
	}

	protected void addPic(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String book_id = request.getParameter("book_id");
		String filePath = getInitParameter("logo-path");
		
		//String view = request.getParameter("from");
		
		try {
	        List<FileItem> items = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
	        for (FileItem item : items) 
	        {
	            if (!item.isFormField()) 
	            {
	                // Process form file field (input type="file").
	                String fieldName = item.getFieldName();
	                String fileName = FilenameUtils.getName(item.getName());
	                String PDFName = ImageUtil.getNewImageName();
	                File file = new File(filePath + "" + PDFName);
	                try {
						item.write(file);
		                Event.insertImageName(Integer.parseInt(book_id), PDFName);
		                
		                
		                response.sendRedirect("AdminHome.jsp?status=New book Added");
					} catch (Exception e) {
						e.printStackTrace();
					}
	                System.out.println(fieldName + " : " + fileName);
	            }
	        }
//	        response.sendRedirect("admin?v=picwed");
		}
		catch (FileUploadException e) {
	        throw new ServletException("Cannot parse multipart request.", e);
	    }
	}

}
