package Strategy;

public class NoQuckBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can not quack!");
    }
}
