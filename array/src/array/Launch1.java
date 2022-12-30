package array;

import java.util.Scanner;

public class Launch1 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the marks of student" + (i+1));
			arr[i] = scan.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

//public class Launch1 {
//	public static void main(String[] args) {
//		int arr[] = new int[5];
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int i=0;
//		while(i<arr.length) {
//			System.out.println("Enter the marks of student" + (i+1));
//			arr[i] = scan.nextInt();
//			i++;
//		}
//		
//		i=0;
//		while(i<arr.length) {
//			System.out.println(arr[i]);
//			i++;
//		}
//	}
//}


//public class Launch1 {
//	public static void main(String[] args) {
//		int arr[] = new int[5];
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int i=0;
//		do {
//			System.out.println("Enter the marks of student" + (i+1));
//			arr[i] = scan.nextInt();
//			i++;
//		}while(i<arr.length);
//		
//		i=0;
//		do {
//			System.out.println(arr[i]);
//			i++;
//		}while(i<arr.length);
//	}
//}