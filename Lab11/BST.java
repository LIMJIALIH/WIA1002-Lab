
package Lab11;
import java.util.ArrayList;

public class BST<E extends Comparable<E>> {
    private TreeNode<E> root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public BST(E [] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(insert(arr[i])){
                System.out.print(arr[i] + ", ");
            }
        }
        if(insert(arr[arr.length-1])){
            System.out.print(arr[arr.length-1] + " ");
        }
    }

    public boolean search(E e){
        if(root == null){
            return false;
        }else{
            TreeNode<E> current = root;
            while(current != null){
                if(current.element.compareTo(e) < 0){
                    current = current.rightNode;
                }else if(current.element.compareTo(e) > 0){
                    current = current.leftNode;
                }else{
                    return true;
                }
            }
        }
        return false;
    }

    public boolean insert(E e){
        if(root == null){
            root = new TreeNode<E>(e);
            return true;
        }else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;

            while(current != null){
                if(current.element.compareTo(e) > 0){
                    parent = current;
                    current = current.leftNode;
                }else if(current.element.compareTo(e) < 0){
                    parent = current;
                    current = current.rightNode;
                }else{
                    return false;
                }
            }

            if(parent.element.compareTo(e) > 0){
                parent.leftNode = new TreeNode<E>(e);
                return true;
            }else if(parent.element.compareTo(e) < 0){
                parent.rightNode = new TreeNode<>(e);
                return true;
            }
        }
        size++;
        return false;
    }

    public int getSize(){
        return size;
    }

    public int height(){
        return height(root);
    }

    private int height(TreeNode <E> node){
        if(node == null){
            return -1;
        }

        int leftHeight = height(node.leftNode);
        int rightHeight = height(node.rightNode);

        return Math.max(leftHeight,rightHeight) + 1;
    }

    public E getRoot(){
        return root.element;
    }

    public E minValue(){
        TreeNode<E> current = root;
        while(current.leftNode != null){
            current = current.leftNode;
        }
        return current.element;
    }

    public E maxValue(){
        TreeNode<E> current = root;
        while(current.rightNode != null){
            current = current.rightNode;
        }
        return current.element;
    }

    public ArrayList<TreeNode<E>> path(E e){
        ArrayList<TreeNode<E>> list = new ArrayList<>();
        TreeNode<E> current = root;
        while(current != null){
            if(current.element.compareTo(e) > 0){
                list.add(current);
                current = current.leftNode;
            }else if(current.element.compareTo(e) < 0){
                list.add(current);
                current = current.rightNode;
            }else{
                list.add(current);
                return list;
            }
        }
        return list;
    }

    public boolean delete(E e){
        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while(current != null){
            if(current.element.compareTo(e) > 0){
                parent = current;
                current = current.leftNode;
            }else if(current.element.compareTo(e) < 0){
                parent = current;
                current = current.rightNode;
            }else{
                break;
            }
        }

        if(current == null){
            return false;
        }

        if(current.leftNode == null){
            if(parent == null){
                root = current.rightNode;
            }else{
                if(parent.element.compareTo(current.element) < 0){
                    parent.rightNode = current.rightNode;
                }else{
                    parent.leftNode = current.rightNode;
                }
            }
        }else{
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> RightMost = current.leftNode;

            while(RightMost.rightNode != null){
                parentOfRightMost = RightMost;
                RightMost = RightMost.rightNode;
            }

            current.element = RightMost.element;

            if(parentOfRightMost.rightNode == RightMost){
                parentOfRightMost.rightNode = RightMost.leftNode;
            }else{
                parentOfRightMost.leftNode = RightMost.leftNode;
            }
        }
        size--;
        return true;
    }

    public boolean clear(){
        root = null;
        size = 0;
        return true;
    }

    public void inorder(){
        inorder(root);
    }
    protected void inorder(TreeNode<E> root){
        if(root == null){
            return;
        }else{
            inorder(root.leftNode);
            System.out.print( root.element + " ");
            inorder(root.rightNode);
        }
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(TreeNode<E> root) {
        if(root == null){
            return;
        }
        else{
            postOrder(root.leftNode);
            postOrder(root.rightNode);
            System.out.print(root.element + " ");
        }
    }

    public void preOrder(){
        preorder(root);
    }

    private void preorder(TreeNode<E> root) {
        if(root == null){
            return;
        }else{
            System.out.print(root.element + " ");
            preorder((root.leftNode));
            preorder(root.rightNode);
        }

    }
}

