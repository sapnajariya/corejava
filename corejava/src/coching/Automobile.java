package coching;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	public static final int NO_OF_GREARS=2;
	public Automobile()
	{
		System.out.println(" I am default");
	}
	public Automobile(String col,int spd)
	{
		color=col;
		speed=spd;
		System.out.println("param1"+" "+color+" "+" "+speed);
	}
	public Automobile(String c,int sped,String mak)
	{
		speed=sped;
		color=c;
		make=mak;
		System.out.println("param2"+" "+color+" "+" "+speed+" "+make);
	}
public static void main(String args[])
{

	Automobile am=new Automobile();
	Automobile am1=new Automobile("white",60);
	Automobile am2=new Automobile("blue",70,"Royal");
}
}
