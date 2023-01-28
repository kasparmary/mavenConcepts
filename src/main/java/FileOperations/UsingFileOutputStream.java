package FileOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//For writing raw byte array information (eg: images)
		
		String fileLocation="UsingFileOutputStream.txt";
		String content="Java is inresting subject!";
		
		FileOutputStream outStream = new FileOutputStream(fileLocation);
		byte[] writeContent = content.getBytes();
		outStream.write(writeContent);
		outStream.close();
			
	}

}
