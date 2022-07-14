package summerClasses.BusTicketSystem;

import java.util.ArrayList;
import java.util.List;

public class BusOperator {

    List<Bus> busList=new ArrayList<>();
    public void addBus(String busNumber ,String operatorName,String source,String destination,int fair,int seat){
        Bus bus=new Bus(busNumber,operatorName,source,destination,fair,seat);
        busList.add(bus);

    }
    public List<Bus> searchBus(String source,String destination){
        List<Bus> resultList=new ArrayList<>();
        for(Bus bus:busList){
            if(bus.getSource().equals(source) && bus.getDestination().equals(destination) && bus.getSeat()>0){
                resultList.add(bus);
            }
        }
        return resultList;
    }
    public void busBooking(String operator){

            for(Bus bus:busList){


                if(bus.getOperatorName().equals(operator)){

                    if(bus.getSeat()>0){

                        bus.setSeat(bus.getSeat()-1);
                        System.out.println("Bus booked!");
                        System.out.println(bus);
                    }
                    else{
                        System.out.println("No seats are available in this bus.");
                    }
                }
            }

    }
}
