package Sdet;

import java.util.Arrays;

public class movezeros {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		int[] arr= new int[] {1,0,2,3,2,0,0};
		
		int start=0;
		int end =arr.length-1;
		
		while (start<end)
		{
			if (arr[start]==0)
			{
				start++;
			}
			else if(arr[end]!=0)
			{
				end--;
			}
			else 
			
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}	

}
