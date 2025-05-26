package test.test;

import java.io.File;

public class folderActions {

	
		
		//create folder 
		
		public static void createFolder(String filePath)
		{
			File folder=new File(filePath);
			if(!folder.exists())
			{
				folder.mkdir();
				System.out.println("folder created ");
			}
		}
		
		//delete folder
		
		public static void deleteFolder(String filepath)
		{
			File folder=new File(filepath);
			if(folder.exists())
			{
				for(File file:folder.listFiles())
				{
					file.delete();
				}
				folder.delete();
			}
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			createFolder("G:\\Myfiles");
	}

}
