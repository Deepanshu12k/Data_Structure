package data_Structure;

public class Asasdasda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "9 -10 -1 5 17 -18 6 19 -12 5 18 14 4 -19 11 8 -19 18 -20 14 8 -14 12 -12 16 -11 0 3 -19 16";
	String[] arr = s.split("\\s");
	int[] newArray=new int[arr.length];
	
	for (int i=0; i<arr.length; i++)
    {
		newArray[i] = Integer.parseInt(arr[i]);
    }
	int sum=0;
	
	for(int i:newArray) {
		System.out.print("sum: "+ sum + ",     Array: "+i);
		sum = sum+i;
		System.out.println(",     Sum= "+sum);
	}
	}

}
