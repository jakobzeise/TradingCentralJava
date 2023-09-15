package day5.part3.homework.andrei;

public class NotEnoughBalanceException extends RuntimeException {
    public NotEnoughBalanceException(){
        super();
    }
    public NotEnoughBalanceException(String message){
        super(message);
    }
}
