import java.util.*;

public class DFS {
    public static HashMap<String, List<String>> graph = new HashMap<>();
    public static void createGraph() {
        graph.put("A", Arrays.asList("B","C"));
        graph.put("B", Arrays.asList("D","E"));
        graph.put("C", Arrays.asList("F","G"));
        graph.put("D", Arrays.asList("H"));
        graph.put("E", Arrays.asList("I"));
        graph.put("F", Arrays.asList());
        graph.put("G", Arrays.asList());
        graph.put("H", Arrays.asList());
        graph.put("I", Arrays.asList());
    }
    public static void DFS(String root) {
        // System.out.println(root);
        for(String child: graph.get(root)) {
            System.out.println(child);
            DFS(child);
        }
    }
    public static void main(String [] args) {
        createGraph();
        DFS("A");
    }
}
