package behavioral.state.tcp2;

public class ClosedTCPConnectionState implements TCPConnectionState {

    @Override
    public void open(TCPManager manager) {
        System.out.println("Open connection");
        manager.setCurrentState(manager.getOpenTCPState());
    }

    @Override
    public void close(TCPManager manager) {
        System.out.println("Connection is already closed");
    }

    @Override
    public void acknowledge() throws Exception {
        throw new Exception("invalid usage of connection!");
    }
}
