package behavioral.command.remotecontrol.fullremote.stereo;

import behavioral.command.remotecontrol.fullremote.Command;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
