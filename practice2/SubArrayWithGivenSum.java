package practice2;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {1,2,3,7,5};
    int n =arr.length;
    int s =12;
    ArrayList<Integer> alist = subarraySum(n,s,arr);
    System.out.println("Ans:"+alist);
	}
	 static ArrayList<Integer> subarraySum(int n, int s, int[] arr) {
	        int first = 0;
	        int last = 0;
            long result = arr[first];
	        ArrayList<Integer> res = new ArrayList<Integer>();
	        
	        while(result != s) {
	            if (result > s) {
	            	 System.out.println("Number1");
	                if (first == last) {
	                    last++;
	                    first++;
	                    System.out.println("Number2");
	                    if (last >= n) break;
	                    result = arr[first];
	                    System.out.println("Number3");
	                } else {
	                    result -= arr[first];
	                    first++;
	                    System.out.println("Number4");
	                }
	            } else {
	                last++;
	                System.out.println("last:"+last+"Number5");
	                if (last < n) {
	                    result += arr[last];
	                    System.out.println("Number6:" + " result :"+result);
	                } else {
	                	 System.out.println("Number7");
	                    break;
	                }
	            }
	        }

	        if (result != s) {
	            res.add(-1);
	        } else {
	            res.add(first + 1);
	            res.add(last + 1);
	            
	        }
	        return res;   
	    }
}
