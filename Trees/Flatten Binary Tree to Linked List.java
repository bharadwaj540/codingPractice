class Solution {
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> res=new ArrayList<>();
        if(root==null || root.left==null && root.right==null){return;}
        preOrder(root,res);
        for(TreeNode i:res){
            root.left=null;
            root.right=i;
            root=root.right;
        }
    }
   public void preOrder(TreeNode root,ArrayList<TreeNode> res){
        if(root==null){return;}
        res.add(root);
        preOrder(root.left,res);
        preOrder(root.right,res);
    }
}
