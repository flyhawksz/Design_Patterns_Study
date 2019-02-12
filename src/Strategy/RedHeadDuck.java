package Strategy;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        this.quackBehavior = new JijiQuackBehavior();
        this.flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display(){
        System.out.println("**RedHeadDuck**");
    }


}
