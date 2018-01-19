package codeTest;

import java.io.File;
import java.io.FileReader;


public class CodeTestExerciseBadCode {

	public CodeTestExerciseBadCode(){
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CodeTestExerciseBadCode part2 = new CodeTestExerciseBadCode();
		System.out.println(part2.readFile());		
	}

	public String readFile(){
		File f = null;
		FileReader fr = null;
		StringBuffer content = null;
		try{
			f = new File("c:/samplefile.txt");
			fr = new FileReader(f);
			
			int c;			
			while((c = fr.read()) != -1){				
				if(content == null){
					content = new StringBuffer();
				}
				
				content.append((char)c);
			}
			
			fr.close();			
		}
		catch (Exception e) {
			throw new RuntimeException("An error occured reading your file");
		}		
		
		return content.toString();
	}
}
