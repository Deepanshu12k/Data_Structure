package practice2;

//import java.util.Scanner;
import java.util.TreeSet;

public class DivideArray_AprilCircuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Scanner in = new Scanner(System.in);
  

        
//        int[] a = {0,2,2,3,0};
//        int[] a = {2 ,1, 0, 0, 1, 2};
//        int[] a = {2 ,3 ,1 ,2 ,1 ,3};
		int [] a ={1,2,2,3,1};
//		int[] a = {0,1,2,3};
        int n = a.length;
     TreeSet<Integer> ts = new TreeSet<>();
      for(int i=0; i<=100010; i++) {
         ts.add(i);
       }

     int[] before = new int[n];
      for(int i=0; i<n; i++) {
        if (ts.contains(a[i])) {
             ts.remove(a[i]);
         }
       before[i] = (ts.size()>0?ts.first():-1);
//       System.out.println(ts.first()+"sdsds");
      }

     ts = new TreeSet<>();
     for(int i=0; i<=100010; i++) {
        ts.add(i);
      }

      int ans = -2;

     for(int i=n-1; i>=1; i--) {
      if (ts.contains(a[i])) {
        ts.remove(a[i]);
      }
//      System.out.println("myMex: "+ts.first()+", arr[i]: "+a[i]+", before: "+before[i-1]+", i: "+i );
      if (ts.first()==before[i-1]) {
        ans = i-1;
     }
  }

System.out.println(ans+1);

}

}


/*April circuits divide array
public class TB {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int t = in.nextInt();

while(t-->0) {
int n = in.nextInt();
int[] a = new int[n];
for(int i=0; i<n; i++) {
a[i] = in.nextInt();
}

TreeSet<Integer> myMEX = new TreeSet<>();
for(int i=0; i<=100010; i++) {
myMEX.add(i);
}

int[] before = new int[n];
for(int i=0; i<n; i++) {
if (myMEX.contains(a[i])) {
myMEX.remove(a[i]);
}
before[i] = (myMEX.size()>0?myMEX.first():-1);
}

myMEX = new TreeSet<>();
for(int i=0; i<=100010; i++) {
myMEX.add(i);
}

int ans = -2;

for(int i=n-1; i>=1; i--) {
if (myMEX.contains(a[i])) {
myMEX.remove(a[i]);
}

if (myMEX.first()==before[i-1]) {
ans = i-1;
}
}

System.out.println(ans+1);
}
}

}*/