package com.tryouts.jackson;
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
		try 
		{
			URL jsonurl = new URL("https://gist.githubusercontent.com/SoumyajitBasu1988/1852b3a16d390f68ab76/raw/8cade41c049b65a5626328ae71a009d8cb9ffbe9/User.json");
			ObjectMapper mapper = new ObjectMapper();
			
			GetUserInfo user = null;
			user = mapper.readValue(jsonurl,GetUserInfo.class);
			
			System.out.println("First Name: " + user.getName().getFirst());
			System.out.println("Last Name: " + user.getName().getLast());
			System.out.println("Gender: " + user.getGender());
			System.out.println("Verification: " + user.getVerified());
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
	}
}
