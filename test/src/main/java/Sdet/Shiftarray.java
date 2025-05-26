package Sdet;

import java.util.Arrays;

public class Shiftarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]num= {1,2,3,4,5};
		int k=2;
		
		reverse(num, 0,k-1);
		reverse(num, k,num.length-1);
		int[]shifted=reverse(num, 0,num.length-1);
		System.out.println(Arrays.toString(shifted));
		
	}
	
	public static int[] reverse(int []num, int start, int end)
	{
		while (start<end)
		{
			int temp =num[start];
			num[start]=num[end];
			num[end]=temp;
			start++;
			end--;
			
		}
		return num;
		
	}

}
