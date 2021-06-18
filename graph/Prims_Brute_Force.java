package graph;

import java.util.ArrayList;
class NNode {
    private int v;
    private int weight;
    
    NNode(int _v, int _w) { v = _v; weight = _w; }
    
    NNode() {}
    
    int getV() { return v; }
    int getWeight() { return weight; }
}
public class Prims_Brute_Force {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	        ArrayList<ArrayList<NNode> > adj = new ArrayList<ArrayList<NNode> >();
			
			for (int i = 0; i < n; i++) { 
				adj.add(new ArrayList<NNode>());
			}	
			adj.get(0).add(new NNode(1, 2));
			adj.get(1).add(new NNode(0, 2));
			
			adj.get(1).add(new NNode(2, 3));
			adj.get(2).add(new NNode(1, 3));
			
			adj.get(0).add(new NNode(3, 6));
			adj.get(3).add(new NNode(0, 6));
			
			adj.get(1).add(new NNode(3, 8));
			adj.get(3).add(new NNode(1, 8));
			
			adj.get(1).add(new NNode(4, 5));
			adj.get(4).add(new NNode(1, 5));
			
			adj.get(2).add(new NNode(4, 7));
			adj.get(4).add(new NNode(2, 7));
			
			primsAlgo(adj, n); 
	}
 static void primsAlgo(ArrayList<ArrayList<NNode>> adj, int N)
 {
    int key[] = new int[N];
    int parent[] = new int[N]; 
    boolean mstSet[] = new boolean[N]; 
    for(int i = 0;i<N;i++) {
    	key[i] = 100000000; 
    	mstSet[i] = false; 
    }

    key[0] = 0;
    parent[0] = -1; 
    
    for(int i = 0;i<N-1;i++) {
    	int mini = 100000000, u = 0; 
    	for(int v = 0;v<N;v++) {
    		if(mstSet[v] == false && key[v] < mini) {
    			mini = key[v]; 
    			u = v; 
    		}
    	}

    	mstSet[u] = true;
 
    	for(NNode it: adj.get(u)) {
    		if(mstSet[it.getV()] == false && it.getWeight() < key[it.getV()]) {
    			parent[it.getV()] = u; 
    			key[it.getV()] = it.getWeight(); 
    		}
    	}
    
    }

    for(int i = 1;i<N;i++) {
    	System.out.println(parent[i] + " - " + i); 
    }
}
}
