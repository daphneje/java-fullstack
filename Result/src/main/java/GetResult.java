import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetResult extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id")) ;
			
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("Driver loaded successfully");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "Password1234");
			System.out.println("Connection established successfully");
			
			String s = "select * from student where id=?";
			
			PreparedStatement pstmt = con.prepareStatement(s);
			
			pstmt.setInt(1, id);
			ResultSet res = pstmt.executeQuery();
			
			PrintWriter out = response.getWriter();
			
			while (res.next()) {
				int tempId = res.getInt(1);
				String tempName = res.getString(2);
				int tempMarks1 = res.getInt(3);
				int tempMarks2 = res.getInt(4);
				int tempMarks3 = res.getInt(5);
				out.println(tempId+"     "+tempName+"     "+tempMarks1+"     "+tempMarks2+"     "+tempMarks3);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
