package FileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String location="UsingBufferedWriter.txt";
		
		FileReader reader = new FileReader(location);
		BufferedReader buffReader = new BufferedReader(reader);
		
		String currentLine;
		
		while((currentLine=buffReader.readLine())!=null) {
			System.out.println(currentLine);
		}
	}

}
