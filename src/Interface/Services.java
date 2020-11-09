package Interface;

import Clients.Clients;
import Hotels.Rooms.Rooms;

public interface Services {
    void getService();
    int getPrice();
    void setClientInfo(Clients a, Rooms b);
    void getClientInfo();
}
