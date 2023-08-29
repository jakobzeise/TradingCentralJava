package day4.homework.Emil;


public class MultiplesOf3or5 {

    public static void main(String[] args) {
        System.out.println(solution(-50));
    }

    public static int solution(int number) {
        //TODO: Code stuff, below

        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}