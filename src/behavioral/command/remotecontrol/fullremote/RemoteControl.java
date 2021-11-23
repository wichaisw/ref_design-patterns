package behavioral.command.remotecontrol.fullremote;

import java.util.ArrayList;
import java.util.List;

// Command Manager
public class RemoteControl {
    private Command[] onCommands; // handles 7 commands
    private Command[] offCommands;
    private List<Command> historyList = new ArrayList<>();
    private List<Command> redoList = new ArrayList<>();


    public RemoteControl() {
        onCommands = new Command[7]; // initiate 7 array slots
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute(); // null slot already handled by Null Object
        historyList.add(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        historyList.add(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if(historyList.size() > 0) {
            Command undoCommand = historyList.get(historyList.size() - 1);
            undoCommand.undo();
            redoList.add(undoCommand);
            historyList.remove(historyList.size() - 1);
        }
    }

    public void redoButtonWasPushed() {
        if(redoList.size() > 0) {
            Command redoCommand = redoList.get(redoList.size() - 1);
            redoCommand.execute();
            historyList.add(redoCommand);
            redoList.remove(redoList.size() - 1);
        }
    }


    @Override   // override to string so print commands
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n----- Remote Control -----\n");
        for(int i = 0; i < onCommands.length; i++) {
            stringBuffer
                    .append("[slot ")
                    .append(i).append("] ")
                    .append(onCommands[i].getClass().getName()).append("  ")
                    .append(offCommands[i].getClass().getName()).append("\n");
        }

        return stringBuffer.toString();
    }
}
