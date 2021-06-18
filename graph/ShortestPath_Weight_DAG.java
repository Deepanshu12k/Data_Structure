package graph;

import java.util.ArrayList;
import java.util.Stack;

class CustomPair{
	int weight;
	int value;
	CustomPair(int value,int weight){
		this.weight=weight;
		this.value=value;
	}
    int getWeight() {
		return weight;
	}
	int getValue() {
		return value;
	}
}
public class ShortestPath_Weight_DAG {
//DAG -> Directed Acyclic Graph 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
        ArrayList<ArrayList<CustomPair> > adj = new ArrayList<ArrayList<CustomPair> >();
		
		for (int i = 0; i < n; i++) 
			adj.add(new ArrayList<CustomPair>());
			
		adj.get(0).add(new CustomPair(1, 2));
		adj.get(0).add(new CustomPair(4, 1));
		adj.get(1).add(new CustomPair(2, 3));
		adj.get(2).add(new CustomPair(3, 6));
		adj.get(4).add(new CustomPair(2, 2));
		adj.get(4).add(new CustomPair(5, 4));
		adj.get(5).add(new CustomPair(3, 1));
		
	   shortestPath(0, adj, n); 
	}
static void shortestPath(int s, ArrayList<ArrayList<CustomPair>> adj, int N)
    {
        Stack<Integer> stack = new Stack<>();
        int dist[] = new int[N];
        boolean visited[] = new boolean[N];
       // in java all index of visited is itself intialize to false 
        for (int i = 0; i < N; i++) {
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack, adj);
        }
        for (int i = 0; i < N; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[s] = 0;

        while (!stack.empty())
        {
        	System.out.print(stack.peek()+"\n");
            int node = stack.pop();

            if (dist[node] != Integer.MAX_VALUE)
            {
                for(CustomPair it: adj.get(node)) {
                    if(dist[node] + it.getWeight() < dist[it.getValue()]) {
                        dist[it.getValue()] = dist[node] + it.getWeight(); 
                    }
                }
            }
        }

        for (int i = 0; i < N; i++)
        {
            if (dist[i] == Integer.MAX_VALUE)
                System.out.print( "INF ");
            else
                System.out.print( dist[i] + " ");
        }
    }
	static void topologicalSortUtil(int node, boolean visited[], Stack<Integer> stack, 
			ArrayList<ArrayList<CustomPair>> adj){

        visited[node] = true;
        for(CustomPair it: adj.get(node)) {
            if(visited[it.getValue()] == false) {
                topologicalSortUtil(it.getValue(), visited, stack, adj);
            }
        }
        stack.add(node);
    }

}
