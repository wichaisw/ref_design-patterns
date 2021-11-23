package behavioral.command.remotecontrol.fullremote.light;

// Receiver
public class Light {
    boolean isOn = false;
    String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        isOn = true;
        System.out.println(room + "light's turned on");
    }
    public void off() {
        isOn = false;
        System.out.println(room + "light's turned off");
    }
}
