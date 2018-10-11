package DecoratorPattern;

public class QuackEcho implements Quackable {
    Quackable duck;
    public QuackEcho(Quackable duck) {
        this.duck= duck;
    }
    public void quack() {
        duck.quack();
        System.out.print("Echo :");
        duck.quack();

    }
}
