package com.simplilearn.project.locked.me;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMe {

	public static void main(String[] args) throws IOException {
		
		String myDirectory =  "C://TempFolder/";
		File allDirectoryFiles = new File(myDirectory);
		
		File[] allFiles = allDirectoryFiles.listFiles();
		int userInput;
		System.out.println("\nApplication Name = LockedMe");
		System.out.println("\nDeveloper Name = Tushar Panigrahi");
		
		Scanner getUserInput = new Scanner(System.in);
		while (true)
		{
		System.out.println("\n----Please provide input for file operations----");
		System.out.println("\n1. List Files\n2. Add a File\n3. Delete a File\n4. Search a File\n5. Main Menu\n6. Exit Program\n");
		userInput=getUserInput.nextInt();
		//getUserInput.close();
		
		 if (userInput==1)
			{
			 	System.out.println("\nYou have entered: " +userInput +": Sort all files. Hence, displaying all the files in sorted order \n");
			 	//Displaying in ascending order
			 	Arrays.sort(allFiles);
			 	System.out.println("\nDisplaying all the files in sorted order : \n");
				for (File file : allFiles) 
				{
				System.out.println(file.getName());
			    }
		    }else if (userInput==2)
		    {
		    	String filename;
				Scanner scan = new Scanner(System.in);	      
				System.out.println("\nYou have entered: " +userInput +" : Add a file. Please provide the file name to be added. \n");
				filename = scan.nextLine();
				File file = new File(myDirectory+filename);
				String fileContents= "This is the content of the file: "+filename;
				FileOutputStream fos = new FileOutputStream(file);
				fos.write(fileContents.getBytes());
				fos.close();
				System.out.println("\nThe new file has been added, thank you");
				//scan.close();
		    }else if (userInput==3)
		    {
		    	String filename;
			    Scanner scan = new Scanner(System.in);	      
			    System.out.print("Enter the Name of File to Delete: ");
			    filename = scan.nextLine();
			    File myfile = new File(myDirectory+filename);
			    System.out.println(myfile);
			    if (myfile.delete())
			    	System.out.println("\nThe file is deleted successfully!");
			    else
			         System.out.println("\nSomething went wrong!");
			 }else if (userInput==4)
		    {
		    	String filename;
			    Scanner scan = new Scanner(System.in);	      
			    System.out.print("\nEnter the name of file to search: " +userInput +": Search a file\n" );
			    filename = scan.nextLine();
			    //scan.close();
			    File myfile = new File(myDirectory+filename);
			    System.out.println("\nYou are searching for this file: " +myfile);
			    if (myfile.exists())
			    	System.out.println("\nThe file " +myfile +" is present");
			    else
			    	System.out.println("\nThe file " +myfile +" is NOT present");
		    }else if (userInput==5)
		    {
		    	System.out.println("Main Menu");
		    }else if (userInput==6)
		    {
		    	System.out.println("You have entered: " +userInput +": Exiting the program \n Exiting...\n\n" );
		    	break;
		    }
	}
 }
}
