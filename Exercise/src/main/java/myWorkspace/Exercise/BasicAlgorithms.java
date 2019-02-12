package myWorkspace.Exercise;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class BasicAlgorithms 
{
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
		System.out.println(map);
	}

	public static void reverse()
	{
		String name ="deepan";
		String rN ="";
		System.out.println(name.length());
		for(int i=name.length()-1;i>=0;i--)
		{
			rN = rN+name.charAt(i);
		}
		System.out.println("Reversed String is "+ rN);	
	}

	public static void removeDuplicates()
	{
		String name="deepan";
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
		//String newString =list.toString();
		System.out.println(newString);
		
	}

	public static void rearrange() 
	{
		String name="#d33p@k";
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
		System.out.println("output is ---->   "+alphabets+digits+specialChar);
	}

	public static void fibonacciSeries()
	{
		@SuppressWarnings("resource")
		Scanner read = new Scanner(System.in);
		System.out.println("Type the number for fibonacci");
		int limit = read.nextInt();
	    int first =0;
	    int second =1;
	    for(int i=0;i<=limit;i++)
	    {
	    	System.out.print(first +" + ");
	    	int sum=first+second;
	    	first=second;
	    	second=sum;
	    	
	    }
	}   
	
	public static void fibonacciSeriesTillNumber()
	{
		Scanner read = new Scanner(System.in);
		System.out.println("ebter the number");
		int limit=read.nextInt();
		int first=0;
		int second=1;
		while(first<=limit)
		{
			System.out.print(first + " + ");
			int sum = first+second;
			first=second;
			second=sum;
		}
	}

	public static void printDate_Time()
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());
		Date date = new Date();
		System.out.println(date.getDate());
		System.out.println(date.getDay());
	}
}
