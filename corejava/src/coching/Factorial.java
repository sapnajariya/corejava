package coching;

public class Factorial {
	public static int Fact(int n)
	{
		
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=res*i;
			
			
			
		}
		
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
 int r=Fact(9);
System.out.print(r);
	}

}
