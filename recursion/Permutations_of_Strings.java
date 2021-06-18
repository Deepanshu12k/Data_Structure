package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Permutations_of_Strings {

	public static void main(String[] args) {
	String S = "ABC";
	 ArrayList<String> allPermutations = new ArrayList<String>();

	    Permutations(S, "", allPermutations);
	    Collections.sort(allPermutations); 
	    //this is to sort all the permutations lexicographically

	    System.out.println(allPermutations);
	}
  public static void Permutations(String input, String output, ArrayList<String> res){
		  if(input.length() == 0)
		  {
		  res.add(output);
		   return;
		   }

		  for(int i = 0; i < input.length(); i++)
		   {
		  Permutations(input.substring(0, i) + input.substring(i + 1), output +
		  input.charAt(i), res);
		   }
		 }

		}