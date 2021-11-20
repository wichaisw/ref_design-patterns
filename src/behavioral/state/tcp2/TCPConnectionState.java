package behavioral.state.tcp2;

public interface TCPConnectionState {
    void open(TCPManager manager);
    void close(TCPManager manager);
    void acknowledge() throws Exception;
}
