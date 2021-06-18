package graph;
/// just for check the data structure of disjoint set 
// code with no input 
public class Disjoint_Set_union_pathCompression {
static int parent[]=new int[10000];
static int[] rank=new int[10000];
  public static void main(String[] args) {
		// TODO Auto-generated method stub
 makeSet();
 int m =5;
 while(m-->0) {
	 int u=0,v = 0;
	 union(u,v);
 }
 if(findpar(2)!=findpar(3)) {
	 System.out.println("Different");
 }else {
	 System.out.println("Same");
 }
	}
	static void makeSet() {
		int n =5;
		for(int i=1;i<=n;i++) {
			parent[i]=i;
			rank[i]=0;
		}
	}
  static int findpar(int node) {
	  if(node==parent[node]) {
		  return node;
	  }
		  
	  return parent[node]=findpar(parent[node]);
  }
  static void union(int u,int v) {
	  u=findpar(u);
	  v=findpar(v);
	  
	  if(rank[u]<rank[v]) {
		  parent[u]=v;
	  }else if(rank[u]>rank[v]) {
		  parent[v]=u;
	  }else {
		  parent[v]=u;
		  rank[u]++;
	  }
  }
}
