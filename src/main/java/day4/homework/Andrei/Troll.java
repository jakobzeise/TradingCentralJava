package day4.homework.Andrei;

public class Troll {
    public static String disemvowel(String str) {
        StringBuilder sb = new StringBuilder(str);

        for(int i = sb.length() - 1; i >= 0; i--){
            if("AEIOUaeiou".indexOf(sb.charAt(i)) != -1){
                sb.deleteCharAt(i);
            }
        }

        return sb.toString();
    }
}
