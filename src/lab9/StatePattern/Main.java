package lab9.StatePattern;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Station st1 = new Station("MORCHIT",35);
        Station st2 = new Station("PERNJIT",50);
        Station st3 = new Station("SIAM",70);
        List<Station> stations = new ArrayList<Station>();
        stations.add(st1);
        stations.add(st2);
        stations.add(st3);

        VendingMachine ticketMachine = new VendingMachine(stations);



        ticketMachine.ticketOut();
        ticketMachine.chooseStation("SIAM");
        ticketMachine.paid(45);
        ticketMachine.paid(35);

        ticketMachine.chooseStation("PERNJIT");
        ticketMachine.paid(50);


    }
}
