package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Swappy_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr = {471 ,470, 988, 108, 699, 727, 370, 304, 212};
//	    int[] arr= {101 ,758 ,315 ,730 ,472 ,619 ,460 ,479};
//		int[] arr= {1,5,4,3,2};
		 int n = arr.length;
  int count=0;int temp=0;
  Map<Integer,Integer> mp = new HashMap<Integer,Integer>(n);
	int[] k = new int[n];
	int j =0;
	
	for(int i=0;i<n;i++) {
		j=arr[i];
		k[i]=j;
    	mp.put(j, i);
    	System.out.println("j:"+j+""+" ,i:"+i);
	}
	
	Arrays.sort(k);
	int t =0;
	for(int i=0;i<n;i++) {
		if(k[i]!=arr[i]){
			    t=mp.get(k[i]);
			    System.out.println("mp: "+mp.get(k[i]));
	        	mp.replace(arr[i],t);    
//	        	System.out.println("arr:" + arr[i]+" , t:"+t);
//	        	System.out.println("k:" + k[i]+", i:"+i);
//	        	mp.replace(k[i],i);   // not needed becoz of for loop
//	        	System.out.println("k:" + k[i]+", i:"+i);
		        temp=arr[i];
		        arr[i]=arr[t];
		        arr[t]=temp;
//		        System.out.println("arr[i]:"+arr[i] + "  ,i: "+i+" ,t: "+t+" , arr[t]:"+arr[t]);
		        count++;
		}
	}
	for(int r : arr) {
		System.out.println(r);
	}
	System.out.println(count);
	}

}
