package array;

import java.util.Scanner;

// 2 schools, 3 classes with 2 students each.

//public class Launch4 {
//
//	public static void main(String[] args) {
//		
//		int arr[][][] = new int[2][3][2];
//		
//		Scanner scan = new Scanner(System.in);
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				for(int k=0; k<arr[i][j].length; k++) {
//					System.out.println("Enter the marks of school " + i + " class " + j + " student " + k);
//					arr[i][j][k] = scan.nextInt();
//				}
//
//			}
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				for(int k=0; k<arr[i][j].length; k++) {
//					System.out.println("Marks of school " + i + " class " + j + " student " + k + ": " + arr[i][j][k]);
//				}
//			}
//			
//		}
//
//	}
//
//}




// 2 schools, school 0 with 2 classes (2 and 3 students respectively) and school 1 with 3 classes (3, 2 and 2 students respectively).


public class Launch4 {

	public static void main(String[] args) {
		
		int arr[][][] = new int[2][][];
		
		arr[0] = new int[2][];
		arr[1] = new int[3][];
		
		arr[0][0] = new int[2];
		arr[0][1] = new int[3];
		
		arr[1][0] = new int[3];
		arr[1][1] = new int[2];
		arr[1][2] = new int[2];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("Enter the marks of school " + i + " class " + j + " student " + k);
					arr[i][j][k] = scan.nextInt();
				}

			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				for(int k=0; k<arr[i][j].length; k++) {
					System.out.println("Marks of school " + i + " class " + j + " student " + k + ": " + arr[i][j][k]);
				}
			}
			
		}

	}

}