package DataStructure.Tree;


//创建二叉树

import javax.sql.DataSource;
import java.util.Date;

class TreeNode<Data> {
    Data data;
    TreeNode leftChildTree;
    TreeNode rightChildTree;

    public TreeNode(Data data) {
        this.data = data;
    }
}


public class BinaryTree<Data> {

    public TreeNode createBinaryTreeByArray(Data[] arr, int index) {
        TreeNode<Data> node = null;
        if (index < arr.length) {
            Data data = arr[index];
            if (data != null) {
                node = new TreeNode<>(data);
                //创建左右子树，利用父子节点的关系，进行递归运算
                node.leftChildTree = createBinaryTreeByArray(arr,2*index + 1);
                node.rightChildTree = createBinaryTreeByArray(arr,2*index + 2);
            }
        }
        return node;
    }

    public void preOrderTree(TreeNode node){
        if (node !=  null){
            System.out.print(node.data+" ");
            preOrderTree(node.leftChildTree);
            preOrderTree(node.rightChildTree);
        }
    }
    public void inOrderTree(TreeNode node){
        if(node != null){
            inOrderTree(node.leftChildTree);
            System.out.print(node.data+" ");
            inOrderTree(node.rightChildTree);
        }
    }

    public void postOrderTree(TreeNode node){
        if (node !=  null){
            postOrderTree(node.leftChildTree);
            postOrderTree(node.rightChildTree);
            System.out.print(node.data+" ");
        }
    }

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{3,9,20,null,null,15,7};
        BinaryTree<Integer> binaryTree = new BinaryTree<>();
        TreeNode binaryTreeByArray = binaryTree.createBinaryTreeByArray(arr, 0);
        binaryTree.preOrderTree(binaryTreeByArray);
        System.out.println();
        binaryTree.inOrderTree(binaryTreeByArray);
        System.out.println();
        binaryTree.postOrderTree(binaryTreeByArray);


    }

}

