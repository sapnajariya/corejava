package core4code14;

public class Prime {
	public static boolean Prinum(int num)
	{
		if(num<=1)
		{
			return false;
		}
		else if(num==2){
			return true;
		}
		else if(num%2==0) {
			return false;
		}
			
		for(int i=3;i<=num/2;i++)
		{
			
			if(num%i==0)
				return false;
			
		}
			return true;
		}
			
		
	
	

	public static void main(String[] args) {
		
		
		if(Prinum(19))
		{
			System.out.print("num is prime");
		}
		
		else {
			System.out.print("num is not prime");
		}
	}

}
