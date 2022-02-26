package core4code14;

public class ConsecutiveEvnOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sum1=0,count=0,count1=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
				count++;
			}
			
			else
			{
				sum1=sum1+i;
				count1++;
			}
			
		}
		System.out.println("sum of even num"+" "+sum+" "+"total num of even num"+" "+count);
		System.out.print("sum of odd num"+" "+sum1+" "+"total num of odd num"+" "+count);
	}

}
