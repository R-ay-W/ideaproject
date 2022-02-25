package TopInterviewQuestions.Easy;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

  //Definition for a binary tree node.



public class InorderTraversal {
    /**
     * 递归
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> listl = new ArrayList<>();
        List<Integer> listr = new ArrayList<>();
        if(root.left!=null){
            listl = inorderTraversal(root.left);
        }
        if(root.right!=null){
            listr = inorderTraversal(root.right);
        }
        List<Integer> ans = new ArrayList<>();
        ans.addAll(listl);
        ans.add(root.val);
        ans.addAll(listr);
        return ans;
    }
     */

    /**
     * 迭代
     */
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stk = new LinkedList<>();
        while(root!= null || !stk.isEmpty()){
            while(root!=null){
                stk.push(root);
                root = root.left;
            }
            root=stk.pop();//The element is popped from the top of the deque and is removed from the same
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

}
