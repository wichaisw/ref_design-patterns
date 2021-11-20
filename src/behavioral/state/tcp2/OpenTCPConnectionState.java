package behavioral.state.tcp2;

public class OpenTCPConnectionState implements TCPConnectionState {
    @Override
    public void open(TCPManager manager) {
        System.out.println("Reinitialize connection");
        manager.setCurrentState(manager.getOpenTCPState());
    }

    @Override
    public void close(TCPManager manager) {
        System.out.println("Close connection");
        manager.setCurrentState(manager.getClosedTCPState());
    }

    @Override
    public void acknowledge() throws Exception {
        System.out.println("Acknowledge!");
    }
}
