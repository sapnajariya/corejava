package core4code14;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121;
		int temp=0;
		int num1=num;
		int result=0;
		//System.out.print(num);
		while(num>0)
		{
			temp=num%10;
			num=num/10;
			result=(result*10)+temp;
			
			
		}
		if(num1==result)
		{
			System.out.print("num is palindrome");
		}
		else {
			System.out.print("num is  not palindrome");
			
		}
	}

}
