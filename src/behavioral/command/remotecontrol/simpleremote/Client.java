package behavioral.command.remotecontrol.simpleremote;

public class Client {
    public static void main(String[] args) {

        // invoker, it will be passed a command object that can be used to make requests.
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light(); // Receiver of the request
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light); // create a command, and pass receiver to it
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor); // parameterizing an object

        remote.setCommand(lightOnCommand); // pass the command to the invoker
        remote.buttonWasPressed(); // simulate button being pressed, command is slot is executed;
        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
