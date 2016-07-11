/*
 * Case Study-1: Write a program to count the occurrence of particular alphabets within a string.
 * The substring will be taken on the basis of input argument. For example the user will be asked to enter
 * the alphabets that needs to be searched and on that basis the program will give the count of the alphabets present
 * within the string  
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Iterate
{
	public void iterate_string(String arguement1,int arguement2)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arguement3="";
		try
		{
			int parameters=0;
			while(parameters<arguement2)
			{
				//Enter the substring to check
				System.out.print("Enter substring["+parameters+"]: ");
				arguement3 = br.readLine();
				//Convert the string into character array
				char[] charArray1 = arguement1.toCharArray();
				char[] charArray2 = arguement3.toCharArray();
				int count = 0;
				/*
				 * Apply loop to iterate through the character array charArray1
				 * Apply loop to iterate through the character array charArray2
				 * Apply if condition to check if character of charArray1 is present in character array charArray2
				 */
				for(int i=0;i<charArray1.length;i++)
				{
					for(int j=0;j<charArray2.length;j++)
					{
						if(charArray1[i] == charArray2[j])
						{
							count++;
						}
						else
							break;
					}
				}

				System.out.println(arguement3+"--"+count);
				parameters++;
			}
			System.out.println("End of Iteration --");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
class Evaluate_String
{
	public static void main(String [] args)
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//Take the required string as an input
			System.out.print("Enter the String: ");
			String arguement1 = br.readLine();
			
			//Take input the number of substring you want to check
			System.out.print("Enter the number of substring you want to check: ");
			int arguement2 = Integer.parseInt(br.readLine());
			
			Iterate itr = new Iterate();
			itr.iterate_string(arguement1,arguement2);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}