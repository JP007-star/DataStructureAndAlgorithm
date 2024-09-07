package dsa.graph;

/*
      0---1
      |   |
      3---2

 */

public class Graph {
    int[][] adjMatrix;


    public Graph(int nodes){
        this.adjMatrix=new int[nodes][nodes];
    }

    public void addEdge(int r, int c){
        this.adjMatrix[r][c]=1;
        this.adjMatrix[c][r]=1;
    }


    public static void main(String[] args) {
        Graph graph=new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
    }
}
