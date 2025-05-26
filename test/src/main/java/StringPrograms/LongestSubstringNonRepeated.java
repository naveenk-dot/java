package StringPrograms;

import java.util.HashSet;

import org.apache.commons.math3.stat.descriptive.rank.Max;

public class LongestSubstringNonRepeated {

    public static void main(String[] args) {
        
    	String str="abcdeabcbb";
		
		int windowStart=0;
		int windowEnd=0;
		int maxlength=0;
		
		
		HashSet<Character> set =new HashSet<>();
				
		while (windowEnd<str.length())
		{
			char ch =str.charAt(windowEnd);
			if(set.contains(ch))
			{
				while (set.contains(ch))
				{
					set.remove(str.charAt(windowStart));
					windowStart++;
				}
				
			}
			set.add(ch);
			maxlength=Math.max(maxlength,windowEnd-windowStart+1);
			windowEnd++;
		}
		System.out.println(maxlength);
	}
}
