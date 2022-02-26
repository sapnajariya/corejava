package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EmployeeDate {

	public static void main(String[] args) throws ParseException {
		int count = 0;
		// TODO Auto-generated method stub
		String str = "23/04/1992";
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMyyyy");
		Date d1 = sdf.parse(str);
		Date str1 = sdf.parse(str);
		Calendar cal = Calendar.getInstance();
		if (d.after(d1)) {
			System.out.print("hello");
		} else {
			System.out.print("hi");
		}
	}
}
