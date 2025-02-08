import java.util.*;
public class Practice
{
   Map<Integer,ArrayList<Integer>> adjListMap;
   public Practice()
   {
       adjListMap=new HashMap<>();
   }
   public void addVertex(int v)
   {
       adjListMap.put(v,new ArrayList<Integer>());
   }
   public void addEdge(int a , int b)
   {
       adjListMap.get(a).add(b);
       adjListMap.get(b).add(a);
   }
   public void display() {
       System.out.println("Graph Representation (Adjacency List):");
       adjListMap.forEach((vertex, neighbours) ->
               System.out.println(vertex + " ---> " + neighbours)
       );
   }
   public static void main(String[] args) {
       Graph graph = new Graph();

       // Add vertices
       graph.addVertex(1);
       graph.addVertex(2);
       graph.addVertex(3);

       // Add edges
       graph.addEdge(1, 2);
       graph.addEdge(2, 3);
       graph.addEdge(3, 1);

       // Display the graph
       graph.display();

   }

   }

