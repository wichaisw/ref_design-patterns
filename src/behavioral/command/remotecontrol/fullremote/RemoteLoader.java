package behavioral.command.remotecontrol.fullremote;

import behavioral.command.remotecontrol.fullremote.garage.GarageDoor;
import behavioral.command.remotecontrol.fullremote.garage.GarageDoorDownCommand;
import behavioral.command.remotecontrol.fullremote.garage.GarageDoorUpCommand;
import behavioral.command.remotecontrol.fullremote.light.Light;
import behavioral.command.remotecontrol.fullremote.light.LightOffCommand;
import behavioral.command.remotecontrol.fullremote.light.LightOnCommand;
import behavioral.command.remotecontrol.fullremote.stereo.Stereo;
import behavioral.command.remotecontrol.fullremote.stereo.StereoOffCommand;
import behavioral.command.remotecontrol.fullremote.stereo.StereoOnWithCDCommand;

// Client
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // create all device (receiver)
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = { livingRoomLightOn, stereoOnWithCD };
        Command[] partyOff = { livingRoomLightOff, stereoOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        // can use lambda expression (or method reference) instead of concrete command if only execute one abstract method
//        remoteControl.setCommand(1, () -> kitchenLight.on(), kitchenLight::off);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, partyOnMacro, partyOffMacro);

        // use toString override to print slot and command
        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();

    }
}
