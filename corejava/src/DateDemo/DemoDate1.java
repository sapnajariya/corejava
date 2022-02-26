package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sfd=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sfd1=new SimpleDateFormat("yyyy/MM/dd/hh:mm:ss");
		
		String str=sfd.format(d);
		String str1=sfd1.format(d);
		System.out.println(str+" "+str1);
		long ms=d.getTime();
		System.out.println(ms);
		Date d1=new Date(ms);
		
		System.out.println(d1);
		//if you want to 1 year back date
		long year=1*60*60*24*365*1000;
		Date d2=new Date(ms-year);
		System.out.println(d2);
		//5 year ahead
		Date d3=new Date(ms+(year*5));
		System.out.println(d3);
//ctr+shift+f:to organize import
		//total class import....ctr+shift+o
		String st="12/09/2020";
		Date d4=sfd.parse(st);
		System.out.print(d4);
		
	}

}
