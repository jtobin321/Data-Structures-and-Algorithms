public class IterativePreorderTraversal() {
    // Problem Description:
    // Given a binary tree, write a method to iteratively traverse 
    // the tree in the preorder manner. Mark a node as visited 
    // by adding its data to a list - Arraylist <Integer> 
    // preorderedList. Return this list.

    public ArrayList<Integer> preorderItr(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        if (root == null) { return al; }
        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        nodeStack.push(root);
        
        while (!nodeStack.empty()) {
            TreeNode mynode = nodeStack.peek();
            al.add(nodeStack.pop().data);
            
            if (mynode.right != null) { 
                nodeStack.push(mynode.right); 
            } 
            if (mynode.left != null) { 
                nodeStack.push(mynode.left); 
            } 
        }
        return al;   
    }
}