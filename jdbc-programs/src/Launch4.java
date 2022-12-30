import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Launch4 {
	public static void main(String[] args)throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "Password1234");
		System.out.println("Connection established successfully");
		
		String s = "update student set marks1=? where id=?";
		
		PreparedStatement pstmt = con.prepareStatement(s);
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the id");
		int id = scan.nextInt();
		System.out.println("marks1");
		int marks1 = scan.nextInt();

		
		pstmt.setInt(1, marks1);
		pstmt.setInt(2, id);
		
		int rows = pstmt.executeUpdate();
		System.out.println(rows);
	}

}
