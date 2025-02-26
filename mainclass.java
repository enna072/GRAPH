import java.util.ArrayList;

public class mainclass {
    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[10];
        graph_methods.create_graph(graph);

        for (ArrayList<Edge> arrayList : graph) {
            System.out.println(arrayList);
        }
        System.out.println("\n\n");
        graph_methods.bfs(graph);


    }

}
