
package Lab8;

public class Vertex<E extends Comparable<E>,N extends Comparable<N>> {
    
    protected E vertexInfo;
    protected int indeg;
    protected int outdeg;
    protected Vertex<E,N> nextVertex;
    protected Edge<E, N> nextEdge;
    
    public Vertex(){
        vertexInfo = null;
        indeg = 0;
        outdeg = 0;
        nextVertex = null;
        nextEdge = null;
    }
    
    public Vertex(E vertexInfo, Vertex<E,N> nextVertex){
        this.vertexInfo = vertexInfo;
        indeg = 0;
        outdeg = 0;
        this.nextVertex = nextVertex;
        nextEdge = null;
    }
    
}

 class UnweightedVertex<E extends Comparable<E>>{
    
    protected E vertexInfo;
    protected int indeg;
    protected int outdeg;
    protected UnweightedVertex<E> nextVertex;
    protected UnweightedEdge<E> nextEdge;
    
    public UnweightedVertex(){
        vertexInfo = null;
        indeg = 0;
        outdeg = 0;
        nextVertex = null;
        nextEdge = null;
    }
    
    public UnweightedVertex(E vertexInfo, UnweightedVertex<E> nextVertex){
        this.vertexInfo = vertexInfo;
        indeg = 0;
        outdeg = 0;
        this.nextVertex = nextVertex;
        nextEdge = null;
    }
}
