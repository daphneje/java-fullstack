import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Launch3 {
	public static void main(String[] args)throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample_acc_db", "root", "Password1234");
		System.out.println("Connection established successfully");
		
		String s = "insert into student values(?, ?, ?, ?, ?)";
		
		PreparedStatement pstmt = con.prepareStatement(s);
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the id");
		int id = scan.nextInt();
		System.out.println("Enter the name");
		String name = scan.next();
		System.out.println("marks1");
		int marks1 = scan.nextInt();
		System.out.println("marks2");
		int marks2 = scan.nextInt();
		System.out.println("marks3");
		int marks3 = scan.nextInt();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, marks1);
		pstmt.setInt(4, marks2);
		pstmt.setInt(5, marks3);
		
		int rows = pstmt.executeUpdate();
		System.out.println(rows);
	}

}
