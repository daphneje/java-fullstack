package array;

import java.util.Scanner;

public class Launch3 {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[4];
		
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

// 3 classes. Class 0 there's 3 students, class 1 there's 2 students and class 2 there's 4 students


//