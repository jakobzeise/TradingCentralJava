package day5.part3;

public class InterfaceLearning implements CanSwim{

    @Override
    public void printSomething() {

    }

    @Override
    public void makeFlySound() {

    }
}

interface CanSwim extends CanFly{
    void printSomething();
}

interface CanFly {
    void makeFlySound();
}
