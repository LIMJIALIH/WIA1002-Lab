package Lab8;

public class Edge<E extends Comparable<E>,N extends Comparable<N>> {

    protected N weighted;
    protected Vertex<E, N> toVertex;
    protected Edge<E, N> nextEdge;
    
    public Edge(){
        weighted = null;
        toVertex = null;
        nextEdge = null;
    }
    
    public Edge(Vertex<E, N> toVertex, N weighted, Edge<E, N> nextEdge){
        this.toVertex = toVertex;
        this.weighted = weighted;
        this.nextEdge = nextEdge;
    }
    
}

class UnweightedEdge <E extends Comparable<E>>{
    
    protected UnweightedVertex<E> toVertex;
    protected UnweightedEdge<E> nextEdge;
    
    public UnweightedEdge(){
        toVertex = null;
        nextEdge = null;
    }
    
    public UnweightedEdge(UnweightedVertex<E> toVertex, UnweightedEdge<E> nextEdge){
        this.toVertex = toVertex;
        this.nextEdge = nextEdge;
    }
    
}
