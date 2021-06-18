package graph;

import java.util.ArrayList;

public class DepthFirstSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 4; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
		for (int i = 0; i <= V; i++) { 
			adj.add(new ArrayList<Integer>());
		}
		adj.get(0).add(1);          //adj.get(u).add(v);
		adj.get(0).add(2);         //adj.get(v).add(u);
		adj.get(1).add(2);
		adj.get(2).add(0);
		adj.get(2).add(3);
		adj.get(3).add(3);
		
		ArrayList<Integer> list =  dfsOfGraph(V,adj);
		System.out.print(list.toString());
	}
	 public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
	    {
	    ArrayList<Integer> al = new ArrayList<>();
	        boolean[] visited = new boolean[V];
	        dfs(0,visited,al,adj);
	        return al;
	    }
	    static void dfs(int node,boolean[] visited,ArrayList<Integer> al,ArrayList<ArrayList<Integer>> adj){
	        visited[node]=true;
	        al.add(node);
	        for(int i:adj.get(node)){
	            if(visited[i]==false){
	                dfs(i,visited,al,adj);
	            }
	        }
	    }

}
