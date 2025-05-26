package Sdet;

public class MissingNumber {
	
		    public static void main(String[] args) {
		        int[] nums = {1, 2, 4, 5, 6};
		        int n = nums.length + 1; // Total numbers including the missing one
		        int totalSum = n * (n + 1) / 2; // Sum of numbers from 1 to n
		        int currentSum = 0;

		        for (int num : nums) {
		            currentSum += num;
		        }

		        int missingNumber = totalSum - currentSum;
		        System.out.println("Missing Number: " + missingNumber);
		    }
		

	}


