package command;

//Commands
public class TurnOnCommand implements CommandPattern {
    
    private Light light;

    public TurnOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
       this.light.turnOn();
    }
    
}
