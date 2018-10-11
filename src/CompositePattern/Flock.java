package CompositePattern;


import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    boolean flag= false;

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();

        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            if (!flag) {
                System.out.println("Sergent start Quack");
                quacker.quack();
                quacker.quack();
                quacker.quack();
                System.out.println("Sergent finish Quack");
                flag = true;
            } else {
                quacker.quack();
            }
        }



    }
}
