package xyz.makise.timeline.service;

public class Invoker {
    private Command command;
    public void action(Object...objects){
        if(command != null)
            command.execute(objects);
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(Object... objects) {
        if (command != null){
            command.execute(objects);
        }
    }
}
