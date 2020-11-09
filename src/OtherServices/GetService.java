package OtherServices;

import Clients.Clients;
import Hotels.Rooms.Rooms;
import Interface.Services;
import MethodsForCheckingInteger.CheckInteger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GetService {
    Scanner scanner = new Scanner(System.in);
    CheckInteger checkInteger = new CheckInteger();

    public Services getService(String type, Clients client, Rooms room){
        if (type == null){
            return null;
        }else if(type.equals("buffets")){
            return new Buffets(client,room);
        }else if(type.equals("golf")){
            return new Golf(client,room);
        }else if(type.equals("sightseeing")){
            return new Sightseeing(client,room);
        }
        return null;
    }
    public ArrayList<Services> createServicesList(){
        ArrayList<Services> servicesList = new ArrayList<>();
        return servicesList;

    }


    public void addServices(ArrayList<Services> servicesList,Services service){
        servicesList.add(service);
    }

    public void showActiveServices(ArrayList<Services> servicesList){
        for (Services a: servicesList) {
            a.getClientInfo();

        }
    }
}
