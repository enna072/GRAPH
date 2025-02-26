public class Edge implements Comparable<Edge> {
    private int src;
    private int dest;
    private int weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    public Edge(int src, int dest) {
        this(src, dest, 0);
    }

    public int getsource() {
        return src;
    }

    public int getdestination() {
        return dest;
    }

    public int getweight() {
        return weight;
    }

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return String.format("[%d,%d]", src, dest);
    }

}
