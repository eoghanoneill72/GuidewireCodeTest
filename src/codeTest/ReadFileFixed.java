package codeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * List Observations
 * File path not suitable for windows
 * Uninformative variable names
 * Uninformative Exception Thrown
 * try-with_resources auto closes
 */


public class ReadFileFixed {

	public ReadFileFixed(){
		
	}
	/**
	 * @param args
	 * Takes text file "C:/samplefile.txt" and prints to standard output 
	 */
	public static void main(String[] args) {
		ReadFileFixed part2 = new ReadFileFixed();
		System.out.println(part2.readFile());		
	}

	public String readFile(){
		File fileName = null;
		FileReader fileReader = null;
		StringBuffer content = null;
		
		try{
//			fileName = new File("c:/samplefile.txt");
			fileName = new File("C:\\sample\\samplefile.txt");
			//throws FileNotFoundException
			fileReader = new FileReader(fileName);
			
			int countCharactersRead;
			//While there are still more characters to be read
			while((countCharactersRead = fileReader.read()) != -1){				
				if(content == null){
					content = new StringBuffer();
				}
				
				content.append((char)countCharactersRead);
			}
			
			fileReader.close();			
		}
		catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
		catch (Exception e) {
			throw new RuntimeException("An error occured reading your file");
		}		
		
		return content.toString();
	}
}