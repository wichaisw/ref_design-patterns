package behavioral.command.remotecontrol.simpleremote;

// Receiver
public class Light {
    boolean isOn = false;
    public void on() {
        isOn = true;
        System.out.println("light's turned on");
    }
    public void off() {
        isOn = false;
        System.out.println("light's turned off");
    }
}
