package StaDemo;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="foo and boo";
		String []s2=s1.split(" ");
		System.out.println(s2);
		for(String s:s2)
		{
		
			StringBuffer s3 =new StringBuffer(s);
			System.out.print(s3.reverse()+" ");
		}

	}

}
