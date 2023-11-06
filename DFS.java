package searchingalgorithms;

import java.util.*;
public class DFS {

    // Helper method to perform the DFS
    private void dfs(List<List<Integer>> graph, int node, boolean[] visited) {
        System.out.print(node + " ");
        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

    // Perform DFS traversal of the given graph starting from the given node
    public void dfsTraversal(List<List<Integer>> graph, int startNode) {
        boolean[] visited = new boolean[graph.size()];
        dfs(graph, startNode, visited);
    }

    public static void main(String[] args) {
        DFS dfsExample = new DFS();

        // Test graph
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(Arrays.asList(1, 2)); // 0's neighbors
        graph.add(Arrays.asList(2));      // 1's neighbors
        graph.add(Arrays.asList(0, 3)); // 2's neighbors
        graph.add(Arrays.asList(3));      // 3's neighbors
        dfsExample.dfsTraversal(graph, 0);
    }
}
