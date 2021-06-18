package graph;

import java.util.ArrayList;

public class Graph_Implementation {
	ArrayList<ArrayList<Integer>> graph;
	int V;
	Graph_Implementation(int nodes){
		V = nodes;
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<V;i++) {
			graph.add(new ArrayList<Integer>());
		}
	}

void addEdge(int v,int u) {
	graph.get(v).add(u);
	graph.get(u).add(v);
}
void printGraph() {
	for(int i=0;i<V;i++) {
		System.out.print("Node: " + i);
		for(int x:graph.get(i)) { 
			System.out.print("->"+x);
			}
		System.out.println();
	}
}
	public static void main(String[] args) {
		Graph_Implementation g = new Graph_Implementation(6);
        g.addEdge(0, 1);
        g.addEdge(2, 1);
        g.addEdge(3, 1);
        g.addEdge(4, 5);
        g.addEdge(4, 3);
      
        g.printGraph();
	}
}
