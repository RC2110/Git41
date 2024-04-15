package org.tcs;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
public class ApiTuesday {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader f = new FileReader("C:\\Users\\rajaa\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\tuesday.json");
		
		JSONParser json = new JSONParser();
		Object object = json.parse(f);
		JSONObject obj = (JSONObject) object;
		Object object2 = obj.get("page");
		long i =(long)object2;
		System.out.println(i);
		Object object3 = obj.get("per_page");
		long i1 =(long)object3;
		System.out.println(i1);
		Object object4 = obj.get("total");
		long i2 =(long)object4;
		System.out.println(i2);
		Object object5 = obj.get("total_pages");
		long i3 =(long)object5;
		System.out.println(i3);
		Object object6 = obj.get("data");
		
		JSONArray array=(JSONArray)object6;
		
		
		for (int j = 0; j < array.size(); j++) {
			Object object7 = array.get(j);
			
			JSONObject obj1= (JSONObject)object7;
			Object object8 = obj1.get("id");
			long id =(long)object8;
			System.out.println(id);
			Object object9 = obj1.get("flightName");
			String fName =(String)object9;
			System.out.println(fName);
			Object object10 = obj1.get("Country");
			String country =(String)object10;
			System.out.println(country);
			Object object11 = obj1.get("Destinations");
			String dest =(String)object11;
			System.out.println(dest);
			Object object12 = obj1.get("URL");
			String url =(String)object12;
			System.out.println(url);	
		}
		Object lastOne = obj.get("support");
		JSONObject ob =(JSONObject)lastOne;
		Object object7 = ob.get("url");
		String s3 =(String)object7;
		System.out.println(s3);
		Object object8 = ob.get("text");
		String s4 =(String)object8;
		System.out.println(s4);
	}
}