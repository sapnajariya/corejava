package StaDemo;

public class Example2 {
	int i,j,k;
	Example2(int i)
	{
		this.i=i;
		System.out.print("Example2(int)"+" "+i);
	}
	Example2()
	{
		
	}
	void test1()
	{
		System.out.print(i);
	}
	Example2(int j,int k)
	{
		this.j=j;
		this.k=k;
		System.out.println("Example2(int i,int k)"+" "+j+" "+k);
		
	}
	void test()
	{
		Example2 e=new Example2();
		e.test1();
		this.test1();
		System.out.print(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e1=new Example2(10);
		Example2 e2=new Example2(50);
		Example2 e3=new Example2(20,40);
		Example2 e4=new Example2(10,30);
		e1.test();
		
		
		
		
		
		
		
		
		
		
		

	}

}
