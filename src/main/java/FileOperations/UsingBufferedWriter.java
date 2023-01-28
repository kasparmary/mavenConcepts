package FileOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Easiest Way, performance wise better and widely used.
		
		String fileLocation="UsingBufferedWriter.txt";
		String content="Hello World!";
		
		FileWriter fileWriter = new FileWriter(fileLocation);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(content);
		bufferedWriter.close();
	}

}
