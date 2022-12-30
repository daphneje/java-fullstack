package array;

import java.util.Scanner;

public class Launch5 {
	
	private static int[] findTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Length of array?");
        int n = scan.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Please provide " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        
        System.out.println("What is the target sum?");
        int target = scan.nextInt();

        scan.close();

        int[] indices = findTwoSum(nums, target);

        if (indices.length == 2) {
            System.out.println("Index of indices are: " + indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }

}
