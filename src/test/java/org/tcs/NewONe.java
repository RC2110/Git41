package org.tcs;

import java.io.File;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;


import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class NewONe {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File f = new File("C:\\Users\\rajaa\\eclipse-workspace\\ApiTesting\\src\\test\\resources\\dataValues.json");
		
	    ObjectMapper mapper = new ObjectMapper();
	    DataOne value = mapper.readValue(f, DataOne.class);
	    
	    String age = value.getAge();
	    String gender = value.getGender();
	    String name = value.getName();
	    
	    System.out.println(age);
	    System.out.println(gender);
	    System.out.println(name);
	    
	    }
	
}
