#include<algorithm>
class Solution {
public:
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> res;
        if(!root){
            return res;
        }
        queue<TreeNode*>q;
        q.push(root);
        bool c=false;
        while(!q.empty()){
            c=!c;
            int i;
            vector<int>v;
            int j=q.size();
            for(i=0;i<j;i++){
            TreeNode* temp=q.front();
                q.pop();
                v.push_back(temp->val);
                if(temp->left){
                    q.push(temp->left);
                }
                if(temp->right){
                    q.push(temp->right);
                }
}
            if(c){res.push_back(v);}
            else{reverse(v.begin(),v.end());
                res.push_back(v);}
        }return res; 
    }
};
