package string;

public class StrChr {

	public static void main(String[] args) {
		char ch[]={'s','a','p','n','a'};
		String s=new String(ch);
		System.out.print(s);
		int[] uni_code = {31, 101, 101, 107, 115};
		String s1 = new String(uni_code,0,2);
		System.out.print(s1);

	}

}
