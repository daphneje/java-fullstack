package array;

import java.util.Scanner;

public class Launch2 {
	public static void main(String[] args) {
		int arr[][] = new int[2][3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Enter the marks of student " + j + " class " + i);
				arr[i][j] = scan.nextInt();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println("Marks of student " + j + " from class " + i + ": " + arr[i][j]);
			}
			
		}
	}

}

// 2 loops
//[i][j] enter marks of class 0, student 0

