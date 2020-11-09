import Clients.Clients;
import ExportFile.ExportFile;
import Hotels.Hotels;
import Hotels.Rooms.Rooms;
import Interface.Services;
import MethodsForCheckingInteger.CheckInteger;
import OtherServices.GetService;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hotels myHotel = new Hotels("Mariotte", "HaNoi", 5);
        CheckInteger checkInteger = new CheckInteger();
        Scanner scanner = new Scanner(System.in);
        GetService myServices = new GetService();
        ArrayList<Services> servicesList = myServices.createServicesList();
        ArrayList<Rooms> myRooms = myHotel.createRoomsList();
        ExportFile exportFile = new ExportFile();
        Rooms room101 = new Rooms(101, "VIP");
        myRooms.add(room101);
        Rooms room102 = new Rooms(102, "luxury");
        myRooms.add(room102);
        Rooms room103 = new Rooms(103, "luxury");
        myRooms.add(room103);
        Rooms room104 = new Rooms(104, "normal");
        myRooms.add(room104);
        Rooms room105 = new Rooms(105, "normal");
        myRooms.add(room105);
        do {
            System.out.println("---MENU---");
            System.out.println("0.Hotel info");
            System.out.println("1.Book hotel room");
//            System.out.println("2.Using hotel services");
//            System.out.println("3.Get client info using name");
            System.out.println("2.Display all rooms info");
            System.out.println("3.Remove clients from room");
            System.out.println("4.Check room price");
//            System.out.println("7.Edit client using name");
//            System.out.println("8.Show active services");
            System.out.println("5.Create file contain clients information");
            System.out.println("6.Exit");
            switch (Integer.parseInt(scanner.nextLine())) {
                case 0:
                    System.out.println(myHotel.toString());
                    break;
                case 1:
                    myHotel.showAvailableRoom(myRooms);
                    myHotel.checkInClient(myRooms);
                    break;
//                case 2:
//                    myHotel.showAllClientsInfo(myRooms);
//                    System.out.println("Enter client room");
//                    int searchedForRoomNumber = checkInteger.checkIfInt();
//                    Rooms roomOfClientUsingService = myHotel.getRoomUsingRoomNumber(myRooms,searchedForRoomNumber);
//                    System.out.println("Enter client name");
//                    String name = scanner.nextLine();
//                    Clients clientUsingService = myHotel.getClientByName(myRooms,name);
//                    System.out.println("Hotel services included: Buffets, Golf, Sightseeing. Which one would you like to choose?");
//                    String typeOfService = scanner.nextLine();
//                    Services service = myServices.getService(typeOfService,clientUsingService,roomOfClientUsingService);
//                    servicesList.add(service);
//                    break;
//                case 3:
//                    System.out.println("Enter client name");
//                    String input = scanner.nextLine();
//                    myHotel.getClientByName(myRooms,input).toString();
//                    break;
                case 2:
                    myHotel.getAllRoomsInfo(myRooms);
                    break;
                case 3:
                    myHotel.removeClientsFromRoom(myRooms);
                    break;
                case 4:
                    myHotel.roomPrice(myRooms);
                    break;
//                case 7:
//                    myHotel.showAllClientsInfo(myRooms);
//                    myHotel.editClientUsingName(myRooms);
//                    break;
//                case 8:
//                    myServices.showActiveServices(servicesList);
//                    break;
                case 5:
                    File file = exportFile.getFile();
                    exportFile.writeInfoToFile(myRooms,file);
                    exportFile.readFile(file);
                    break;
                case 6:
                    System.exit(1);
            }
        }while(true);
    }
}