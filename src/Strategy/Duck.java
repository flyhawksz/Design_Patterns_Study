package Strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public Duck(){

    }

    public void quack(){

//        System.out.println("I am quacking");
        quackBehavior.quack();

    }

    public void fly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("I am swim!");
    }

    public abstract void display();


}
