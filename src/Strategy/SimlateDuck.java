package Strategy;

import Strategy.Duck;

public class SimlateDuck {

    public static void main(String[] args){
        Duck greenHeadDuck = new GreenHeadDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        StoneDuck stoneDuck = new StoneDuck();

        greenHeadDuck.display();
        greenHeadDuck.quack();
        greenHeadDuck.swim();

        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.fly();

        stoneDuck.display();
        stoneDuck.quack();
        stoneDuck.fly();

    }


}
