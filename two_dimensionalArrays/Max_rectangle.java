package two_dimensionalArrays;

import java.util.Stack;

public class Max_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[][] 	M = { {0, 1, 1 ,0},
		                  {1 ,1 ,1 ,1},
		                  {1 ,1, 1, 1},
		                 {1 ,1 ,0 ,0} };
	int n = M.length;
	int m= M[0].length;
	System.out.println(maxRectangle(M,n,m));
	}
	
static int maxRectangle(int[][] Mat,int n , int m) {
	int maxArea = 0;
	int area = 0;
	int[] b = new int[m];
	
	for(int i =0;i<n;i++) {
		for(int j=0;j<m;j++) {
			 if(Mat[i][j] == 0){
                 b[j] = 0;
             }else{
                 b[j] += Mat[i][j];
             }
         }
         area = Math.max(maxArea, maxHistogram(b));
         if(area > maxArea){
             maxArea = area;
         }
		}
	return maxArea;
}

static int maxHistogram(int[] hist){
	int n = hist.length;
    Stack<Integer> s = new Stack<>(); 
    int max_area = 0; 
    int tp; 
    int area_with_top; 
    int i = 0; 
    
    while (i < n) 
    { 
        // If this bar is higher than the bar on top stack, push it to stack 
  
        if (s.empty() || hist[s.peek()] <= hist[i]) { 
            s.push(i++); 
          	System.out.println("s.peek :"+s.peek());
          	System.out.println("i : "+i);
        // If this bar is lower than top of stack, then calculate area of rectangle  
        // with stack top as the smallest (or minimum height) bar. 'i' is  
        // 'right index' for the top and element before top in stack is 'left index' 
        }else{ 
         	System.out.println("i of else : "+i);
            tp = s.peek();  // store the top index 
            s.pop();  // pop the top 
            // Calculate the area with hist[tp] stack as smallest bar 
            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1); 
         	System.out.println("area_with_top : "+ area_with_top);
            // update max area, if needed 
            if (max_area < area_with_top) 
                max_area = area_with_top; 
        } 
    } 
   
    // Now pop the remaining bars from stack and calculate area with every 
    // popped bar as the smallest bar 
    while (s.empty() == false) 
    { 
        tp = s.peek(); 
        s.pop(); 
        area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1); 
   
        if (max_area < area_with_top) 
            max_area = area_with_top; 
    }
	return max_area; 
    
}
}
