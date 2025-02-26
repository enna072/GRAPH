import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph_methods {

    public static void create_graph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5, 1));
        graph[7].add(new Edge(7, 8));
        graph[7].add(new Edge(7, 9));

        graph[9].add(new Edge(9, 7));
        graph[8].add(new Edge(8, 7, 0));
    }

    private static void bfsutility(ArrayList<Edge>[] graph, boolean[] visited, int starting_vertex) {
        if (visited[starting_vertex] == true)
            return;
        Queue<Integer> q = new LinkedList<>();

        q.add(starting_vertex);
        visited[starting_vertex] = true;

        while (!q.isEmpty()) {
            int currentnode = q.remove();
            System.out.print(currentnode + ",");

            for (Edge e : graph[currentnode]) {
                int destination = e.getdestination();
                if (visited[destination] == false) {
                    q.add(destination);
                    visited[destination] = true;
                }
            }

        }

    }

    public static void bfs(ArrayList<Edge>[] graph) {
        int size = graph.length;

        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++)
            visited[i] = false;
        for (int i = 0; i < size; i++)
            bfsutility(graph, visited, i);

    }

}