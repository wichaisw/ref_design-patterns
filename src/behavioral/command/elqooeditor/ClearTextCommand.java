package behavioral.command.elqooeditor;

public class ClearTextCommand extends AbstractCommand {

    private String undoText = "";

    public ClearTextCommand(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void action() {
        // back up undo text
        undoText = getTextEditor().getText();
        getTextEditor().setText("");
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
