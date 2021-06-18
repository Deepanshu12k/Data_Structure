package data_Structure;

public class SinglyLinkedList {
	public static void main(String[] args) {
	int[]  array = {3,6,1,9};
    int n = array.length;
     int j =0,i=n-1;
  
     int count=0;
     int temp =0;
     
     while( j<n){
    	 if(i==j) {
    		 j++;
    	   }
    	 if(i!=j) {
      temp = array[j]+array[i];
    	i--;
    	 }
        if(temp%3!=0){
            count++;
             break;
         }
           if(i==0){
                    i=n-1;
                   j++;
             }
       
     }
   if(count>0){
     System.out.println("Yes");
   }else{
     System.out.println("No");
   }
   
}
}