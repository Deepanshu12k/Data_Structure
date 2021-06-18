package practice;
import java.util.ArrayList;
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Abcdefghijklmnopqrstuvwxy";
//		ArrayList<Character> mv = new ArrayList<Character>();
        String line = str.toLowerCase();
        StringBuffer s = new StringBuffer(""); 

          for( char i = 'a';i<='z';i++){
              if(!line.contains(Character.toString(i))){
//                  mv.add(i);
            	  s.append(i);
                   }
          }
          String result = s.toString();
//String result = mv.toString();
         System.out.print(result);
	}

}
