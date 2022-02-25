package TopInterviewQuestions.Easy;

import java.util.ArrayList;
import java.util.List;

public class YangHuisTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a0 = new ArrayList<>();
        a0.add(1);
        List<Integer> a1 = new ArrayList<>();
        a1.add(1);
        a1.add(1);
        ans.add(a0);
        if (numRows == 1) {
            return ans;
        }
        ans.add(a1);
        if (numRows == 2) {
            return ans;
        }

        for (int i = 3; i <= numRows; i++){
            List<Integer> prev = ans.get(i-2);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 0; j<prev.size()-1; j++){
                curr.add(prev.get(j)+prev.get(j+1));
            }
            curr.add(1);
            ans.add(curr);
        }
        return ans;

    }
}
