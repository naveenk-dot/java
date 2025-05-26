package StringPrograms;

public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="My name is Naveen";
		String[] inputArray=input.split(" ");
		
		StringBuilder reversewords=new StringBuilder();
		
		for (String word:inputArray)
		{
			StringBuilder reverseWord=new StringBuilder();
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseWord.append(word.charAt(i));
			}
			reversewords.append(reverseWord).append(" ");
		}
		
		System.out.println(reversewords+" ");
		
	}

}
