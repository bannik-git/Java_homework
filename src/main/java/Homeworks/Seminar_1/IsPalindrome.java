package Homeworks.Seminar_1;

public class IsPalindrome {
    public static void main(String[] args) {
            String s = "A man, a plan, a canal: Panama";

            int start = 0;
            int end = s.length() - 1;
            s = s.toLowerCase();
            String answer = "Эта строка Палиндром";
            while (start < end) {
                if (!Character.isLetter(s.charAt(start)) && !Character.isDigit(s.charAt(start))) {
                    start++;
                    continue;
                }
                if (!Character.isLetter(s.charAt(end)) && !Character.isDigit(s.charAt(end))) {
                    end--;
                    continue;
                }
                if (s.charAt(start) != s.charAt(end)) {
                    answer = "Это не палиндром";
                    break;
                }
                start++;
                end--;

            }
        System.out.println(answer);

    }
}
