package behavioral.command.remotecontrol.simpleremote;

// Receiver
public class GarageDoor {

    public void up() {
        System.out.println("garage door is opened up");
    }

    public void down() {
        System.out.println("garage door is closed down");
    }

    public void stop() {
        System.out.println("garage door is stopped");
    }

    public void lightOn() {
        System.out.println("garage's light is turned on");
    }
    public void lightOff() {
        System.out.println("garage's light is turned off");
    }
}
