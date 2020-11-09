package OtherServices;

import Clients.Clients;
import Hotels.Rooms.Rooms;
import Interface.Services;

public class Buffets implements Services {
    Clients client;
    Rooms room;

    public Buffets(Clients name, Rooms roomNumber) {
        this.client = name;
        this.room = roomNumber;
    }

    public Clients getClient() {
        return client;
    }

    public Rooms getRoom() {
        return room;
    }

    @Override
    public void getService() {
        System.out.println("This client use buffet next morning!");
    }

    @Override
    public int getPrice() {
        return 300000;
    }

    @Override
    public void setClientInfo(Clients client,Rooms room) {
        this.client = client;
        this.room = room;
    }
    public String getClientName(){
        return this.client.getName();
    }
    public int getRoomNumber(){
        return this.room.getRoomNumber();
    }
    @Override
    public void getClientInfo(){
        getService();
        System.out.println("Price: " + getPrice());
        System.out.println("Reserved by: " + getClientName());
        System.out.println("Room: " + getRoomNumber());
    }
}
