package Hotels.Rooms;

import Clients.Clients;
import Interface.Services;
import MethodsForCheckingInteger.CheckInteger;
import OtherServices.GetService;

import java.util.ArrayList;
import java.util.Scanner;

public class Rooms {
    int roomNumber;
    String type;
    public int price;
    int duration;
    public static final int MaxPeople = 2;

    public Rooms() {
    }

    public Rooms(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "roomNumber=" + roomNumber +
                ", type='" + type + '\'' +
                ", price/day/client=" + getType() +
                '}';
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getType() {
        switch (type) {
            case "normal":
                price = 150000;
                break;
            case "luxury":
                price = 300000;
                break;
            case "VIP":
                price = 500000;
                break;
        }
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    ///Add client to rooms///


    Scanner scanner = new Scanner(System.in);
    CheckInteger checkInteger = new CheckInteger();
    ArrayList<Clients> clientsList = new ArrayList<>(MaxPeople);


    public void addClient(Clients a) {
        if (clientsList.size() < MaxPeople) {
            clientsList.add(a);
        } else {
            System.out.println("Room already full!");
        }
    }

    public void removeClient() {
        if (clientsList.size() == 1) {
            clientsList.remove(0);
        } else if (clientsList.size() == 2) {
            clientsList.remove(1);
            clientsList.remove(0);
        }
    }

    public int checkClient() {
        return clientsList.size();
    }

    public void addStayingDuration() {
        System.out.println("How many day would you like to stay? ");
        setDuration(Integer.parseInt(scanner.nextLine()));
    }
//
    public void getClientsInfo() {
        for (Clients a : clientsList) {
            System.out.println(a.toString());
        }
    }

    public Clients createClient() {
        Clients client = new Clients();
        System.out.println("Enter client name");
        client.setName(scanner.nextLine());
        System.out.println("Enter client ID ");
        client.setId(scanner.nextLine());
        System.out.println("Enter client age");
        client.setAge(checkInteger.checkIfInt());
        return client;
    }

//    public Clients editClientById() {
//        Clients willBeEdited = null;
//        if (clientsList.size() == 0) {
//            System.out.println("Room currently don't have any client");
//        } else {
//            getClientsInfo();
//            System.out.println("Enter client ID you would like to edit!");
//            String inputID = scanner.nextLine();
//            for (Clients a : clientsList) {
//                if (inputID.equals(a.getId())) {
//                    System.out.println("Re-enter client name");
//                    a.setName(scanner.nextLine());
//                    System.out.println("Re-enter client ID");
//                    a.setId(scanner.nextLine());
//                    System.out.println("Re-enter client age");
//                    a.setAge(checkInteger.checkIfInt());
//                    willBeEdited = a;
//                }
//            }
//        }
//        return willBeEdited;
//    }
    public void checkIfRoomHaveClient(){
        if (clientsList.size() == 0){
            System.out.println("Room currently don't have any client");
        } else{
//            getClientsInfo();
        }
    }
    public Clients getClientUsingName(String name){
        Clients target = null;
        for(Clients a:clientsList){
            if(name.equals(a.getName())){
                target = a;
            }
        }
        return target;
    }
    public ArrayList<Clients> getClientsList(){
        return clientsList;
    }
    public void deletedClient(){

    }
}