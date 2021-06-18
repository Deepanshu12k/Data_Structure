package global_Coding_Challenge;

public class Max_Profit_Extended {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //int[] arr =  {5 ,1 ,6 ,3 ,2 ,5 ,6 ,1 ,3, 6, 2, 5 ,5 ,10};
     int[] arr = {100 ,10 ,12 ,5 ,6 ,14 ,5 ,6};
		   int sell =0;
		   int buy = 0;
		   int sum = 0 ;
		   int max=0;
		   
		   while(  sell<arr.length && buy < arr.length  ) {
			   sell++;
			   max=0;
			   while( sell<arr.length && arr[buy]<arr[sell] ) {
				   if(max<arr[sell]-arr[buy]) {
					   max=arr[sell]-arr[buy];
				   }else {
					   break;
				   }
				  sell++;
				}
			 
			    sum=sum+max;
			   buy=sell;
		 }
		   System.out.println(sum);
	}

}
