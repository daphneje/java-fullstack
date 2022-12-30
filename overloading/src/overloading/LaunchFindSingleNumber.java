package overloading;

import java.util.Arrays;


public class LaunchFindSingleNumber {
	public static void main(String[] args) {
	int nums[] = {4,1,2,1,2};
	
	boolean unique = true;
    for (int i=0;i<nums.length;i++) {
        for (int j=i+1;j<nums.length;j++) {
          if (j==i && nums[j] == nums[i]) {
            boolean unqiue = false;
          }
        }
    }
      return unique;
      
}
	
	int output[] = unique(nums);
	System.out.println(Arrays.toString(output));
	
	FindSingleNumber singleNumber = new FindSingleNumber();
	System.out.println(singleNumber.find(nums); 
	}
}



	
//public class LaunchProductExceptSelf {
//	public static void main(String[] args) {
//		int nums[] = {4, 2, 1, 7};
//		// int output[] = {(4*2*1*7)/4, (4*2*1*7)/2, (4*2*1*7)/1, (4*2*1*7)/7};
//		int output[] = productExceptSelf(nums);
//		System.out.println(Arrays.toString(output));
//	}
//	
//	static int[] productExceptSelf(int nums[]) {
//		int product = 1;
//		int output[] = new int[4];
//		
//		for(int i=0; i<nums.length; i++) {
//			product = product*nums[i];
//		}
//		
//		for(int i=0; i<output.length; i++) {
//			output[i] = product/nums[i];
//		}
//		
//		return output;
//	}
//
//}