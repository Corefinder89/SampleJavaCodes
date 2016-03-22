import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
class Dummy1
{
	public static void main(String [] args)
	{
		//inline will store the JSON data streamed in string format
		String inline = "";
	
		try
		{
			URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false&#8221");
			//Parse URL into HttpURLConnection in order to open the connection in order to get the JSON data
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			//Set the request to GET or POST as per the requirements
			conn.setRequestMethod("GET");
			//Use the connect method to create the connection bridge
			conn.connect();
			//Get the response status of the Rest API
			int responsecode = conn.getResponseCode();
			System.out.println("Response code is: " +responsecode);
			//Iterating condition to if response code is not 200 then throw a runtime exception
			//else continue the actual process of getting the JSON data
			if(responsecode != 200)
				throw new RuntimeException("HttpResponseCode: " +responsecode);
			else
			{
				//Scanner functionality will read the JSON data from the stream
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())
				{
					inline+=sc.nextLine();
				}
				System.out.println("\nJSON Response in String format"); 
				System.out.println(inline);
				//Close the stream when reading the data has been finished
				sc.close();
			}
			//Parse the JSON data present in the string format
			JSONParser parse = new JSONParser();
			//Type caste the parsed json data in json object
			JSONObject jobj = (JSONObject)parse.parse(inline);
			//Store the JSON object in JSON array as objects
			JSONArray arr = (JSONArray) jobj.get("results");
			for(int i=0;i<arr.size();i++)
			{
				//Store the JSON array object as a JSONObject
				//Get the index of the JSON object and print the values
				JSONObject obj = (JSONObject)arr.get(i);
				System.out.println("\nPlace id: " +obj.get("place_id"));
				System.out.println("Types: " +obj.get("types"));
			}
			//Disconnect the HttpURLConnection stream
			conn.disconnect();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}