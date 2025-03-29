
package Lab11;
public class TreeNode<E extends Comparable<E>> {

    protected E element;
    protected TreeNode<E> leftNode;
    protected TreeNode<E> rightNode;

    public TreeNode(E element){
        this.element = element;
        this.leftNode = null;
        this.rightNode = null;
    }
}