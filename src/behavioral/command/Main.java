package command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        Switch switch1 = new Switch();
        switch1.addPattern(turnOffCommand);
        switch1.addPattern(turnOnCommand);
        switch1.executeCommand();
    }
    
}
