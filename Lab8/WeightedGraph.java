package Lab8;

import java.util.ArrayList;

public class WeightedGraph<E extends Comparable<E>,N extends Comparable<N>> {
    
    private Vertex<E, N> head;
    private int size;
    
    public WeightedGraph(){
        head = null;
        size = 0;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean hasVertex(E vertex){
        if(head == null){
            return false;
        }
        Vertex <E, N> temp = head;
        
        while(temp != null){
            if(temp.vertexInfo.compareTo(vertex) == 0){
                return true;
            }
            temp = temp.nextVertex;
        }
        return false;
    }
    
    public int getInDeg(E vertex){
        if(hasVertex(vertex)){
            Vertex<E, N> temp = head;
            
            while(temp != null){
                if(temp.vertexInfo.compareTo(vertex) == 0){
                    return temp.indeg;
                }
                temp = temp.nextVertex;
            }
        }
        return -1;
    }
    
    public int getOutDeg(E vertex){
        if(hasVertex(vertex)){
            Vertex<E, N> temp = head;
            
            while(temp != null){
                if(temp.vertexInfo.compareTo(vertex) == 0){
                    return temp.outdeg;
                }
                temp = temp.nextVertex;
            }
        }
        return -1;
    }
    
    public boolean addVertex(E vertex){
        if(hasVertex(vertex) == true){
            return false;
        }else{
            Vertex <E, N> newVertex = new Vertex<>(vertex,null);
            if(head == null){
                head = newVertex;
            }else{
                Vertex<E, N> temp = head;
                Vertex<E, N> prev = head;
                while (temp != null){
                    prev = temp;
                    temp = temp.nextVertex;
                }
                prev.nextVertex = newVertex;
            }
            size++;
            return true;
        }
    }
    
    public int getIndex(E vertex){
        if(hasVertex(vertex)){
            int index = 0;
            Vertex <E, N> temp = head;
            while(temp != null){
                if(temp.vertexInfo.compareTo(vertex) == 0){
                    return index;
                }
                temp = temp.nextVertex;
                index++;
            }
        }
        return -1;
    }
    
    public ArrayList<E> getAllVertex(){
        ArrayList<E> list = new ArrayList<>();
        Vertex<E, N> temp = head;
        while(temp != null){
            list.add(temp.vertexInfo);
            temp = temp.nextVertex;
        }
        return list;
    }
    
    public E getVertex(int index){
        if(index < 0 || index >size-1){
            return null;
        }
        Vertex<E, N> temp = head;
        for(int i = 0 ; i<index ; i++){
             temp = temp.nextVertex;
        }
        return temp.vertexInfo;
    }
    
    public boolean hasEdge(E src, E dest){
        if(head == null){
            return false;
        }
        if(!hasVertex(src) || !hasVertex(dest)){
            return false;
        }
        
        Vertex<E, N> temp = head;
        while( temp != null ){
            if(temp.vertexInfo.compareTo(src) == 0){
                Edge <E,N> current = temp.nextEdge;
                while(current != null){
                   if(current.toVertex.vertexInfo.compareTo(dest) == 0){
                       return true;
                   }
                   current = current.nextEdge;
                }
            }
            temp = temp.nextVertex;
        }
        return false;
    }
    
    public boolean addEdge(E src, E dest, N weighted){
        if(head == null){
            return false;
        }
        if(!hasVertex(src) || !hasVertex(dest)){
            return false;
        }
        
        Vertex <E, N> temp = head;
        
        while(temp != null){
            if(temp.vertexInfo.compareTo(src) == 0){
                Vertex <E, N> destVertex = head;
                while(destVertex != null){
                    if(destVertex.vertexInfo.compareTo(dest) == 0){
                        Edge <E, N> currentEdge = temp.nextEdge;
                        Edge <E, N> newEdge = new Edge <>(destVertex, weighted,currentEdge);
                        temp.nextEdge = newEdge;
                        temp.outdeg++;
                        destVertex.indeg++;
                        return true;
                    }
                    destVertex = destVertex.nextVertex;
                }
            }
            temp = temp.nextVertex;
        }
        return false;
    }
    
    public N getEdgeWeight(E src, E dest){
        if(head == null){
            return null;
        }
        if(!hasVertex(src) || !hasVertex(dest)){
            return null;
        }
        
        Vertex<E,N> temp = head;
        Vertex<E,N> destVertex = head;
        
        while(temp != null){
            if(temp.vertexInfo.compareTo(src) == 0){
                Edge <E,N> current = temp.nextEdge;
                while(current != null){
                    if(current.toVertex.vertexInfo.compareTo(dest)==0){
                        return current.weighted;
                    }
                    current = current.nextEdge;
                }
            }
            temp = temp.nextVertex;
        }
        return null;
    }
    
    public ArrayList<E> getNeighBours(E vertex){
        ArrayList<E> list = new ArrayList<>();
        if(hasVertex(vertex)){
            Vertex<E,N> temp = head;
            
            while(temp != null){
                if(temp.vertexInfo.compareTo(vertex) == 0){
                    Edge<E,N> currentEdge = temp.nextEdge;
                    while(currentEdge != null){
                        list.add(currentEdge.toVertex.vertexInfo);
                        currentEdge = currentEdge.nextEdge;
                    }
                }
                temp = temp.nextVertex;
            }
        }
        return list;
    }
    
    public void printEdge(){
        Vertex <E, N> temp = head;
        while( temp != null){
            System.out.print("#" + temp.vertexInfo + " : ");
            Edge <E,N> currentEdge = temp.nextEdge;
            while(currentEdge != null){
                System.out.print("[" + temp.vertexInfo + "," + currentEdge.toVertex.vertexInfo + "]");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.print("\n");
            temp = temp.nextVertex;
        }
    }
    
    public boolean addUndirectedEdge(E src, E dest, N weighted){
        return addEdge(src,dest,weighted) && addEdge(dest,src,weighted);
    }
    
    public boolean removeEdge(E src, E dest){
        if(head == null){
            return false;
        }
        if(!hasVertex(src) || !hasVertex(dest)){
            return false;
        }
        
        Vertex<E,N> temp = head;
        while(temp != null){
            if(temp.vertexInfo.compareTo(src) == 0){
                Edge<E,N> currentEdge = temp.nextEdge;
                Edge<E,N> prevEdge = null;
                
                while(currentEdge != null){
                    if(currentEdge.toVertex.vertexInfo.compareTo(dest) == 0){
                        if(prevEdge == null){
                            temp.nextEdge = currentEdge.nextEdge;
                        }else{
                            prevEdge.nextEdge = currentEdge.nextEdge;
                        }
                        currentEdge.nextEdge = null;
                        temp.outdeg--;
                        currentEdge.toVertex.indeg--;
                        return true;
                    }
                    prevEdge = currentEdge;
                    currentEdge = currentEdge.nextEdge;
                }
            }
            temp = temp.nextVertex;
        }
        return false;
    }
}
