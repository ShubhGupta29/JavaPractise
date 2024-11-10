import java.util.*;

public class DFS_Laabh {

    public Map<Integer, List<Integer>> adjacencyList;

    public DFS_Laabh() {
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(int start, int end){
        adjacencyList.computeIfAbsent(start, k -> new ArrayList<>()).add(end);
        adjacencyList.computeIfAbsent(end, k -> new ArrayList<>()).add(start);
    }

    public void dfs(int node, Set<Integer> visited){
        if(visited.contains(node)){
            return;
        }
        System.out.println(node + " ");
        visited.add(node);
        for(int neighbour : adjacencyList.getOrDefault(node, new ArrayList<>())){
            dfs(neighbour, visited);
        }
    }

    public static void main(String[] args) {

        DFS_Laabh graph = new DFS_Laabh();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.dfs(0, new HashSet<>());
    }
}

//      output
//        0
//        1
//        2
//        3
//        4
