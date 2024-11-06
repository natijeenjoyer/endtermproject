import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Client implements Observer {
    private String name;

    Client(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

class NotificationService {
    private List<Observer> clients = new ArrayList<>();

    public void addClient(Observer client) {
        clients.add(client);
    }

    public void notifyClients(String message) {
        for (Observer client : clients) {
            client.update(message);
        }
    }
}
