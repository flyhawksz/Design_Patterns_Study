package Strategy;

public class GreenHeadDuck extends Duck {
    public GreenHeadDuck(){
        this.quackBehavior = new GagaQuackBehavior();
        this.flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display(){
        System.out.println("**GreenHeadDuck**");

    }


}
