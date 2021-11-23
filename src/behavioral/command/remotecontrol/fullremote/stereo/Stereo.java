package behavioral.command.remotecontrol.fullremote.stereo;

// Receiver
public class Stereo {
    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("radio turned on");
    }

    public void off() {
        System.out.println("radio turned off");
    }

    public void setCd() {
        System.out.println("cd set");
    }

    public void setDvd() {
        System.out.println("dvd set");
    }

    public void setRadio() {
        System.out.println("radio set");
    }

    public void setVolume() {
        System.out.println("volume set");
    }
}
