package JsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Name", "Kaspar");
		jsonObject.put("Age", "38");
		
		JSONArray arr = new JSONArray();
		arr.add("Beautiful");
		arr.add("Smart Lady");
		
		jsonObject.put("Special Feature", arr);
		//System.out.println(jsonObject);
		FileWriter fileWritter = new FileWriter("kaspar.json");
		fileWritter.write(jsonObject.toJSONString());
		fileWritter.close();
	}

}
