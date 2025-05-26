package Sdet;

import java.util.Stack;

public class paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="(())";
		boolean is_valid=true;
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<str.length();i++)
			
		{
			char ch=str.charAt(i);
			if (ch=='(' || ch=='{')
			{
				stack.push(ch);
			}
			else 
			{
				if (stack.isEmpty())
				{
					is_valid=false;
				}
				char top=stack.peek();
				if(ch==')' && top!='(')
				{
					is_valid=false;
				}else if(ch=='}' && top!='{')
				{
					is_valid=false;
				}else
				{
					stack.pop();
				}
				
			}
			
		}
		if (stack.isEmpty() && is_valid)
		{
			System.out.println("it is valid");
		}else
		{
			System.out.println("Not valid");
		}
	}

}
