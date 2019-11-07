package bai2;
import javax.servlet.http.*;
import org.apache.jasper.tagplugins.jstl.core.Out;
import javax.servlet.*;   
import java.io.*;

public class CheckedLogin  extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)  
	throws ServletException,IOException
	{
			response.setContentType("text/html");   
			PrintWriter out = response.getWriter();  
			String user = request.getParameter("user");   
			String pass = request.getParameter("pass");     
			if(user.equals("admin") && pass.equals("123")) 
			{      
				out.println("Xin chào: " + user); 
			}
			else 
			{ 
				out.println("Vui lòng đăng nhập lại"); 
			}     
			out.close(); 
	}
}   

