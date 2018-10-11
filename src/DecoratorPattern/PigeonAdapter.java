package DecoratorPattern;



public class PigeonAdapter implements Quackable{
    Pigeon pigeon;
    @Override
    public void quack() {

        pigeon.coo();
        pigeon.coo();
        System.out.println();
    }
    public PigeonAdapter(Pigeon pigeon){
        this.pigeon = pigeon;
    }
}
