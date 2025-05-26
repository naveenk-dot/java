package StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] nums ={34,0,9,5,7,4,0,4,0,0};
		
		int start=0;
		int end = nums.length-1;
		
		while(start<end)
		{
			if (nums[start]==0)
				{
					start++;
				}
			else if(nums[end]>0)
			{
				end--;
			}else
			{
				int temp=nums[start];
				nums[start]=nums[end];
				nums[end]=temp;
			}
		}
	
		System.out.println(Arrays.toString(nums));
	}
}
