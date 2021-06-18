package recursion;

public class Maximum_Subset_XOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] set = {2,4,5};
 System.out.println("Final Answer :"+maxSubarrayXOR(set,set.length));
	}
	public static int maxSubarrayXOR(int set[], int n)
    {
         return XOR(set,0,n,0);
    }
	static int XOR(int[] set,int a, int n,int i){
        if(i==n){
        return a;
        }
           System.out.println("value of i :"+i + " Before first");
           System.out.println("a :"+a);
           int FirstXor = XOR(set,a^set[i],n,i+1);
           System.out.println("FirstXor :"+FirstXor);
           
           System.out.println("Value of i  :"+i + " before second");
           System.out.println("a :"+a);
           int SecondXor= XOR(set,a,n,i+1);
           System.out.println("SecondXor :"+FirstXor);
           
           return Math.max(FirstXor,SecondXor);
	}
	
}
