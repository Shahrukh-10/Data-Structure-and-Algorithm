import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_LinkedList{
    private LinkedList<Integer>[] adjMatrix;
    private int E ;
    private int V;

    Graph_LinkedList(int nodes){
        this.adjMatrix = new LinkedList[nodes];
        this.E = 0;
        this.V = nodes;
        for (int i = 0; i < nodes; i++) {
            this.adjMatrix[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u , int v){ 
        adjMatrix[u].add(v);
        adjMatrix[v].add(u);
        E++;
    }


    public void bfs(int s){
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[s]=true;
        q.offer(s);

        while(!q.isEmpty()){
            int u = q.poll();
            System.out.print(u + " ");
            for (int w : adjMatrix[u]) {
                if(!visited[w]){
                    q.offer(w);
                    visited[w]=true;
                }
            }
        }
        System.out.println();
    }

    public void dfs(int s){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while(!stack.isEmpty()){
            int u = stack.pop();
                if (!visited[u]) {
                    visited[u]=true;
                    System.out.print(u+ " ");

                    for (int i : adjMatrix[u]) {
                        if(!visited[i]){
                            stack.push(i);
                        }
                    }
                }
            }
        System.out.println();
    }
 
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V + " Vertices " +E + " Edges "+ "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + " : ");
            for (int w : adjMatrix[v]) {
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Graph_LinkedList g = new Graph_LinkedList(5);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        g.addEdge(2,4);
        g.bfs(0);
        g.dfs(0);

        System.out.println(g);
    }
}
