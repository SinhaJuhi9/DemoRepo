package qaClickAcademy.ExcelDriven;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

public class Screenshot {

    @Test
    public static void FileRead() throws IOException{
    	File file1 = new File("G:\\Juhi\\Eclipse_workspace\\AEaxacaeala\\src\\main\\java\\qaClickAcademy\\ExcelDriven\\ABC.txt");
    	FileReader fr = new FileReader(file1);
    	long length = file1.length( );  //Finding the number of characters in the xyz.txt file 
    	//Create a for loop to execute the read( ) method until the characters in the text file are completed
    	for(long i=0; i<length; i++)
    	 System.out.print((char) fr.read( ));  //Casting to characters and printing on the same line
    	fr.close();
    }
    
    @Test
    public static void FileWrite() throws IOException{
    	File file1 = new File("G:\\Juhi\\Eclipse_workspace\\AEaxacaeala\\src\\main\\java\\qaClickAcademy\\ExcelDriven\\ABC.txt");
    	FileWriter fw = new FileWriter(file1);
    	FileReader fr = new FileReader(file1);
    	fw.write("juhi How are you doing today?");
    	long length = file1.length( );  //Finding the number of characters in the xyz.txt file 

    	//Create a for loop to execute the read( ) method until the characters in the text file are completed

    	for(long i=0; i<length; i++)
    	fw.write("sf");  //Casting to characters and printing on the same line
    	fw.close();
    	fr.close();


    }

}