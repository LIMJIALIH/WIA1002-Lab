
package Lab8;

public class TestWeightedGraph {
    public static void main(String[] args) {
        WeightedGraph<String,Integer> graph = new WeightedGraph<>();
        String [] cities = {"Alor Setar","Kuching","Melaka","Penang","Tawau"};
        for(String i : cities){
            graph.addVertex(i);
        }
        
        System.out.print("\nThe number of vertices in graph : " + graph.getSize());
        
        System.out.print("\nCities and their vertices ");
        
        for(int i = 0 ; i<=graph.getSize()-1 ; i++){
            System.out.print("\n" + i + " : " + graph.getVertex(i) + "\t");
            System.out.print("\n");
        }
        
        System.out.print("\nIs Melaka in the Graph? " + graph.hasVertex("Melaka"));
        System.out.print("\nIs Ipoh in the Graph? " + graph.hasVertex("Ipoh"));
        System.out.print("\n");
        
        System.out.print("\nKuching at index: " + graph.getIndex("Kuching"));
        System.out.print("\nIpoh at index: " + graph.getIndex("Ipoh"));
        System.out.print("\n");
        
        System.out.print("\nadd edge Kuching - Melaka: " + graph.addEdge("Kuching", "Melaka", 800));
        System.out.print("\nadd edge Langkawi - Penang: " + graph.addEdge("Langkawi", "Penang", 800));
        System.out.print("\nadd edge Melaka - Penang: " + graph.addEdge("Melaka", "Penang", 800));
        System.out.print("\nadd edge Alor Setar - Kuching: " + graph.addEdge("Alor Setar", "Kuching", 800));
        System.out.print("\nadd edge Tawau - Alor Setar: " + graph.addEdge("Tawau", "Alor Setar", 800));
        System.out.print("\nadd edge Kuching - Tawau: " + graph.addEdge("Kuching", "Tawau", 800));
        System.out.print("\nadd edge Langkawi - Ipoh: " + graph.addEdge("Langkawi", "Ipoh", 800));
        System.out.print("\n");
        
        System.out.print("\nhas edge from Kuching to Melaka? " + graph.hasEdge("Kuching", "Melaka"));
        System.out.print("\nhas edge from Melaka to Langkawi? " + graph.hasEdge("Melaka", "Langkawi"));
        System.out.print("\nhas edge from Ipoh to Langkawi? " + graph.hasEdge("Ipoh", "Langkawi"));
        System.out.print("\n");
        
        System.out.print("\nweight of edge from Kuching to Melaka? " + graph.getEdgeWeight("Kuching", "Melaka"));
        System.out.print("\nweight of edge from Tawau to Alor Setar? " + graph.getEdgeWeight("Tawau", "Alor Setar"));
        System.out.print("\nweight of edge from Semporna to Ipoh? " + graph.getEdgeWeight("Semporna", "Ipoh"));
        System.out.print("\n");
        
        System.out.print("\nIn and out degree for Kuching is " + graph.getInDeg("Kuching") + " and " + graph.getOutDeg("Kuching"));
        System.out.print("\nIn and out degree for Penang is " + graph.getInDeg("Penang") + " and " + graph.getOutDeg("Penang"));
        System.out.print("\nIn and out degree for Ipoh is " + graph.getInDeg("Ipoh") + " and " + graph.getOutDeg("Ipoh"));
        System.out.print("\n");
        
        System.out.print("\nNeighbours of Kuching : " + graph.getNeighBours("Kuching"));
        System.out.print("\nPrint Edges : ");
        graph.printEdge();
    }
}
