**Breadth-First Search (BFS)** in Java. BFS is commonly used for traversing or searching through graph data structures. It explores nodes layer-by-layer, starting from a given source node, visiting each node’s neighbors before moving on to the next level of nodes.

### General Steps for Implementing BFS in Java

1. **Define the Graph Representation**:
    - Typically, a graph can be represented using an **adjacency list**.
    - This can be done using an `ArrayList` of `ArrayLists`, or a `HashMap` with nodes as keys and lists of neighbors as values.

2. **Initialize the BFS Queue**:
    - BFS uses a **queue** to keep track of nodes to visit.
    - You can use a `LinkedList` for this in Java, as it implements the `Queue` interface.

3. **Initialize a Visited Set**:
    - To avoid revisiting nodes, maintain a **set of visited nodes**.
    - This can be a `HashSet` where each node visited is added, helping you to track which nodes have already been processed.

4. **Implement the BFS Algorithm**:
    - Start by adding the **source node** (starting point) to the queue and mark it as visited.
    - Use a loop to dequeue each node, process it (e.g., print the node), and enqueue all its unvisited neighbors.
    - Repeat until the queue is empty.

Here's a simple example in Java to clarify these steps.

---

### Java Code Example for BFS

```java
import java.util.*;

// Basic representation of a graph using an adjacency list
public class BFSExample {
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    // Method to add an edge between two nodes (undirected graph)
    public void addEdge(int src, int dest) {
        graph.putIfAbsent(src, new ArrayList<>());
        graph.putIfAbsent(dest, new ArrayList<>());
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    // BFS method starting from a source node
    public void bfs(int startNode) {
        // Queue to hold nodes to explore
        Queue<Integer> queue = new LinkedList<>();
        // Set to track visited nodes
        Set<Integer> visited = new HashSet<>();

        // Initialize BFS with the start node
        queue.add(startNode);
        visited.add(startNode);

        // Process nodes in the queue
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");  // Process the node (e.g., print it)

            // Iterate over each neighbor of the current node
            for (int neighbor : graph.getOrDefault(currentNode, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);       // Add unvisited neighbors to the queue
                    visited.add(neighbor);     // Mark neighbor as visited
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSExample bfsExample = new BFSExample();

        // Adding edges to the graph
        bfsExample.addEdge(1, 2);
        bfsExample.addEdge(1, 3);
        bfsExample.addEdge(2, 4);
        bfsExample.addEdge(3, 5);
        bfsExample.addEdge(4, 5);
        bfsExample.addEdge(5, 6);

        // Starting BFS from node 1
        System.out.println("BFS traversal starting from node 1:");
        bfsExample.bfs(1);  // Expected output: 1 2 3 4 5 6
    }
}
```

---

### Explanation of Code

- **Graph Initialization**:
    - We use a `HashMap` to store the graph as an adjacency list.
    - `addEdge` adds an undirected edge between two nodes.

- **BFS Implementation**:
    - `bfs` function accepts a `startNode` as its starting point.
    - We use a `Queue` (BFS’s core data structure) to store the next nodes to visit.
    - `Set<Integer> visited` keeps track of nodes we’ve already visited.
    - We dequeue a node, process it (in this case, print it), and add each of its unvisited neighbors to the queue.

- **Output**:
    - The output prints nodes in the order they are visited.

### Key Points to Remember

- **Queue and Set Usage**: The queue ensures that BFS explores level-by-level, while the set avoids cycles and re-visiting nodes.
- **Graph Representation**: Adjacency lists are efficient for BFS because they allow quick access to a node's neighbors.
- **Time Complexity**: \(O(V + E)\), where \(V\) is the number of vertices and \(E\) is the number of edges.
- **Space Complexity**: \(O(V)\), due to storage requirements for the queue and visited set.