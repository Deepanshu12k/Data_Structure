package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_Graph_bfs {

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
	        		if(bfsCheck(adj, i, color)==false) {
	        			return false; 
	        		}
	        	}
	        }
	        return true; 
	    }
	 static boolean bfsCheck(ArrayList<ArrayList<Integer>> adj, int node, int color[]) {
			Queue<Integer> q = new LinkedList<>();
			q.add(node); 
			color[node] = 1; 
			while(!q.isEmpty()) {
				Integer nde = q.poll(); 

				for(Integer it: adj.get(nde)) {
					if(color[it] == -1) {
						color[it] = 1 - color[nde]; 
						q.add(it); 
					}
					else if(color[it] == color[nde]) {
						return false; 
					}
				}
			}
			return true; 
		}

}
