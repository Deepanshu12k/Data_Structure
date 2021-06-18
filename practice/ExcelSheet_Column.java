package practice;

public class ExcelSheet_Column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int columnNumber = 51 ;
		StringBuilder columnName = new StringBuilder(); 
		  
        while (columnNumber > 0) { 
            // Find remainder 
            int rem = columnNumber % 26; 
  System.out.println(rem);
            // If remainder is 0, then a 
            // 'Z' must be there in output 
            if (rem == 0) { 
                columnName.append("Z"); 
//                System.out.println(columnName);
                int div = columnNumber/26;
                columnNumber = div - 1; 
                System.out.println(div);
            } 
            else // If remainder is non-zero 
            { 
                columnName.append((char)((rem - 1) + 'A')); 
                System.out.println(columnName);
                columnNumber = columnNumber / 26; 
            } 
        } 
  
        // Reverse the string and print result 
        System.out.println(columnName.reverse()); 
        System.out.println();
	}

}
