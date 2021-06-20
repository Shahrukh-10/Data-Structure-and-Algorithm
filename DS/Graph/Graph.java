public class Graph{
    private int[][] adjMatrix;
    private int E;
    private int V;

    Graph(int nodes){
        this.adjMatrix = new int[nodes][nodes];
        this.E=0;
        this.V=nodes;
    }

    public void addEdge(int u, int v){
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
        E++;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " : verticies , "+E+" : edges"+"\n");
        for (int i = 0; i < V; i++) {
            sb.append(i + " : ");
            for (int w : adjMatrix[i]){
                sb.append(w  + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);

        System.out.println(g);
        
    }
}
