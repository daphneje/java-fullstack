

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginSuccess extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("username");
		String y = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		out.println("Dear " + x + ", you have successfully logged in.");
		System.out.println(x);
	}
}
