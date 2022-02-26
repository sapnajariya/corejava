package coching;

import java.io.IOException;

public class argcalulater {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("enter char");
int ch=System.in.read();
System.out.println("Ascii code"+" "+ch);
if(ch=='S'||ch=='s')
{
	Sub.main(args);
}
/*else if(ch=='m'||ch=='M')
	
{
 mul.main(args);	
}*/
else
{
	System.out.print("invalid choice");
}
	}
	

}
