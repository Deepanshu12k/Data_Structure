package graph;

import java.util.ArrayList;

public class Bipartite_Graph_Dfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int V = 4; 
				ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
				for (int i = 0; i <= V; i++) { 
					adj.add(new ArrayList<Integer>());
				}
				adj.get(0).add(1);
				adj.get(1).add(0);
				adj.get(0).add(2);         
			    adj.get(2).add(0);
			    adj.get(1).add(3);
			    adj.get(3).add(1);
				adj.get(2).add(3);
				adj.get(3).add(2);
				
				boolean check =  checkBipartite(adj,V);
				System.out.print("Graph is Bipartite?"+"\n"+check);
	}

    static boolean checkBipartite(ArrayList<ArrayList<Integer>> adj, int n)
    {
        int color[] = new int[n];
        for(int i = 0;i<n;i++) {
        	color[i] = -1; 
        }
        for(int i = 0;i<n;i++) {
        	if(color[i] == -1) {
        		if(dfsCheck(adj, i, color)==false) {
        			return false; 
        		}
        	}
        }
        return true; 
    }
   static  boolean dfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int color[]) {
	   if(color[node]==-1) color[node] = 1;
		for(Integer it: adj.get(node)) {
			if(color[it] == -1) {
				color[it] = 1 - color[node]; 
				if(dfsCheck(adj, it, color)==false) 
					return false; 
			}
			else if(color[it] == color[node]) {
				return false; 
			}
		}
		return true; 
	}
}
