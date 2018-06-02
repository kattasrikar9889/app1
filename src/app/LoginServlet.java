package app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class LoginServlet  extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		res.setContentType("text/html");//set the MIME type
		PrintWriter pw = res.getWriter();
		String uname = req.getParameter("un");
		String pword = req.getParameter("pwd");
		
		if(uname.equals("Mahesh") && pword.equals("12345")) {
			
			RequestDispatcher red = req.getRequestDispatcher("home.jsp");
			red.forward(req, res);
					
		}
		
		else {
			
			pw.println("Invalid UserName/ Password");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		
		pw.close();
	}

}