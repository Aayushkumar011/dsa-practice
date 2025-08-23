import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    Node left,right;
    int val;

    Node(int val){
        this.val = val;
        left = right = null;
    }
}

class Pair{
    Node n;
    int val;
    Pair(Node n,int val){
        this.n = n;
        this.val = val;
    }
}


public class Max_Width_Of_Tree {

    //Solution-----------------------------------------------------------------------
public static int helper(Node root){
    if(root==null)return 0;
    Queue<Pair> q = new LinkedList<>();
    q.add(new Pair(root,0));
    int s=0;
    while(!q.isEmpty()){
        int l = q.size();
        int currVal = q.peek().val;
        int left = 0;
        int right = 0;
        for(int i=0;i<l;i++){
            Node n = q.peek().n;
            int level_Val = q.peek().val;
            int Value = level_Val-currVal;
            q.poll();
            if(n.left!=null){
                q.add(new Pair(n.left,Value*2+1));
            }
            if(n.right!=null){
                q.add(new Pair(n.right,Value*2+2));
            }
            if(i==0)left = Value;
            if(i==l-1)right = Value;
        }
        s = Math.max(s,right-left+1);
    }
    return s;
}
//Solution ends-----------------------------------------------------------------------

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
        System.out.println(helper(root));
    }
}
