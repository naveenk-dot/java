package Sdet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class countandrpintA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Naveeenana";
		int count=0;
		ArrayList<Character> set=new ArrayList<>();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if (!set.contains(str.charAt(i)))
			
			{
				set.add(str.charAt(i));
				count=1;
			}
			else 
			{
				count++;
			}
			System.out.println(set.get(i)+ "  "+count);
			count=0;
		}
		
		
	}

}
   