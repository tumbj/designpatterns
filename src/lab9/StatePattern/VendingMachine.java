package lab9.StatePattern;

import java.util.ArrayList;
import java.util.List;


public class VendingMachine {
    final static int END = 0;
    final static int READY = 1;
    final static int PAID = 2;
    int state = END;
    List<Station> stations =new ArrayList<>() ;
    Station stationNow ;
    double money;
    public VendingMachine(List<Station> stations) {
        state = END;
        this.stations = stations;
        money = 0;
    }

    public void ticketOut(){ //ออกตั๋ว
        if (state == END){
            state = READY;
            System.out.println("Next : Please select staion");
        }
        else if(state == READY){
            System.out.println("Error : Can't ticket out");
        }
        else if(state == PAID){
            System.out.println("Error : Can't ticket out");
        }
    }
    public void chooseStation(String station){
        if (state == END){
            System.out.println("Error : Can't choose station");
        }
        else if(state == READY){
            state = PAID;
            for (Station st :stations) {
                if(st.getName().equals(station)){
                    stationNow = st;
                    break;
                }
            }
            System.out.println("Station :" +
                    " "+stationNow.getName() + " Price : "+stationNow.getPrice());
        }
        else if(state == PAID){
            System.out.println("Error : Can't choose station");
        }
    }

    public double getMoney() {
        return money;
    }

    public void paid(double money){
        if (state == END){
            System.out.println("Error: Can't paid.");
        }
        else if(state == READY){
            System.out.println("Error: Can't paid.");
        }
        else if(state == PAID){
            this.money += money;
            if(this.money >= stationNow.getPrice()){
                state = END;
                if(this.money > stationNow.getPrice()){
                    System.out.println("Your money receive is "+ (this.money-stationNow.getPrice()));
                }

                System.out.println("Thank you . Have a nice day.");
                this.money= 0;
            }
            else{
                System.out.println("Error : Money is not enough. You should paid more is "+(stationNow.getPrice()-this.money));
            }


        }

    }
}
