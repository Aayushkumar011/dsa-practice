import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int val;
    Node left,right;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}

// Solution function--------------------------------------------------------------------------//
public class Root_Equals_Sum_Of_Child {
    public static boolean root_Equals_Sum_Of_Child(Node n){
        int temp = n.left.val + n.right.val;
        if(n.val==temp)return true;
        return false; 
    }

    // Solution function ends --------------------------------------------------------------------------//

public static Node buildTreeLevelOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root value (or -1 for null): ");
        int val = sc.nextInt();
        if (val == -1) return null;

        Node root = new Node(val);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            System.out.println("Enter left child of " + curr.val + " (-1 for null): ");
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                curr.left = new Node(leftVal);
                q.add(curr.left);
            }

            System.out.println("Enter right child of " + curr.val + " (-1 for null): ");
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                curr.right = new Node(rightVal);
                q.add(curr.right);
            }
        }
        return root;
    }
    public static void main(String[] args){
        Node root = buildTreeLevelOrder();
        System.out.println(root_Equals_Sum_Of_Child(root));
    }
}
