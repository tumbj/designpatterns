package AbstractFactoryPattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
       // AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckFactory duckFactory1 = new CountingAndEchoDuckFactory();
        simulator.simulate(duckFactory1);// polymorphism

    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + "times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}