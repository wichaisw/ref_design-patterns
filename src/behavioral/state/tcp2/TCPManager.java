package behavioral.state.tcp2;

public class TCPManager {
    TCPConnectionState currentState;
    TCPConnectionState openState;
    TCPConnectionState closedState;

    public TCPManager() {
        this.closedState = new ClosedTCPConnectionState();
        this.openState = new OpenTCPConnectionState();
        this.currentState = closedState;
    }

    protected void setCurrentState(TCPConnectionState state) {
        this.currentState = state;
    }

    protected TCPConnectionState getOpenTCPState() {
        return this.openState;
    }

    protected TCPConnectionState getClosedTCPState() {
        return this.closedState;
    }

    public void openConnection() {
        this.currentState.open(this);
    }

    public void closeConnection() {
        this.currentState.close(this);
    }

    public void acknowledgeConnection() throws Exception {
        this.currentState.acknowledge();
    }
}
