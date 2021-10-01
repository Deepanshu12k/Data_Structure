package graph;
import java.util.*;
class Node implements Comparator<Node>
{
    int v;
    int weight;
    Node(int _v, int _w) { this.v = _v; this.weight = _w; }
    Node() {}
    
    int getV() { return v; }
    int getWeight() { return weight; }
    
    @Override
    public int compare(Node node1, Node node2) 
    { 
        if (node1.weight < node2.weight) 
            return -1; 
        if (node1.weight > node2.weight) 
            return 1; 
        return 0; 
    } 
}
public class Dijkstra_shortestPath_Undirected_Graphs_withWeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	        ArrayList<ArrayList<Node> > adj = new ArrayList<ArrayList<Node> >();
			
			for (int i = 0; i < n; i++) 
				adj.add(new ArrayList<Node>());
				
			adj.get(0).add(new Node(1, 2));
			adj.get(1).add(new Node(0, 2));

// time complexity
// Θ (E+V^2) 
			adj.get(1).add(new Node(2, 4));
			adj.get(2).add(new Node(1, 4));
			
			adj.get(0).add(new Node(3, 1));
			adj.get(3).add(new Node(0, 1));
			
			adj.get(3).add(new Node(2, 3));
			adj.get(2).add(new Node(3, 3));
			
			adj.get(1).add(new Node(4, 5));
			adj.get(4).add(new Node(1, 5));
			
			adj.get(2).add(new Node(4, 1));
			adj.get(4).add(new Node(2, 1));
			 
			shortestPath(0, adj, n); 
	}
	static void shortestPath(int s, ArrayList<ArrayList<Node>> adj, int N)
    {
        int dist[] = new int[N];
        
        for(int i = 0;i<N;i++) dist[i] = 100000000;
        dist[s] = 0; 
        
        PriorityQueue<Node> pq = new PriorityQueue<Node>(N, new Node());
        pq.add(new Node(s, 0));
        
        while(pq.size() > 0) {
            Node node = pq.poll();
            
            for(Node it: adj.get(node.getV())) {
                if(dist[node.getV()] + it.getWeight() < dist[it.getV()]) {
                    dist[it.getV()] = dist[node.getV()] + it.getWeight(); 
                    pq.add(new Node(it.getV(), dist[it.getV()]));
                }
            }
        }
        
        for (int i = 0; i < N; i++){
            System.out.print( dist[i] + " ");
        }
        
    }
}
