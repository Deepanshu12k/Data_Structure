package recursion;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[]  n = {1,2,4,4,5,5,6,6};
     int j=0;
     int r=0;
     for(int i=0;i<n.length-1;i++) {
    	 if(n[i]!=n[i+1]) {
    		 n[j]=n[i];
    		 j++;
 }else {
	 r=r+1;
 }
    	}
//     System.out.println("j="+j);
	 n[j++]=n[n.length-1];
	 int e = n.length-r;
     for(int k =0;k<e;k++) {
	System.out.println(n[k]);
     }
	
	}

}
