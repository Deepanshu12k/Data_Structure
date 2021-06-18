package graph;
import java.util.*;
public class ShortestPath_UndirectedGraph_unitWeights_BFS {

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
//		adj.get(1).add(2);
//		adj.get(2).add(1); 
		adj.get(2).add(3);
		adj.get(3).add(2); 
//		adj.get(3).add(3);
		
		shortestPath(adj,V,0);
	}

	static void shortestPath(ArrayList<ArrayList<Integer>> adj,int N,int src){ 
		int[] dist = new int[N]; 
    	for(int i = 0; i < N; i++) 
    		dist[i] =Integer.MAX_VALUE; 
    
    	Queue<Integer> q=new LinkedList<>();
    	dist[src] = 0;
    	q.add(src); 
    
    	while(q.isEmpty()==false){ 
    		int node = q.poll();  
    		for(int it:adj.get(node)){
    		    if(dist[node] + 1 < dist[it]){
    		        dist[it] = dist[node] + 1;
    		        q.add(it);
    		    }
    		} 
    	}
    	
    	for(int i = 0;i < N;i++) {
    	    System.out.print(dist[i] + " "); 
    	}
    	
	} 
}
