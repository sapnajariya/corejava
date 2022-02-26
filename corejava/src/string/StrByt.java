package string;

import java.nio.charset.Charset;

public class StrByt {

	public static void main(String[] args) {
		byte[] b_arr = {71, 101, 101, 107, 115};
		String s_byte =new String(b_arr); //Geeks
		String s1_byte =new String(b_arr,1,4);
		Charset cs=Charset.defaultCharset();
		String s_byte1 =new String(b_arr,cs);
   System.out.print(s_byte+""+s1_byte+" "+s_byte1);
	}

}
