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
        System.out.println("Reserved by: " + this.client.getName());
        System.out.println("Room: " + this.room.getRoomNumber());
    }
}
