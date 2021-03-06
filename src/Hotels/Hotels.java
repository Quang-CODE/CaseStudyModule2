package Hotels;

import Clients.Clients;
import Hotels.Rooms.Rooms;
import MethodsForCheckingInteger.CheckInteger;

import java.util.ArrayList;
import java.util.Scanner;

public class Hotels {
    private String name;
    private String address;
    private int star;
    Scanner scanner = new Scanner(System.in);
    CheckInteger checkInteger = new CheckInteger();

    public Hotels(String name, String address, int star) {
        this.name = name;
        this.address = address;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }



    /////////////////////////////////////////////////////////////
    public ArrayList<Rooms> createRoomsList(){
        ArrayList<Rooms> roomsList = new ArrayList<>();
        return roomsList;
    }

    public void roomPrice(ArrayList<Rooms> list){
        System.out.println("Enter room number to check price");
        int checkRoom = checkInteger.checkIfInt();
        for (Rooms a:list) {
            if(checkRoom == a.getRoomNumber()){
                System.out.println("Room " + a.getRoomNumber() +": " + a.getType()*a.checkClient()*a.getDuration());
            }
        }
    }

    public void getAllRoomsInfo(ArrayList<Rooms> myRooms){
        for (Rooms a:myRooms) {
            System.out.println(a.toString());
            System.out.println("The price of room " + a.getRoomNumber() +":" + a.getType()*a.checkClient()*a.getDuration());
            a.getClientsInfo();
            System.out.println("Staying duration:" + a.getDuration());
            System.out.println();

        }
    }
    public void showAllClientsInfo(ArrayList<Rooms> myRooms){
        for(Rooms a:myRooms){
            a.getClientsInfo();
            System.out.println();
        }
    }

    public String toString() {
        return "Hotels{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", star=" + star +
                '}';
    }
    public void showAvailableRoom(ArrayList<Rooms> myRooms){
        for (Rooms room:myRooms) {
            if(room.checkClient() < Rooms.MaxPeople){
                System.out.println(room.toString());
            }
        }
    }
    public void checkInClient(ArrayList<Rooms> myRooms){
        System.out.println("Enter the room number you would like to choose");
        int input = checkInteger.checkIfInt();
        for (Rooms a:myRooms){
            if(a.getRoomNumber() == input){
                a.addStayingDuration();
                System.out.println("_ENTER CLIENT INFO_");
                a.addClient(a.createClient());
            }
        }

    }
    public void getClientByName(ArrayList<Rooms> myRooms,String name){
        for(Rooms a:myRooms) {
            if (a.getClientUsingName(name) != null) {
                System.out.println(a.getClientUsingName(name).toString());
            }

            }
        }

    public void removeClientsFromRoom(ArrayList<Rooms> roomList){
        System.out.println("Enter room number");
        int input = checkInteger.checkIfInt();
        for (Rooms a:roomList){
            if(input == a.getRoomNumber()){
                a.removeClient();
                a.setDuration(0);
            }
        }
    }
    public void editClientUsingName(ArrayList<Rooms> roomList,String name){
        for(Rooms a:roomList){
            if(a.getClientUsingName(name) != null){
                a.getClientsList().remove(a.getClientUsingName(name));
                a.addClient(a.createClient());
//                System.out.println("Re-enter client name");
//                a.getClientUsingName(name).setName(scanner.nextLine());
//                System.out.println("Re-enter client ID");
//                a.getClientUsingName(name).setId(scanner.nextLine());
//                System.out.println("Re-enter client age");
//                a.getClientUsingName(name).setAge(checkInteger.checkIfInt());
//                System.out.println("Done!!!");
            }
        }
    }
}

