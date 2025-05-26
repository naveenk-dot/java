package Sdet;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,2,4,5};
		
		int index=0;
		for (int i=1;i <arr.length;i++)
		{
			if (arr[i]!=arr[index])
		
			{
				index++;
				arr[index]=arr[i];
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
}
}
