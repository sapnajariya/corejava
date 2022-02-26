package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDate {

	public static void main(String[] args)throws ParseException {
		Date d=new Date();
		System.out.println(d);
		long ms=d.getTime();
		String str="12/3/90";
		String str1="22/4/2020";
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		Date d3=sd.parse(str);
		Date d4=sd.parse(str1);
		System.out.println(d3+" "+" "+d4);
		if(d3.getTime()>d4.getTime())
		{
			System.out.println("Current date is greater");
		}
		else 
		{
			System.out.println("privious date is greater");
		}
		if(d3.getTime()>d4.getTime())
		{
			System.out.println("Current date is greater");
		}
		else 
		{
			System.out.println("privious date is greater");
		}
		if(d3.after(d4))
		{
			System.out.println("hello");
		}
		else 
		{
			System.out.println("hi");
		}
		// TODO Auto-generated method stub

	}

}
