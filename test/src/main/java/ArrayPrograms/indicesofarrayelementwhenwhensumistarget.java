package ArrayPrograms;

import java.util.Arrays;
import java.util.HashMap;

public class indicesofarrayelementwhenwhensumistarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {6,8,11,6,7,18};		
		int target=17;
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int complement=target-arr[i];
			
			if (!map.containsKey(complement))
			{
				map.put(arr[i], i);
				
				
			}
			else {
			
				int j=map.get(complement);
				
				int arra[] ={i, j};
					System.out.println(Arrays.toString(arra));
			}
			
			
		}
		
	}

}
