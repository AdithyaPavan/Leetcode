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
public:
    TreeNode* recoverFromPreorder(string traversal) {
        stack<TreeNode*> st;
        int i = 0, n = traversal.size();
        
        while (i < n) {
            int depth = 0;
            
            // Count depth by counting dashes '-'
            while (i < n && traversal[i] == '-') {
                depth++;
                i++;
            }
            
            // Read the number (node value)
            int value = 0;
            while (i < n && isdigit(traversal[i])) {
                value = value * 10 + (traversal[i] - '0');
                i++;
            }
            
            TreeNode* node = new TreeNode(value);
            
            // If depth is greater than stack size, it means it's a child of the last node in stack
            while (st.size() > depth) {
                st.pop();
            }
            
            // Attach node to its parent
            if (!st.empty()) {
                if (!st.top()->left) {
                    st.top()->left = node;
                } else {
                    st.top()->right = node;
                }
            }
            
            // Push the new node onto the stack
            st.push(node);
        }
        
        // Root is at the bottom of the stack
        while (st.size() > 1) {
            st.pop();
        }
        
        return st.top();
    }
};