package OtherServices;

import Clients.Clients;
import Hotels.Rooms.Rooms;
import Interface.Services;

public class Sightseeing implements Services {
    Clients client;
    Rooms room;

    public Sightseeing(Clients client, Rooms room) {
        this.client = client;
        this.room = room;
    }

    public Clients getClient() {
        return client;
    }

    public Rooms getRoom() {
        return room;
    }

    @Override
    public void getService() {
        System.out.println("This client will go sightseeing");
    }

    @Override
    public int getPrice() {
        return 450000;
    }
    @Override
    public void setClientInfo(Clients client,Rooms room) {
        this.client = client;
        this.room = room;
    }
    @Override
    public void getClientInfo(){
        getService();
        System.out.println("Price: " + getPrice());
        System.out.println("Reserved by: " + getClient().getName());
        System.out.println("Room: " + getRoom().getRoomNumber());
    }
}
