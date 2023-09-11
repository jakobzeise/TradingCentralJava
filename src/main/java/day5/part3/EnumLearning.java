package day5.part3;

public class EnumLearning {

    public static void main(String[] args) {



        printLevel(Level.LOW);


    }

    public static void test(String level) {
        System.out.println(level);
    }
    public static void printLevel(Level level) {
        if (level == Level.LOW) {
            System.out.println("You are a beginner");
        } else if (level == Level.MEDIUM){
            System.out.println("You are intermediate");
        } else {
            System.out.println("You are a pro");
        }
    }
}

// enum -> enumeration
enum Level {
    LOW, MEDIUM, HIGH
}

