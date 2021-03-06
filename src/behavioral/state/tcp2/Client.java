package behavioral.state.tcp2;

public class Client {

    public static void main(String[] args) throws Exception {
        TCPManager tcp = TCPManager.getInstance();

        tcp.openConnection();
        tcp.acknowledgeConnection();
        tcp.closeConnection();
        tcp.closeConnection();

        tcp.acknowledgeConnection();
    }
}
