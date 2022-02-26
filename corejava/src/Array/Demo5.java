package Array;

public class Demo5 {
public static void main(String[] args)
{
	int arr[][]=new int [10][2];
	arr[0][0]=2;
	arr[1][0]=4;
	arr[2][0]=6;
	arr[3][0]=8;
	arr[4][0]=10;
	arr[5][0]=12;
	arr[6][0]=14;
	arr[7][0]=16;
	arr[8][0]=18;
	arr[9][0]=20;
	arr[0][1]=3;
	arr[1][1]=6;
	arr[2][1]=9;
	arr[3][1]=12;
	arr[4][1]=15;
	arr[5][1]=18;
	arr[6][1]=21;
	arr[7][1]=24;
	arr[8][1]=27;
	arr[9][1]=30;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
			
	}
}