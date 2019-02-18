package myWorkspace.Exercise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.aventstack.extentreports.Status;

import myWorkspace.Framework.Reporter;

public class BasicAlgorithms
{
	/*public static void main(String[] args)
	{
		frequencyOfCharacters();
	}*/
	public static void frequencyOfCharacters()
	{
		String name = "ahbdjkjvvnvvnvbfsbvbbf";
		int count =1;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<name.length();i++)
		{
			if(map.containsKey(name.charAt(i)))
			{
				int value = map.get(name.charAt(i));
				map.put(name.charAt(i), value+1);
			}
			else
			{
				map.put(name.charAt(i), count);
			}
		}
		Reporter.test.log(Status.INFO, map.toString());
		Reporter.test.log(Status.PASS, "passed");
		
	}

	public static void reverse()
	{
		String name ="deepan";
		String rN ="";
		Reporter.test.log(Status.INFO,"lenfth od string is "+name.length());
		for(int i=name.length()-1;i>=0;i--)
		{
			rN = rN+name.charAt(i);
		}
		Reporter.test.log(Status.INFO, "Reversed String is "+rN);
		Reporter.test.log(Status.PASS, "passed");
	}

	public static void removeDuplicates()
	{
		String name="deepan";
		Reporter.test.log(Status.INFO, "String to be processed is  "+ name);
		//HashSet<Character> set = new HashSet<>();
		ArrayList<Character> list = new ArrayList<Character>();
		String newString="";
		for(int i=0;i<name.length();i++)
		{
			if(!list.contains(name.charAt(i)))
			{
			list.add(name.charAt(i));
			newString=newString+name.charAt(i);
			}
		}
		
		Reporter.test.log(Status.INFO, "Prossed string is "+ newString);
		Reporter.test.log(Status.PASS, "passed");
		
	}

	public static void rearrange() 
	{
		String name="#d33p@k";
		Reporter.test.log(Status.INFO, "String to be processed is  "+ name);
		String alphabets="";
		String digits="";
		String specialChar="";
		for(int i=0;i<name.length();i++) 
		{
			if(Character.isAlphabetic(name.charAt(i)))
			{
				alphabets=alphabets+name.charAt(i);
		}
			else if(Character.isDigit(name.charAt(i)))
			{
				digits=digits+name.charAt(i);
			}
			else
			{
				specialChar=specialChar+name.charAt(i);
			}
		}
		Reporter.test.log(Status.INFO, "Prossed string is "+ alphabets+digits+specialChar);
		Reporter.test.log(Status.PASS, "passed");
	}

	public static void fibonacciSeries()
	{
		//@SuppressWarnings("resource")
	/*	Scanner read = new Scanner(System.in);
		System.out.println("Type the number for fibonacci");
		int limit = read.nextInt();*/
		int limit =10;
	    int first =0;
	    int second =1;
	    for(int i=0;i<=limit;i++)
	    {
	    	Reporter.test.log(Status.INFO, first +" + ");
	    	int sum=first+second;
	    	first=second;
	    	second=sum;
	    	
	    }
	}   
	
	public static void fibonacciSeriesTillNumber()
	{
		/*Scanner read = new Scanner(System.in);
		System.out.println("ebter the number");*/
		int limit=20;
		int first=0;
		int second=1;
		while(first<=limit)
		{
			
			Reporter.test.log(Status.INFO, first +" + ");
			int sum = first+second;
			first=second;
			second=sum;
		}
	}

	@SuppressWarnings("deprecation")
	public static void printDate_Time()
	{
		Calendar cal = Calendar.getInstance();
		Reporter.test.log(Status.INFO, "current time "+ cal.getTime().toString());
		Reporter.test.log(Status.INFO, "current time zone "+cal.getTimeZone().toString());
		Date date = new Date();
		Reporter.test.log(Status.INFO, "current date "+ date.getDate());
		Reporter.test.log(Status.INFO, "current day "+ date.getDay());
	}
}
