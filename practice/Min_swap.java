package practice;

import java.util.Arrays;

public class Min_swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    int[] arr= {8,9,16,15};
//    int[] arr= {101 ,758 ,315 ,730 ,472 ,619 ,460 ,479};
//		int[]  arr = {471 ,470, 988, 108, 699, 727, 370, 304, 212};
		int[] arr= {1,5,4,3,2};
		 int n = arr.length;
	int min  = 1;
	int max = n;
	int[] countArr = new int[n];
	
	for(int i = 0; i<n;i++) {
		
		countArr[arr[i] - min]++;
//		System.out.println(arr[i] - min);
	 }
	int j=0;
	for(int i =min;i<=max;i++) {

		while(countArr[i-min] > 0) {
			arr[j++]=i;
			System.out.println(countArr[i-min]);
			countArr[i-min]--;
		}
	}
	
	for(int r:arr) {
    	System.out.println("arr:"+r+" ");
    }
   
	}

}
