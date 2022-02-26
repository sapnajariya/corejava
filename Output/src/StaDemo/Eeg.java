package StaDemo;

public class Eeg {
	int i;
	static int j;
	void test()
	{
		System.out.print(i);
	}
	static void test1()
	{
		System.out.print(j);
	} 



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eeg e=new Eeg();
		System.out.print(e.i);
		e.test();
		e.test1();
	

	}

}
