package graph;

import java.util.ArrayList;
import java.util.Stack;

public class Topological_Sort_DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we have to manually set value of V
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
	static int[] topoSort(int N, ArrayList<ArrayList<Integer>> adj) {
        Stack<Integer> st = new Stack<Integer>(); 
        int vis[] = new int[N]; 
        
        for(int i = 0;i<N;i++) {
            if(vis[i] == 0) {
                findTopoSort(i, vis, adj, st);
            }
        }
        
        int topo[] = new int[N];
        int ind = 0; 
        while(!st.isEmpty()) {
            topo[ind++] = st.pop();
        }
        // for(int i = 0;i<N;i++) System.out.println(topo[i] + " "); 
        return topo; 
    }
	 static void findTopoSort(int node, int vis[], ArrayList<ArrayList<Integer>> adj, Stack<Integer> st) {
	        vis[node] = 1; 
	        for(Integer it: adj.get(node)) {
	            if(vis[it] == 0) {
	                findTopoSort(it, vis, adj, st); 
	            } 
	        }
	        st.push(node); 
	    }
}
