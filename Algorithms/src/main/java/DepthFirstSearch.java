import java.util.*;

public class DepthFirstSearch {
    public Map<Integer, List<Integer>> adjacencyList;

    public DepthFirstSearch() {
        this.adjacencyList = new HashMap<>();
    }

    public void addEdge(int start, int end){
        adjacencyList.computeIfAbsent(start, k -> new ArrayList<>()).add(end);
        adjacencyList.computeIfAbsent(end, k -> new ArrayList<>()).add(start);
    }

    private void dfs(int node, Set<Integer> visited){

        visited.add(node);
        System.out.println(node + " ");

        for(int neighbour: adjacencyList.getOrDefault(node, Collections.emptyList())){
            if(!visited.contains(node)){
                dfs(neighbour, visited);
            }
        }
    }

    public void performDFS(int startNode){
        Set<Integer> visited =  new HashSet<>();
        System.out.println("DFS Traversal starting from node " + startNode + ":");
        dfs(startNode, visited);
    }

    public static void main(String[] args) {

        DepthFirstSearch graph = new DepthFirstSearch();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.performDFS(0);
    }
}
