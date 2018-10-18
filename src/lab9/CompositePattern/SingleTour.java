package lab9.CompositePattern;

public class SingleTour implements  Tour {
    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;

    public SingleTour(String name, double price, int allSeats, int reservedSeats) {
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
        this.reservedSeats = reservedSeats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAllSeats() {
        return allSeats;
    }

    public void setAllSeats(int allSeats) {
        this.allSeats = allSeats;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        if (reservedSeats <= (allSeats-this.reservedSeats)) {
            this.reservedSeats = reservedSeats;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getAvailableSeats() {
        if(allSeats - reservedSeats < 0) return  0;
        return allSeats - reservedSeats ;
    }

    @Override
    public String toString() {
        return "Name :"+name +" ,Price :"+price+" ,AvailableSeats :"+getAvailableSeats();
    }
}
