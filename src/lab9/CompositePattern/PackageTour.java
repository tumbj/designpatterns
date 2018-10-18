package lab9.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class PackageTour  implements  Tour{
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();

    public PackageTour(String packageName, List<Tour> tours) {
        this.packageName = packageName;
        this.tours = tours;
    }



    @Override
    public String getName() {
        return packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours)
            total += t.getPrice();
        return total*0.9;
    }

    @Override
    public int getAvailableSeats() {
        int availableSeats = Integer.MAX_VALUE;
        for (Tour t : tours){
            if(availableSeats > t.getAvailableSeats() ) {
                availableSeats = t.getAvailableSeats();
            }
        }
        return availableSeats;
    }
    @Override
    public String toString(){
        return "Name :"+packageName +", Price :"+getPrice() +", Available Seats :"+ getAvailableSeats();
    }

}
