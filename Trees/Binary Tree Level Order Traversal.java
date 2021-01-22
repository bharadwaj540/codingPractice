class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){return res;}
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> sub=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
            TreeNode curr=q.remove();
            sub.add(curr.val);
            if(curr.left!=null){q.add(curr.left);}
            if(curr.right!=null){q.add(curr.right);}
            }
            res.add(sub);
        }
        return res;
    }
}
