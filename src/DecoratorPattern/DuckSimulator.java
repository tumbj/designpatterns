package DecoratorPattern;




public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
//        Quackable gooseDuck = new QuackEcho(new QuackCounter(new GooseAdapter(new Goose())));
         Quackable gooseDuck = (new QuackEcho(new GooseAdapter(new Goose())));
        //แตกต่่างกัน เพราะ แบบ QuackEcho(new QuackCounter(... มันจะเพิ่ม echo นับเข้าไปใน count er ด้วย
         Quackable pigeonDuck = new QuackEcho(new PigeonAdapter(new Pigeon()));

        System.out.println("Duck Simulator: With Goose Adapter,Pigeon Adapter and Echo ");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);

        System.out.println("The ducks quacked " +
                            QuackCounter.getQuacks() + "times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
