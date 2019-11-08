import java.util.ArrayList;
import java.util.List;

class Solution {
    public void sumGetter(TreeNode t, int sum){
        if(t == null) return;
        sum = sum*10 + t.val;
        if(t.left == null && t.right == null){
            myList.add(sum);
        }
        else{
            sumGetter(t.left, sum);
            sumGetter(t.right, sum);
        }
    }
    List<Integer> myList = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
        sumGetter(root, 0);
        int sum = 0;
        for(Integer num : myList){
            sum+= num;
        }
        return sum;
    }
}