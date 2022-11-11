package Homeworks.Seminar_4;
// () [] {}
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(([]){})"));//7 0 1 2 3

    }

    public static boolean isValid(String s) {
        s = s.replaceAll(" ", "");
        System.out.println(s);
        if ((s.length() % 2 != 0) ||
                (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}' ||
                        s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '[' ||
                        s.charAt(s.length() - 1) == '{')) return false;
        int size = s.length();
        int first = 0;
        int second = 1;
        while (size != 0 && second != size) {
            if (s.charAt(first) == '(' && s.charAt(second) == ')' ||
                    s.charAt(first) == '[' && s.charAt(second) == ']' ||
                    s.charAt(first) == '{' && s.charAt(second) == '}') {
                s = getNewStr(s, first, second);
                size -= 2;
                first = 0;
                second = 1;
            } else {
                first++;
                second++;
            }
        }
        if (s.length() == 0) return true;
//        if (check1(s) || check2(s)) return true;
        return false;
    }

    public static String getNewStr(String s, int first, int second) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i != first && i != second) {
                newStr.append(s.charAt(i));
            }
        }
        return newStr.toString();
    }
}
//    public static boolean check1(String s) {  //для вида "([{{}])"
//        int start = 0;
//        int end = s.length() - 1;
//        while (start < end) {
//            if ((s.charAt(start) == '(' && s.charAt(end) == ')') ||
//                    (s.charAt(start) == '[' && s.charAt(end) == ']') ||
//                    (s.charAt(start) == '{' && s.charAt(end) == '}')) {
//                start++;
//                end--;
//                continue;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean check2(String s) {
//        for (int i = 0; i < s.length() - 1; i+=2) {
//            if (((s.charAt(i) == '(' && s.charAt(i + 1) == ')') ||
//                    (s.charAt(i) == '[' && s.charAt(i + 1) == ']') ||
//                    (s.charAt(i) == '{' && s.charAt(i + 1) == '}'))) {
//                continue;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }
//}

