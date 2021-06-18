package graph;
import java.util.*;
class CusNode 
{
	private int u;
    private int v;
    private int weight;
    
    CusNode(int _u, int _v, int _w) { u = _u; v = _v; weight = _w; }
    
//    CusNode() {}
    
    int getV() { return v; }
    int getU() { return u; }
    int getWeight() { return weight; }
}
class SortComparator implements Comparator<CusNode> {
	@Override
    public int compare(CusNode node1, CusNode node2) 
    { 
        if (node1.getWeight() < node2.getWeight()) 
            return -1; 
        if (node1.getWeight() > node2.getWeight()) 
            return 1;
        
        return 0; 
    } 
} 
public class Kruskals_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 5;
	        ArrayList<CusNode> adj = new ArrayList<CusNode>();
			adj.add(new CusNode(0, 1, 2));
			adj.add(new CusNode(0, 3, 6));
			adj.add(new CusNode(1, 3, 8));
			adj.add(new CusNode(1, 2, 3));
			adj.add(new CusNode(1, 4, 5));
			adj.add(new CusNode(2, 4, 7));
           
			KruskalAlgo(adj, n);
			
	}
	static void KruskalAlgo(ArrayList<CusNode> adj, int N)
	    {
	        Collections.sort(adj, new SortComparator());
	        int parent[] = new int[N]; 
	        int rank[] = new int[N];

	        for(int i = 0;i<N;i++) {
	        	parent[i] = i; 
	        	rank[i] = 0; 
	        }

	        int costMst = 0;
	        ArrayList<CusNode> mst = new ArrayList<CusNode>();
	        for(CusNode it: adj) {
	        	if(findPar(it.getU(), parent) != findPar(it.getV(), parent)) {
	        		costMst += it.getWeight(); 
	        		mst.add(it); 
	        		union(it.getU(), it.getV(), parent, rank); 
	        	}
	        } 
	        System.out.println(costMst);
	        for(CusNode it: mst) {
	        	System.out.println(it.getU() + " " +it.getV()); 
	        }
	    }
	private static int findPar(int u, int parent[]) {
		if(u==parent[u]) return u;
		return parent[u] = findPar(parent[u], parent); 
	}
	private static void union(int u, int v, int parent[], int rank[]) {
		u = findPar(u, parent); 
		v = findPar(v, parent);
		if(rank[u] < rank[v]) {
        	parent[u] = v;
        }
        else if(rank[v] < rank[u]) {
        	parent[v] = u; 
        }
        else {
        	parent[v] = u;
        	rank[u]++; 
        }
	}
}
