package org.tcs;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;

public class ApiHandleNew {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader f = new FileReader("C:\\Users\\rajaa\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\newdata.json");
		JSONParser json = new JSONParser();
		Object object = json.parse(f);
		JSONObject obj = (JSONObject)object;
		Object object2 = obj.get("data");
		JSONObject object3 = (JSONObject)object2;
		Object object4 = object3.get("id");
		long s = (long)object4;
		Object object5 = object3.get("flightName");
		String s1 = (String)object5;
		Object object6 = object3.get("Country");
		String s2 = (String)object6;
		Object object7 = object3.get("Destinations");
		String s3 = (String)object7;
		Object object8 = object3.get("URL");
		String s4 = (String)object8;
		Object object10 = object3.get("Created_Date");
		String s5 = (String)object10;
		Object object11 = object3.get("Updated_Date");
		String s6 = (String)object11;
		
		Object object9 = obj.get("support");
		JSONObject obj1= (JSONObject)object9;
		Object object12 = obj1.get("url");
		String s7 = (String)object12;
		Object object13 = obj1.get("text");
		String s8 = (String)object13;
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
	}
		
		
		
		
		
	}


