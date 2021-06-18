package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//Also known as kahn's alogrithm 
public class Cycle_detection_directed_BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int V = 7;
			ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
			for (int i = 0; i <= V; i++) { 
				adj.add(new ArrayList<Integer>());
			}
			adj.get(0).add(1);
			adj.get(1).add(2);         
		    adj.get(2).add(3);
		    adj.get(3).add(4);
		    adj.get(4).add(5);
			adj.get(5).add(6);
			adj.get(6).add(3);
			
			boolean check =  isCyclic(V,adj);
			System.out.print("Graph is cyclic?"+"\n"+check);
	}
	 public static boolean isCyclic(int N, ArrayList<ArrayList<Integer>> adj) {
	        int indegree[] = new int[N]; 
	        for(int i = 0;i<N;i++) {
	            for(Integer it: adj.get(i)) {
	                indegree[it]++; 
	            }
	        }
	        
	        Queue<Integer> q = new LinkedList<Integer>(); 
	        for(int i = 0;i<N;i++) {
	            if(indegree[i] == 0) {
	                q.add(i); 
	            }
	        }
	        int cnt = 0;
	        while(!q.isEmpty()) {
	            Integer node = q.poll(); 
	            cnt++; 
	            for(Integer it: adj.get(node)) {
	                indegree[it]--; 
	                if(indegree[it] == 0) {
	                    q.add(it); 
	                }
	            }
	        }
	        if(cnt == N) return false; 
	        return true; 
	    }
}
