import edu.princeton.cs.algs4.*;

public class BTVNUF {
    private int[] id;
    private int[] sz;
    private int count;
    public BTVNUF(int N) {
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
        int i=0;
        WeightedUnion wu=new WeightedUnion(N);
        while (!StdIn.isEmpty()) {
            int p=StdIn.readInt();
            int q=StdIn.readInt();
            i++;
            if (wu.connected(p,q))  continue;
            wu.union(p,q);
            if (wu.count()==1) {
                StdOut.println("\n"+i);
                break;
            }
        }
        if (wu.count()!=1) StdOut.println("\nFAILED");



    }


}
