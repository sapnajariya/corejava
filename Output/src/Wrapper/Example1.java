package Wrapper;

public class Example1 {

	public static void main(String[] args) {
		int i=90;
		Integer i1=new Integer(80);
		Integer i2=new Integer("80");
		Integer i3=new Integer(i);
		Integer i4=Integer.valueOf(5000);
		Integer i5=Integer.valueOf("101010",2);
		Integer i6=Integer.valueOf("015",8);
		Integer i7=Integer.valueOf("b",16);
		System.out.print("i= "+i);
		System.out.print("i1= "+" " +i1);
		System.out.print("i2= "+" " +i2);
		System.out.print("i3= "+" " +i3);
		System.out.print("i4= "+" " +i4);
		System.out.print("i5= "+" " +i5);
		System.out.print("i6= "+" " +i6);
		System.out.print("i7= "+" " +i7);
		

	}

}
