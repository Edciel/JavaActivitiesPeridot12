package Algorithm;

public class Algorithm {
   
    static class DSU {
        int[] p;

        DSU(int n) {
            p = new int[n];
            for (int i = 0; i < n; i++) p[i] = i;
        }

        int find(int x) {
            return p[x] == x ? x : (p[x] = find(p[x]));
        }

        void union(int a, int b) {
            p[find(a)] = find(b);
        }
    }

    public static void main(String[] args) {
        DSU d = new DSU(6);

        d.union(0, 1);
        d.union(2, 3);
        d.union(3, 4);

        System.out.println(d.find(2) == d.find(4)); // true
        System.out.println(d.find(1) == d.find(4)); // false
    }

}
