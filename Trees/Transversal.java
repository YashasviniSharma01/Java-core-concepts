package Trees;
class Node {
    int val;
    Node left;
    Node right;
    public Node(int item){
        val = item;
        left=right=null;
    }
}
public class Transversal {
    public void inorder(Node root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public void preorder(Node root){
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right= new Node(3);
        root.left.left= new Node (4);
        root.left.right = new Node (5);

        Transversal tree = new Transversal();
        tree.preorder(root);
        //tree.inorder(root);
        //tree.postorder(root);
    }
}
