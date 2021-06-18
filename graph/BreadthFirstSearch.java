package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

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
		
		ArrayList<Integer> list =  bfs(adj,V);
		System.out.print(list.toString());
	}
	static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer> > adj , int V){
		ArrayList<Integer> list =  new ArrayList<>();
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[V];
		q.add(0);
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			list.add(temp);
			for(int i:adj.get(temp)) {
				if(visited[i]==false){
                    visited[i]=true;
                    q.add(i);
                }
			}
	   }
		return list;
	}
}
