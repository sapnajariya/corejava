package Array;

public class Demo4 {

	public static void main(String[] args) {
		int min,secound ,max=0;
		
	int arr[]={67,23,43,21,12,9,5,0};
	min=arr[0];
	secound=Integer.MIN_VALUE;
	for(int i=0;i<=7;i++)
	{
		if(arr[i]<min)
		{
			min=arr[i];
			
	}
		
	
		 if (arr[i] > max) 
         { 
             secound = max; 
             max = arr[i]; 
         } 
    
         /* If arr[i] is in between first and  
            second then update second  */
         else if (arr[i] > secound && arr[i] != max) 
             secound = arr[i]; 
     } 
       
     if (secound == Integer.MIN_VALUE) 
          System.out.print("There is no second largest"+ 
                              " element\n"); 
     else
          System.out.print("The second largest element"+ 
                                   " is "+ secound+" "+min); 
     
 } 


	
}



