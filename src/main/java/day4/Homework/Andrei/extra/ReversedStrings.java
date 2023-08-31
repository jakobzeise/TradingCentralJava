package day4.Homework.Andrei.extra;

public class ReversedStrings {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
