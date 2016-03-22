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
		String inline = "";
	
		try
		{
			URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?address=chicago&sensor=false&#8221");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			System.out.println("Response code is: " +responsecode);
			if(responsecode != 200)
				throw new RuntimeException("HttpResponseCode: " +responsecode);
			else
			{
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext())
				{
					inline+=sc.nextLine();
				}
				System.out.println("\nJSON Response in String format"); 
				System.out.println(inline);
				sc.close();
			}
			JSONParser parse = new JSONParser();
			JSONObject jobj = (JSONObject)parse.parse(inline);
			JSONArray arr = (JSONArray) jobj.get("results");
			for(int i=0;i<arr.size();i++)
			{
				JSONObject obj = (JSONObject)arr.get(i);
				System.out.println("\nPlace id: " +obj.get("place_id"));
				System.out.println("Types: " +obj.get("types"));
			}
			conn.disconnect();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}