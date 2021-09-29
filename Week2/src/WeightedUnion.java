import edu.princeton.cs.algs4.*;

public class WeightedUnion {
    private int[] id;
    private int[] sz;
    private int count;
    public WeightedUnion(int N) {
        id=new int[N];
        sz=new int[N];
        count=N;
        for (int i=0;i<N;i++)
        {
            id[i]=i;
        }
        for (int i=0;i<N;i++)
        {
            sz[i]=1;
        }
    }
    public int count() {
        return count;
    }
    public boolean connected (int p,int q) {
        return find(p)==find(q);
    }
    public int find (int p) {
        while (p!=id[p]) p=id[p];
        return p;
    }
    public void union (int p,int q) {
        int i=find (p);
        int j=find(q);
        if (i==j)   return;
        if (sz[i]<sz[j]) {
            id[i]=j;
            sz[j] +=sz[i];
        }
        else {
            id[j]=i;
            sz[i]+=sz[j];
        }
        count--;
    }
    public static void main(String[] args) {
        int N= StdIn.readInt();
        WeightedUnion wu=new WeightedUnion(N);
        while (!StdIn.isEmpty()) {
            int p=StdIn.readInt();
            int q=StdIn.readInt();
            if (wu.connected(p,q))  continue;
            wu.union(p,q);
            StdOut.println(p+" "+q);
        }
        StdOut.println(wu.count()+" components");

    }


}
