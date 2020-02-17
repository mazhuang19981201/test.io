package demo.mail.test;

import java.io.IOException;

public class File {

	public static void main(String[] args) throws IOException{
		
		java.io.File file = new java.io.File("d:/","a.txt");
		
		file.createNewFile();
	
	}
}
