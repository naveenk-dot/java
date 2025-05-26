package ArrayPrograms;

import java.util.HashMap;

public class RepeatedIntegerInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] input = {2, 5, 9, 3, 2, 8, 9, 6, 5, 8, 9};
	        int maxCount = 0;
	        int maxElement = input[0];

	        for (int i = 0; i < input.length; i++) {
	            int count = 0;
	            for (int j = 0; j < input.length; j++) {
	                if (input[i] == input[j]) {
	                    count++;
	                }
	            }
	            if (count > maxCount) {
	                maxCount = count;
	                maxElement = input[i];
	            }
	        }

	        System.out.println("Most repeated element: " + maxElement);
	    }

}
