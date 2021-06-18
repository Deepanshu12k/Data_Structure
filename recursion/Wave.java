package recursion;

public class Wave {

	public static void main(String[] args) {
		  
    int[] m= {1,2,3,4,5,6,7,8,9,10};		
    int n=m.length;
    int start=0;
    int end=0;
    int sum=m[0];
    int s= 15;
    for(int i=1;i<=n;i++){
         // if sum less than s
        if(i<n){
            sum=sum+m[i];
        }
        System.out.println(start+" "+end);
      
        if(s==sum){
            end=i;
            }
   
        while(sum>s && start<i-1){
            sum=sum-m[start];
            start++;
        }
    }
    start=start-1;
    end=end-1;
         
	System.out.println(start+" "+end);
	}
}


//while (start < n-1 && end <= arr.length) {
//	if (currSum == target) {
//	end = end-1;          
//	}
//		if (end <= n - 1) {
//			currSum += arr[end];
//			end++;
//		}
//		if (currSum > target) {
//			currSum -= arr[start];
//			start++;
//		} else {
//			if (end <= n - 1) {
//				currSum += arr[end];
//				}
//			end++;
//		}