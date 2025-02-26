import java.util.ArrayList;

public class mainclass {
    public static void main(String[]args){
        ArrayList<Edge>[] graph=new ArrayList[7];
        graph_methods.create_graph(graph);
        for (ArrayList<Edge> arrayList : graph) {
                System.out.println(arrayList);
        }

    }
    
}
