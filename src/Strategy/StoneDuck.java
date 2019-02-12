package Strategy;

public class StoneDuck extends Duck {
    public StoneDuck(){
        this.quackBehavior = new NoQuckBehavior();
        this.flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display(){
        System.out.println("**StoneDuck**");

    }


}
