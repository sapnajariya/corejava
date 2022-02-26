package StaDemo;

public class C {
	int i=10;
	C()
	{
		
	}
	C(int i)
	{
		this.i=i;
	}
	void test1(C c1)
	{
		System.out.print(c1.i);
	}
	void test()
	{
		C c2=new C();
		test1(c2);
		test1(this);
		System.out.print(this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c=new C(20);
c.test();
	}

}
