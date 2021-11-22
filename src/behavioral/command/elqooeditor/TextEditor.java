package behavioral.command.elqooeditor;

import java.util.LinkedList;
import java.util.Queue;

public class TextEditor {

    private String text = "";
    private Queue<Command> queue = new LinkedList<Command>();

    private void executeAction(Command command) {
        command.action();
        queue.add(command);
    }

    private void undo() {
        Command command = queue.poll();
        if(command != null) {
            command.undo();
        }
    }


//    Getters & Setters
    public String getText() {
        return text;
    }

    public Queue<Command> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Command> queue) {
        this.queue = queue;
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        AddTextCommand addTextCommand = new AddTextCommand(editor, "test text");
        AddTextCommand addTextCommand2 = new AddTextCommand(editor, " 1234");
        AddTextCommand addTextCommand3 = new AddTextCommand(editor, " third");
        editor.executeAction(addTextCommand);
        editor.executeAction(addTextCommand2);
        editor.executeAction(addTextCommand3);
        System.out.println("Text: " + editor.getText());

        ClearTextCommand clearTextCommand = new ClearTextCommand(editor);
        editor.executeAction(clearTextCommand);
        System.out.println("Clear Text: " + editor.getText());

        editor.undo();
        System.out.println("Undo Text: " + editor.getText());

        editor.undo();
        System.out.println("Undo Text: " + editor.getText());

        editor.undo();
        System.out.println("Undo Text: " + editor.getText());
    }
}
