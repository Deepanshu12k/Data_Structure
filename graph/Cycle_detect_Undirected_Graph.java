package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
// for dfs appproach 
// https://github.com/striver79/StriversGraphSeries/blob/main/cycleCheckUGDfsJava
class Pair{
	int first;
	int second;
	Pair(int first,int second){
		this.first = first;
		this.second=second;
	}
}
public class Cycle_detect_Undirected_Graph {

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
		
		boolean ans =  isCyclic(adj,V);
		System.out.println(ans);
	}
static boolean isCyclic(ArrayList<ArrayList<Integer> > adj,int V) {
	boolean visited[] =  new boolean[V];
	for(int i =0;i<V;i++) {
		if(visited[i]==false) 
			if(solve(i,visited,adj))
				return true;
	}
	return false;
}
static boolean solve(int i,boolean[] visited,ArrayList<ArrayList<Integer> > adj) {
	visited[i]=true;
	Queue<Pair> q = new LinkedList<Pair>();
	q.add(new Pair(i,-1));
	
	while(!q.isEmpty()) {
		int node = q.peek().first;
        int par = q.peek().second;
        q.remove(); 
        
        for(Integer it: adj.get(node))
        {
            if(visited[it]==false)  
            {
                q.add(new Pair(it, node));
                visited[it] = true; 
            }
            else if(par != it) return true;
        }
	}
	
	return false;
}
}
