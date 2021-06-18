package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_sort_bfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int V = 6;
			ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
			for (int i = 0; i <= V; i++) { 
				adj.add(new ArrayList<Integer>());
			}
			adj.get(5).add(2);
			adj.get(5).add(0);         
		    adj.get(4).add(0);
		    adj.get(4).add(1);
		    adj.get(2).add(3);
			adj.get(3).add(1);
			
		 
		int[] check =  topoSort(V,adj);
			
			for(int i:check)
			System.out.print(i);
	}
	 public static int []topoSort(int N, ArrayList<ArrayList<Integer>> adj) {
	        int topo[] = new int[N]; 
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
	            topo[cnt++]=node; 
	            for(Integer it: adj.get(node)) {
	                indegree[it]--; 
	                if(indegree[it] == 0) {
	                    q.add(it); 
	                }
	            }
	        }
	       
	        return topo;
	    }
}
