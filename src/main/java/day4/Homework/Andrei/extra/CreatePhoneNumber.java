package day4.Homework.Andrei.extra;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        sb.append("(");
        int index = 0;
        for(; index < 3; index++){
            sb.append(numbers[index]);
        }
        sb.append(") ");

        for(; index < 6; index++){
            sb.append(numbers[index]);
        }
        sb.append("-");

        for(; index < numbers.length; index++){
            sb.append(numbers[index]);
        }

        return sb.toString();
    }

}
