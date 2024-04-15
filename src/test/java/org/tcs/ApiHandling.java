package org.tcs;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class ApiHandling {
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader f = new FileReader("C:\\Users\\rajaa\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\data.json");
		
		JSONParser json = new JSONParser();
		Object object = json.parse(f);
		JSONObject o = (JSONObject)object;
		Object object4 = o.get("name");
		String s1 = (String)object4;
		System.out.println(s1);
		Object object2 = o.get("address");
		JSONObject o1 = (JSONObject)object2;
		Object object3 = o1.get("zipcode");
		long s = (long)object3;
		System.out.println(s);
	
	}
}
