class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
         ArrayList<Integer> res=new ArrayList<>();
         Deque<TreeNode> q=new LinkedList<>();
        q.addFirst(root);
        while(!q.isEmpty()){
            TreeNode curr=q.removeFirst();
            if(curr==null){continue;}
            res.add(curr.val);
            q.addFirst(curr.right);
            q.addFirst(curr.left);
        }
        return res;
    }
}
