package StringPrograms;

public class occuranceofSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="huhuhuabcygygyabcgugyyabc";
		String target="abc";
		int count=0;
				
		for (int i=0; i<=str.length()-target.length();i++)
		{
			if (str.substring(i,i+target.length()).equals(target))
			{
				count++;
			}
		}
		
		System.out.print(count);
				
	}

}
