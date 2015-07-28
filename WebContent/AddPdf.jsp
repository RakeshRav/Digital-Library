<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page language="java" import="java.util.*,java.sql.*" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Digital Library System</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="default.css" rel="stylesheet" type="text/css" />
<style type="text/css">
<!--
.style5 {color: #000000; font-weight: bold; font-size: 14px; }
-->
</style>
 <script language="javascript">
  </script>
</head>
<body>
<div id="header">
	<div id="logo">
		<h1><jsp:include page="header.html"/> 
	  </h1>
		
  </div>
	<div id="menu">
        <jsp:include page="adminoptions.html"/>
	</div>
</div>
<div id="page">
  <!-- end #content -->
<div id="sidebar">
		<div id="news" class="boxed1">
			<blockquote>
			  <blockquote>
			    <h2 class="title">Book</h2>
		      </blockquote>
		  </blockquote>
	  </div>
	    <%
        ServletContext ctx=getServletContext();
        String driver=ctx.getInitParameter("driver");
        String url=ctx.getInitParameter("url");
        String dname=ctx.getInitParameter("dname");
        String dpass=ctx.getInitParameter("dpass");
        String book_id = request.getParameter("book_id");
     %>
    
     <form action="AddPdf?book_id=<%= book_id %>" method="post" enctype="multipart/form-data">
	
		 <table border="0" align="center">
		   <tr>
		  
		    			<td>	<input class="style5" type="file" name="file1" accept="pdf">  </td>
							
						<td>	<button type="submit" >Add</button>  </td>
		     
	     </tr>
	     </table>
	</form>
  </div>
<!-- end #sidebar -->
</div>
<!-- end #page -->
<div id="footer">
	<p>&nbsp;</p>
</div>
</body>
</html>
