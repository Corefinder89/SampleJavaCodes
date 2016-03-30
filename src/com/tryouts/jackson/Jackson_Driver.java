package com.tryouts.jackson;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Jackson_Driver 
{
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException
	{
		//Parse JSON data using Jackson from a URL
		try 
		{
			URL jsonurl = new URL("https://gist.githubusercontent.com/SoumyajitBasu1988/1852b3a16d390f68ab76/raw/8cade41c049b65a5626328ae71a009d8cb9ffbe9/User.json");
			ObjectMapper mapper = new ObjectMapper();
			
			GetUserInfo user = null;
			user = mapper.readValue(jsonurl,GetUserInfo.class);
			
			System.out.println("Get user data from URL");
			System.out.println("----------------------");
			System.out.println("First Name: " + user.getName().getFirst());
			System.out.println("Last Name: " + user.getName().getLast());
			System.out.println("Gender: " + user.getGender());
			System.out.println("Verification: " + user.getVerified());
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("\n");
		
		//Parse JSON data using Jackson from file
		File jsonfile = new File("/Users/soumyajit/Documents/DevOps/Dummy_Tryouts/src/com/tryouts/jackson/User.json");
		GetUserInfo info = null;
		ObjectMapper mapper = new ObjectMapper();
		
		info = mapper.readValue(jsonfile,GetUserInfo.class);
		
		System.out.println("Get JSON data from File");
		System.out.println("-----------------------");
		System.out.println("First Name: " + info.getName().getFirst());
		System.out.println("Last Name: " + info.getName().getLast());
		System.out.println("Gender: " + info.getGender());
		System.out.println("Verification: " + info.getVerified());
	}
}
