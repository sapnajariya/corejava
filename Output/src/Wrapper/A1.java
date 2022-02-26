package Wrapper;

public interface A1 {

	void test();
	
		
	}
 class A implements A1
{
	public void test()
	{
		System.out.println("hello");
		
	}
	public static void main(String []args)
	{
		A a=new A();
		a.test();
	}
}
