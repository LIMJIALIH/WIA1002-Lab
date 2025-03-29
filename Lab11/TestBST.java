
package Lab11;
import java.util.ArrayList;

public class TestBST {
    public static void main(String[] args) {

        System.out.print("\nInput Data: ");
        Integer [] numbers = {45,88,54,76,98,1,2,20,6,53,42,100,86,32,28,65,14};
        BST<Integer> tree = new BST<>(numbers);
        
        System.out.print("\nInorder (sorted):");
        tree.inorder();

        System.out.print("\nPostorder: ");
        tree.postOrder();

        System.out.print("\nPreorder: ");
        tree.preOrder();

        System.out.print("\nHeight of BST: " + tree.height());
        System.out.print("\nRoot for BST is: " + tree.getRoot());

        System.out.print("\nCheck whether 10 is in the tree? " + tree.search(10));
        
        if(tree.delete(53)){
            System.out.print("\nDelete 53");
        }

        System.out.print("\nUpdated Inorder data (sorted): ");
        tree.inorder();

        System.out.print("\nMin Value: " + tree.minValue());
        System.out.print("\nMax Value: " + tree.maxValue());

        ArrayList<TreeNode<Integer>> path = tree.path(6);
        System.out.print("\nA path from the root to 6 is: ");
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i).element + " ");
        }
    }
}
