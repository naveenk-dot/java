package test.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActions {

	public static void createFile(String filepath) throws IOException
	{
		File myobj=new File(filepath);
		myobj.createNewFile();
				
	}
	
	
	public static void wrightFile(String filepath) throws IOException
	{
		FileWriter mywrighter=new FileWriter(filepath);
		mywrighter.write("naveen");
		mywrighter.write("naveen");
		mywrighter.close();
	}
	
	public static void readFile(String filepath) throws FileNotFoundException
	{
		File file=new File(filepath);
		Scanner scan= new Scanner(file);
		
		if (scan.hasNextLine())
		{
			String data=scan.nextLine();
			System.out.println(data);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readFile("G:\\Myfiles\\new.txt");
	}

}
