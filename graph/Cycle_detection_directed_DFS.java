package graph;

import java.util.ArrayList;

public class Cycle_detection_directed_DFS {

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
 static boolean checkCycle(int node,  ArrayList<ArrayList<Integer>> adj, int vis[], int dfsVis[]) {
        vis[node] = 1; 
        dfsVis[node] = 1; 
        
        for(Integer it: adj.get(node)) {
            if(vis[it] == 0) {
                if(checkCycle(it, adj, vis, dfsVis) == true) {
                    return true; 
                }
            } else if(dfsVis[it] == 1) {
                return true; 
            }
        }
        dfsVis[node] = 0;
        return false; 
    }
    static boolean isCyclic(int N, ArrayList<ArrayList<Integer>> adj) {
        int vis[] = new int[N]; 
        int dfsVis[] = new int[N]; 
        
        for(int i = 0;i<N;i++) {
            if(vis[i] == 0) {
                if(checkCycle(i, adj, vis, dfsVis) == true) return true; 
            }
        }
        return false; 
    }
}
