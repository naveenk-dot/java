package ArrayPrograms;

import java.util.HashMap;

public class countFrequencyineachelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="naveen";
		char[]chars=input.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<>();
		//{1=null,1=null,2=null}
		
		for (char ch :chars)
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
		}
		System.out.println(map);
		
		for (char c: map.keySet())
		{
			if(c=='n')
			{
				//System.out.println(map.get(c));
			}
			
		}
		
		for(char key:map.keySet())
		{
			if (map.get(key)==2)
			{
			//	System.out.println(key);
			}
		}
		
		int maxcout=Integer.MIN_VALUE;
		int mincount=Integer.MAX_VALUE;
		char maxchar='\0';
		char minchar='\0';
		
		for (char c:map.keySet())
		{
			
			if(map.get(c)>maxcout)
			{
				maxcout=map.get(c);
				maxchar=c;
			}
			if(map.get(c)<mincount)
			{
				mincount=map.get(c);
				minchar=c;
			}
			
		}
		System.out.println(maxchar);
		System.out.println(minchar);
		
	}

}
