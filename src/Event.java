
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DBUtil;

public class Event 
{
	public static boolean insertImageName(int eventId, String pdfName)
	{
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String sql = "insert into lms_pdf values(?, ?)";
		
		try
		{
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, eventId);
			pstmt.setString(2, pdfName);
			
			pstmt.executeUpdate();
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.closeAllDBResources(null, pstmt, con);
		}
		
		return false;
	}

}