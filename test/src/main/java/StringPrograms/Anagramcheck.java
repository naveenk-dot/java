package StringPrograms;

import java.util.Arrays;

public class Anagramcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="liokn";
		String str2="ioln";
		
		str1.toLowerCase();
		str2.toLowerCase();
		
		if(str1.length()==str2.length())
		{
			
		
		char[] Char1=str1.toCharArray();
		char[] Char2=str2.toCharArray();
		
		Arrays.sort(Char1);
		Arrays.sort(Char2);
		
		if(Arrays.equals(Char1, Char2))
		{
			System.out.println("Anangram");
		}
		
		
		}
	
	}

}
