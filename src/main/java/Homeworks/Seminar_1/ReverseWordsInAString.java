package Homeworks.Seminar_1;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "  Bob    Loves  Alice   ";
//        "  Bob    Loves  Alice   "
//        "  hello world  "
//        "a good   example"
//        "   fffff  ff gg ee";
//        "I     ueG7yY0Tgo i8Q9SUKyLz    vk4zC 9p      eDpBX96MRL  IhzW  K   T    6FzR0 yKYgG"


        StringBuilder sb = new StringBuilder();
        int endInd = s.length() - 1;
        int startInd = endInd - 1;
        while (startInd >= 0) {
            if (s.charAt(endInd) != ' ') {
                if (s.charAt(startInd) == ' ') {
                    sb.append(s.substring(startInd + 1, endInd + 1) + ' ');
                    endInd = startInd - 1;
                }
                startInd--;
            }
            else {
                endInd--;
                startInd = endInd - 1;
            }
        }
        sb.append(s.substring(0, endInd + 1));
        while (sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() -1);
        }
        System.out.println(sb.toString());

    }
}

