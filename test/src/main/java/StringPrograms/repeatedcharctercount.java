package StringPrograms;

import java.util.HashMap;

public class repeatedcharctercount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My name is Saritam";
		
		char[] charcterArray=str.toCharArray();
	
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(char chars:charcterArray)
		{
			if(map.containsKey(chars))
			{
				map.put(chars,map.get(chars)+1 );
			}
			else 
			{
				map.put(chars,1);
			}
		}
		
		for (Character key1:map.keySet())
		{
			System.out.println(key1 + ": " + map.get(key1));
		}
		
		int maxcount=0;
		char max_char=' ';
		
		for (Character chars: map.keySet())
		{
			if (chars!=' ' && map.get(chars)>maxcount)
			{
				maxcount=map.get(chars);
				max_char=chars;
			}
		}
		System.out.println(max_char+"max count"+maxcount);
	}

}
