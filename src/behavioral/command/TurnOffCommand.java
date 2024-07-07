package command;
//Commands
public class TurnOffCommand implements CommandPattern {

    private Light light;
    public TurnOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }

    
}
