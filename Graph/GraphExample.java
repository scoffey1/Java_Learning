import java.util.*;

public class GraphExample {
    private int V; // Number of vertices
    private LinkedList<Integer> adj[]; // Adjacency list

    // Constructor
    GraphExample(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    // Add edge
    void addEdge(int v, int w) {
        adj[v].add(w); // Add w to v's list
    }

    // DFS traversal
    void DFS(int v, boolean visited[]) {
        // Mark the current node as visited
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all adjacent vertices
        for (int neighbor : adj[v]) {
            if (!visited[neighbor])
                DFS(neighbor, visited);
        }
    }

    // BFS traversal
    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            // Dequeue a vertex
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices
            for (int neighbor : adj[s]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String args[]) {
        GraphExample graph = new GraphExample(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("DFS starting from vertex 2:");
        boolean visited[] = new boolean[4];
        graph.DFS(2, visited);
        // Output: 2 0 1 3

        System.out.println("\nBFS starting from vertex 2:");
        graph.BFS(2);
        // Output: 2 0 3 1
    }
}
/*
 * Time Complexity:
 * 
 * DFS: O(V + E)
 * BFS: O(V + E)
 * Where V is the number of vertices and E is the number of edges.
 */