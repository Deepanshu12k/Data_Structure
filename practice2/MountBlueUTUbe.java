package practice2;

public class MountBlueUTUbe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		//just for checking condition 
		for(int i = 0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(i*8+j +"    ");
			}
			System.out.println();
		}
		
 String[] commands = {"right","up","down","left","down","down","right","right","down"};
 System.out.print("ans: ");
 System.out.print(solve(n,commands));
	}
	static int solve(int n,String[] cmds) {
	int ans = 0 ;
	 int i=0,j=0;
	
	for(String k : cmds) {
		if(k=="right" &&  j+1<n) {
		   j++;
		 }else if(k=="up" && i-1>=0) {
				i--;
		}else if(k=="left" &&  j-1>=0) {
		        j--;
		}else if(k=="down" && i+1<n) {
			i++;
		}
		ans = (i*n)+j;
	}
	
	return ans;	
	}

}
