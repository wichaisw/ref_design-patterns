package behavioral.state.tcp;

public interface TCPConnectionState {

    void open();
    void close();
    void acknowledge() throws Exception;
}
