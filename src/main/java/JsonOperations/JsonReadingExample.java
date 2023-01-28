package JsonOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import lombok.ToString;

public class JsonReadingExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader("kaspar.json");
		Object parsedObject = jsonParser.parse(fileReader);
		JSONObject jsonObject =  (JSONObject) parsedObject;
		//String name = (String) jsonObject.get("Name");
		//String age =(String) jsonObject.get("Age");
		System.out.println("Name : " + jsonObject.get("Name") + ", Age : " + jsonObject.get("Age"));
		JSONArray array = (JSONArray) jsonObject.get("Special Feature");
		
		Iterator iterator = array.iterator();
		while(iterator.hasNext()) {
			System.out.println("Special Feature: " + iterator.next());
		}
	}

}
