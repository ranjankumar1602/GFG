class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    private static void mirror(Node root) {
        if(root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    
    private static boolean same(Node p, Node q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(p.data == q.data) {
            return same(p.left, q.left) && same(p.right, q.right);
        }
        return false;
    }
    
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root == null) {
            return true;
        }
        if(root.left == null && root.right == null) {
            return true;
        }
        
        mirror(root.right);
        
        return same(root.left, root.right);
    }
}
