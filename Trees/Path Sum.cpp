class Solution {
public:
    bool hasPathSum(TreeNode* root, int sum) {
        if(!root){return NULL;}
        bool a=false;
        if(sum-root->val==0 && root->left==NULL && root->right==NULL){return true;}
       else{
           return hasPathSum(root->left,sum-root->val) ||  hasPathSum(root->right,sum-root->val) ;
       }
    }
};
