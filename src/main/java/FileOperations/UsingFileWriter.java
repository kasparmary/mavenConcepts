package FileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Straight forward, direct interaction with files, less performance
		
		String fileLocation="UsingFileWriter.txt";
		String content="Java is simple language once you understand!";
		
		FileWriter fileWriter = new FileWriter(fileLocation);
		fileWriter.write(content);
		fileWriter.close();
	}

}
