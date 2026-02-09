/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
private:
    int tree[10000] = {}, n = 0;
    void traverse(TreeNode* &root){
        if (root == nullptr) return;
        traverse(root->left);
        tree[n++] = root->val;
        traverse(root->right);
    }
    TreeNode* construct(int left, int right){
        if (left > right) return nullptr;
        int mid = (left + right) / 2;
        return new TreeNode(tree[mid], construct(left, mid-1), construct(mid+1, right));
    }
public:
    TreeNode* balanceBST(TreeNode* root) {
        traverse(root);
        return construct(0, n-1);
    }
};