package OtherServices;

import Clients.Clients;
import Hotels.Rooms.Rooms;
import Interface.Services;

public class Golf implements Services {
    Clients client;
    Rooms room;

    public Golf(Clients client, Rooms room) {
        this.client = client;
        this.room = room;
    }

    @Override
    public void getService() {
        System.out.println("This client will participate in golf club");
    }

    @Override
    public int getPrice() {
        return 700000;
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
