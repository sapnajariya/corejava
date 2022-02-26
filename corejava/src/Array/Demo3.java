package Array;

public class Demo3 {

	public static void main(String[] args) {
		int max=0,min=1;
		int i;
		int arr[]={23,56,65,45,42,78,76};
		for( i=0;i<6;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
			
		}
		System.out.print("maximum  elements is"+max);
	}

}
