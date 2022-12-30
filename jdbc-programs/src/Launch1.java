import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Launch1 {
	public static void main(String[] args)throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "Password1234");
		System.out.println("Connection established successfully");
		
		String s = "select * from student";
		
		Statement stmt = con.createStatement();
		ResultSet res = stmt.executeQuery(s);
		
		while (res.next()) {
			int id = res.getInt(1);
			String name = res.getString(2);
			int marks1 = res.getInt(3);
			int marks2 = res.getInt(4);
			int marks3 = res.getInt(5);
			System.out.println(id+"     "+name+"     "+marks1+"     "+marks2+"     "+marks3);
		}
	}

}
