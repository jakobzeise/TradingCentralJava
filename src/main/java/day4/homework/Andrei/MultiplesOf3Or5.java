package day4.homework.Andrei;
import java.util.ArrayList;
public class MultiplesOf3Or5 {
    public int solution(int number){
        if(number < 0){
            return 0;
        }

        ArrayList<Integer> multiples = new ArrayList<>();
        for(int i = 1; i < number; i++){
            if(i % 3 == 0 || i % 5 == 0){
                multiples.add(i);
            }
        }

        int sum = 0;
        for(int item : multiples){
            sum += item;
        }

        return sum;
    }
}
