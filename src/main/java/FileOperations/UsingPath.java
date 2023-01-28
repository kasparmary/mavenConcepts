package FileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//From java  version: 7 on words - Path Interface
		//For writing raw byte array information (eg: images)
		
		String fileLocation="UsingPath.txt";
		String content="Learning is fun, enjoy and study!";
		
		Path path = Paths.get(fileLocation);
		Files.write(path, content.getBytes());		
	}

}
