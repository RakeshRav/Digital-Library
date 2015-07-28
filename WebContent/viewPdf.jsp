<%@page import="com.MyImageRenderListener"%>
<%@page import="com.itextpdf.text.pdf.parser.PdfReaderContentParser"%>
<%@page import="com.DBUtil"%>
<%@page import="java.io.IOException"%>
<%@page import="com.itextpdf.text.pdf.parser.PdfTextExtractor"%>
<%@page import="com.itextpdf.text.pdf.PdfReader"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Document</title>
<link href="default.css" rel="stylesheet" type="text/css" />

<script type="text/javascript">
function jumpPage() 
{
	var pageNo = document.getElementById("pageNo").value;
	var book_id = document.getElementById("book_id").value;
	var qString = "viewPdf.jsp?book_id="+book_id+"&pageNo="+pageNo;
	//window.location.href = qString;
	
	var jump = document.getElementById('jump');
	jump.href = qString;
	jump.click();
}
</script>
</head>
<body style="  padding: 0px 200px 100px 200px;">
<div id="header">
	<div id="logo">
		<h1><jsp:include page="header.html"/> 
	  </h1>
		
  </div>
	<div id="menu">
  <jsp:include page="useroptions.html"/> 
	</div>
</div>
<a id="jump"></a>
<br>
<br>
<%!
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

%>

<%
	String pdfName,pathName="";
	String book_id = request.getParameter("book_id");
	int pageNo;

	
			
	if(request.getParameter("pageNo")==null)
	{
		pageNo=1;
	}
	else
	{
		pageNo = Integer.parseInt(request.getParameter("pageNo"));
	}
	
	try
	{
		
	
		con = DBUtil.getConnection();
		stmt = con.createStatement();
		rs = stmt.executeQuery("select pdf_name from lms_pdf where book_id='"+book_id+"'");
		
		if(rs.next())
		{
			pdfName = rs.getString(1);
			pathName = getServletContext().getRealPath( "pdf/"+pdfName);
			System.out.println(pathName);
		}
	
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally
	{
		DBUtil.closeAllDBResources(rs, stmt, con);
	}

	try {
        
		String RESULT = getServletContext().getRealPath("images/tempImage.jpg");
        PdfReader reader = new PdfReader(pathName);
        System.out.println("This PDF has "+reader.getNumberOfPages()+" pages.");
        %>
        <input type="text" id="book_id" style="display: none;" value="<%=book_id%>">
        <div><table><tr><td><h3>Page <input type="text" id="pageNo" value="<%=pageNo %>" name ="pageNo."> / <%=reader.getNumberOfPages() %>   </h3></td> <td> <button onclick="jumpPage()">Jump</button></td><tr></table></div>
        <%
        
        	String pdfPage = PdfTextExtractor.getTextFromPage(reader, pageNo);
        	
	        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
	        MyImageRenderListener listener = new MyImageRenderListener(RESULT);
	            parser.processContent(pageNo, listener);
      
        	%>
        	<div style="  border: 1px solid #AEA9A9; padding: 50px; min-height: 400px;  box-shadow: 5px 7px 14px -7px rgb(89, 86, 86);">
        	
        	<p><%=pdfPage %></p>
        	<%
        		if(MyImageRenderListener.isImageFound)
        		{
        	%>
        			<img src="images/tempImage.jpg">
        	<%
        		}
        	%>
        	
        	</div>
        	
        	<div>
        		<table style="margin: 20px;">
        			<tr>
        			<%
        				if(pageNo!=1)
        				{
        					int prev = pageNo-1;
        					
        					%>
        					
        					<td><a href="viewPdf.jsp?book_id=<%=book_id%>&pageNo=<%=prev %>"><button value="Prev"  >Prev</button></a><td>
		        	
        					<%		
        				}
        			int next = pageNo+1;
        			%>
		        	
		        	<td style="float: left; margin-left: 830px;"><a href="viewPdf.jsp?book_id=<%=book_id%>&pageNo=<%=next %>"><button value="Next" >Next</button></a></td>
		        	</tr>
		        </table>
	        </div>	
        	<%
        //	System.out.println("Page Content:\n\n"+page+"\n\n");
        	//System.out.println("------------------------------------");
        
    } 
	catch (IOException e) {
        e.printStackTrace();
    }
	
	

%>
</body>
</html>