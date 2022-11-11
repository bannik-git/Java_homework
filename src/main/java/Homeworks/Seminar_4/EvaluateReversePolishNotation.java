package Homeworks.Seminar_4;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
//        String[] tokens = {"2","1","+","3","*"};
//        String[] tokens = {"4","13","5","/","+"};
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        int answer = 0;
        int signIndex = 0;
        int leftNumberIndex = 0;
        int offset = 3;
        boolean firstSign = true;
        while (signIndex < tokens.length) {
            if (signСheck(tokens[signIndex])) {
                if (firstSign) {
                    answer = getInt(Integer.valueOf(tokens[signIndex - 2]), Integer.valueOf(tokens[signIndex - 1]), tokens[signIndex]);
                    firstSign = false;
                    leftNumberIndex = signIndex - offset;
                } else {
                    if (signСheck(tokens[signIndex - 1])) {
                        answer = getInt(Integer.valueOf(tokens[leftNumberIndex--]), answer, tokens[signIndex]);
                    } else {
                        answer = getInt(answer, Integer.valueOf(tokens[signIndex - 1]), tokens[signIndex]);
                    }
                }
            }
                signIndex++;

        }
        return answer;
    }
    public static boolean signСheck (String s) {
        String[] sign = {"+", "-", "*", "/"};
        for (int i = 0; i < sign.length; i++){
            if (s == sign[i]) return true;
        }
        return false;
    }
    public static int getInt (int first, int second, String sign) {
        int answer = 0;
        switch (sign){
            case "+":
                answer = first + second;
                break;
            case "-":
                answer = first - second;
                break;
            case "*":
                answer = first * second;
                break;
            case "/":
                answer = first / second;
                break;
        }
        return answer;
    }

}
