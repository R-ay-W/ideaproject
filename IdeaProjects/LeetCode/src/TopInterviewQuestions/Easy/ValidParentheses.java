package TopInterviewQuestions.Easy;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ValidParentheses {

    /**
     * 栈
     */
    public boolean isValid(String s){
        int n = s.length();
        //如果字符串是奇数，一定不符合
        if(n%2==1){
            return false;
        }

        Map<Character,Character> pairs = new HashMap<>(){{
            put(')','(');
            put(']','[');
            put('}','{');
        }};

        Deque<Character> stack = new LinkedList<>();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(pairs.containsKey(ch)){//keys: ) ] }
                if(stack.isEmpty() || stack.peek() != pairs.get(ch)){//peek() returns the element at the front the container
                    return false;
                }
                stack.pop();//pop() function is used to remove an element from the front of the queue
            }
            else{// push when ( [ and {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

//    public boolean isValid(String s) {
//        while(s.contains("()")||s.contains("[]")||s.contains("{}")){
//            if(s.contains("()")){
//                s=s.replace("()","");
//            }
//            if(s.contains("{}")){
//                s=s.replace("{}","");
//            }
//            if(s.contains("[]")){
//                s=s.replace("[]","");
//            }
//        }
//        return s.length()==0;
//    }





    public static void main(String[] args) {
        ValidParentheses t1 = new ValidParentheses();
        System.out.println(t1.isValid("(){}}{"));
//        System.out.println("(){}}{".replace('('+"",""));

    }
}
