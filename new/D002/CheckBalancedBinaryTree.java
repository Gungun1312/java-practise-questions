public class CheckBalancedBinaryTree {
    static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int item) {
            value = item;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        if (isBalanced(root)) {
            System.out.println("The binary tree is balanced.");
        } else {
            System.out.println("The binary tree is not balanced.");
        }
    }

    public static boolean isBalanced(TreeNode node) {
        return checkHeight(node) != -1;
    }

    private static int checkHeight(TreeNode node) {
        if (node == null) return 0;
        
        
    }
}