package core4code14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.setName("sapna");
		//p.setDob();
		String str="12/9/92";
		p.setAddress("mhow");
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/YY");
		 Date d=sd.parse(str);
		 p.setDob(d);
		 
		 System.out.println(p.getDob());
		System.out.println(p.getName());
		System.out.println(p.getAddress());

	}

}
