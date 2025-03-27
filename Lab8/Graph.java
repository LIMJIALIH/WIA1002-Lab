
package Lab8;

import java.util.ArrayList;

public class Graph<E extends Comparable<E>> {

    private UnweightedVertex<E> head;
    private int size;

    public Graph() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean hasVertex(E vertex) {
        if (head == null) {
            return false;
        }
        UnweightedVertex<E> temp = head;
        while (temp != null) {
            if (temp.vertexInfo.compareTo(vertex) == 0) {
                return true;
            }
            temp = temp.nextVertex;
        }
        return false;
    }

    public int getInDeg(E vertex) {
        if (hasVertex(vertex)) {
            UnweightedVertex<E> temp = head;
            while (temp != null) {
                if (temp.vertexInfo.compareTo(vertex) == 0) {
                    return temp.indeg;
                }
                temp = temp.nextVertex;
            }
        }
        return -1;
    }

    public int getOutDeg(E vertex) {
        if (hasVertex(vertex)) {
            UnweightedVertex<E> temp = head;
            while (temp != null) {
                if (temp.vertexInfo.compareTo(vertex) == 0) {
                    return temp.outdeg;
                }
                temp = temp.nextVertex;
            }
        }
        return -1;
    }

    public boolean addVertex(E vertex) {
        if (hasVertex(vertex)) {
            return false;
        } else {
            UnweightedVertex<E> newVertex = new UnweightedVertex<>(vertex, null);
            if (head == null) {
                head = newVertex;
            } else {
                UnweightedVertex<E> temp = head;
                UnweightedVertex<E> prev = head;
                while (temp != null) {
                    prev = temp;
                    temp = temp.nextVertex;
                }
                prev.nextVertex = newVertex;
            }
            size++;
            return true;
        }
    }

    public int getIndex(E vertex) {
        if (hasVertex(vertex)) {
            int index = 0;
            UnweightedVertex<E> temp = head;
            while (temp != null) {
                if (temp.vertexInfo.compareTo(vertex) == 0) {
                    return index;
                }
                temp = temp.nextVertex;
                index++;
            }
        }
        return -1;
    }

    public ArrayList<E> getAllVertex() {
        ArrayList<E> list = new ArrayList<>();
        UnweightedVertex<E> temp = head;
        while (temp != null) {
            list.add(temp.vertexInfo);
            temp = temp.nextVertex;
        }
        return list;
    }

    public E getVertex(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        UnweightedVertex<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.nextVertex;
        }
        return temp.vertexInfo;
    }

    public boolean hasEdge(E src, E dest) {
        if (head == null) {
            return false;
        }
        if (!hasVertex(src) || !hasVertex(dest)) {
            return false;
        }

        UnweightedVertex<E> temp = head;
        while (temp != null) {
            if (temp.vertexInfo.compareTo(src) == 0) {
                UnweightedEdge<E> current = temp.nextEdge;
                while (current != null) {
                    if (current.toVertex.vertexInfo.compareTo(dest) == 0) {
                        return true;
                    }
                    current = current.nextEdge;
                }
            }
            temp = temp.nextVertex;
        }
        return false;
    }

    public boolean addEdge(E src, E dest) {
        if (head == null) {
            return false;
        }
        if (!hasVertex(src) || !hasVertex(dest)) {
            return false;
        }

        UnweightedVertex<E> temp = head;

        while (temp != null) {
            if (temp.vertexInfo.compareTo(src) == 0) {
                UnweightedVertex<E> destVertex = head;
                while (destVertex != null) {
                    if (destVertex.vertexInfo.compareTo(dest) == 0) {
                        UnweightedEdge<E> currentEdge = temp.nextEdge;
                        UnweightedEdge<E> newEdge = new UnweightedEdge<>(destVertex, currentEdge);
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

    public ArrayList<E> getNeighbours(E vertex) {
        ArrayList<E> list = new ArrayList<>();
        if (hasVertex(vertex)) {
            UnweightedVertex<E> temp = head;

            while (temp != null) {
                if (temp.vertexInfo.compareTo(vertex) == 0) {
                    UnweightedEdge<E> currentEdge = temp.nextEdge;
                    while (currentEdge != null) {
                        list.add(currentEdge.toVertex.vertexInfo);
                        currentEdge = currentEdge.nextEdge;
                    }
                }
                temp = temp.nextVertex;
            }
        }
        return list;
    }

    public void printEdge() {
        UnweightedVertex<E> temp = head;
        while (temp != null) {
            System.out.print("#" + temp.vertexInfo + " : ");
            UnweightedEdge<E> currentEdge = temp.nextEdge;
            while (currentEdge != null) {
                System.out.print("[" + temp.vertexInfo + " -> " + currentEdge.toVertex.vertexInfo + "] ");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.print("\n");
            temp = temp.nextVertex;
        }
    }

    public boolean addUndirectedEdge(E src, E dest) {
        return addEdge(src, dest) && addEdge(dest, src);
    }

    public boolean removeEdge(E src, E dest) {
        if (head == null) {
            return false;
        }
        if (!hasVertex(src) || !hasVertex(dest)) {
            return false;
        }

        UnweightedVertex<E> temp = head;
        while (temp != null) {
            if (temp.vertexInfo.compareTo(src) == 0) {
                UnweightedEdge<E> currentEdge = temp.nextEdge;
                UnweightedEdge<E> prevEdge = null;

                while (currentEdge != null) {
                    if (currentEdge.toVertex.vertexInfo.compareTo(dest) == 0) {
                        if (prevEdge == null) {
                            temp.nextEdge = currentEdge.nextEdge;
                        } else {
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

