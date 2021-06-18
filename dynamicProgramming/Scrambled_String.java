package dynamicProgramming;
import java.util.HashMap;
public class Scrambled_String {
static HashMap<String,Boolean> map= new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       String S1 = "great" , S2 = "rgeat";
		String S1="abcde" , S2="caebd"; 
		
       if (isScramble(S1, S2))
       {
           System.out.println("Yes");
       }
       else
       {
           System.out.println("No");
       }
	}
	
	static boolean isScramble(String a, String b ) {
		if(a.compareTo(b)==0) {
			return true;
		}
		if(a.length()<=0) {
			return false;
		}
		String key = a+" "+b;
		if(map.containsKey(key)) {
			return map.get(key);
		}
		int n  = a.length(); 
		boolean flag = false;
		for(int i=1;i<n;i++) {
			 if (isScramble(a.substring(0, i),
                     b.substring(0, i)) &&
          isScramble(a.substring(i, n),
                     b.substring(i, n)))
      {
          return true;
      }

      // Check if S2[0...i] is a scrambled
      // string of S1[n-i...n] and S2[i+1...n]
      // is a scramble string of S1[0...n-i-1]
      if (isScramble(a.substring(n - i, n),
                     b.substring(0, i)) &&
          isScramble(a.substring(0, n - i),
                     b.substring(i, n)))
      {
          return true;
      }
		}
		map.put(key,flag);
		
		return flag;
	}

}
