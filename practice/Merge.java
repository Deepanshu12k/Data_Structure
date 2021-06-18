package practice;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1 ,3, 5, 7} ;
		int[]  arr2 = {0, 2, 6, 8, 9};
       int n = arr1.length; 
       int m=arr2.length;
       int temp=0;
       int i = 0;
       int j = 0;
       
     	int gap = n+m;
     	gap = nextGap(gap);
     	while(gap>0){
     	     
     	    while(i+gap>0){
     	    	if(i+1<n)
     	        if(arr1[i]>arr1[i+gap]){
     	          temp=arr1[i]; 
     	          arr1[i]=arr1[i+1];
     	          arr1[i+1] = temp;
     	          i++;
     	         j = Math.max(0,gap-n); 
     	        }
     	    }
     	    while(i<n && j < m){
     	        if(arr1[i]>arr2[j]){
     	            temp = arr1[i];
     	            arr1[i] = arr2[j];
     	            arr2[j] =temp;
     	            i++;
     	            j++;
     	        }
     	        while(j<m){
     	            j=0;
     	            while((j+gap) < m ){
     	                if(arr2[j] > arr2[j+gap]){
     	                    temp = arr2[j];
     	                    arr2[j] = arr2[j+gap];
     	                    arr2[j+gap] = temp;
     	                    j++;
     	                }
     	            }
     	        }
     	        gap = nextGap(gap);
     	    }
     	}

	for(int t=0;t<n;t++){
	System.out.print(arr1[t]);
	}
	
	for(int t=0;t<m;t++){
		System.out.println(arr2[t]);
		}
	
	}
static int nextGap(int gap ){
    if(gap <= 1){
        return 0;
    }
    return ((gap+1)/2);
}

}
