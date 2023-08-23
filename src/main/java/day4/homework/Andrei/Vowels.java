package day4.homework.Andrei;

public class Vowels {
    public static int getCount(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++)
            if ("AEIOUaeiou".indexOf(str.charAt(i)) != -1){
                count++;
            }

        return count;
    }
}
