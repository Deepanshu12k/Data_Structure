package graph;
//https://github.com/striver79/StriversGraphSeries/blob/main/primsAlgoJavaEfficient
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
class NNNode implements Comparator<NNNode>
{
    private int v;
    private int weight;
    
    NNNode(int _v, int _w) { v = _v; weight = _w; }
    
    NNNode() {}
    
    int getV() { return v; }
    int getWeight() { return weight; }

    @Override
    public int compare(NNNode node1, NNNode node2) 
    { 
        if (node1.weight < node2.weight) 
            return -1; 
        if (node1.weight > node2.weight) 
            return 1; 
        return 0; 
    } 
}

public class Prims_Efficient {

	public static void main(String[] args) {
		 int n = 5;
	        ArrayList<ArrayList<NNNode> > adj = new ArrayList<ArrayList<NNNode> >();
			
			for (int i = 0; i < n; i++) 
				adj.add(new ArrayList<NNNode>());
				
			adj.get(0).add(new NNNode(1, 2));
			adj.get(1).add(new NNNode(0, 2));
			
			adj.get(1).add(new NNNode(2, 3));
			adj.get(2).add(new NNNode(1, 3));
			
			adj.get(0).add(new NNNode(3, 6));
			adj.get(3).add(new NNNode(0, 6));
			
			adj.get(1).add(new NNNode(3, 8));
			adj.get(3).add(new NNNode(1, 8));
			
			adj.get(1).add(new NNNode(4, 5));
			adj.get(4).add(new NNNode(1, 5));
			
			adj.get(2).add(new NNNode(4, 7));
			adj.get(4).add(new NNNode(2, 7));
			
			 primsAlgo(adj, n); 
	}
	static void primsAlgo(ArrayList<ArrayList<NNNode>> adj, int N)
	    {
	        int key[] = new int[N];
	        int parent[] = new int[N]; 
	        boolean mstSet[] = new boolean[N]; 
	        for(int i = 0;i<N;i++) {
	        	key[i] = 100000000; 
	        	mstSet[i] = false; 
	        }

	       PriorityQueue<NNNode> pq = new PriorityQueue<NNNode>(N, new NNNode());

	        key[0] = 0;
	        parent[0] = -1; 
	        pq.add(new NNNode(key[0], 0)); 
			
	        while(!pq.isEmpty()) {
	        	int u = pq.poll().getV();
	        	mstSet[u] = true;
	        
	        	for(NNNode it: adj.get(u)) {
	        		if(mstSet[it.getV()] == false && it.getWeight() < key[it.getV()]) {
	        			parent[it.getV()] = u; 
	        			key[it.getV()] = it.getWeight(); 
	        			pq.add(new NNNode(it.getV(), key[it.getV()]));
	        		}
	        	}
	        }

	        for(int i = 1;i<N;i++) {
	        	System.out.println(parent[i] + " - " + i); 
	        }
	    }
}
