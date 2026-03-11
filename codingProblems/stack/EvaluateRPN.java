package codingProblems.stack;

import java.util.Stack;

public class EvaluateRPN {
    public static void main(String[] args) {

        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));

    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            int result;

            if (token.equals("+")) {
                int secondNum = stack.pop();
                int firstNum = stack.pop();

                result = firstNum + secondNum;

                stack.push(result);

            } else if (token.equals("-")) {
                int secondNum = stack.pop();
                int firstNum = stack.pop();

                result = firstNum - secondNum;

                stack.push(result);

            } else if (token.equals("*")) {
                int secondNum = stack.pop();
                int firstNum = stack.pop();

                result = firstNum * secondNum;

                stack.push(result);

            } else if (token.equals("/")) {
                int secondNum = stack.pop();
                int firstNum = stack.pop();

                result = firstNum / secondNum;
                
                stack.push(result);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.peek();
        
    }
    
}
