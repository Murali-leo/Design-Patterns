package command;

import java.util.ArrayList;
import java.util.List;
// Invoker
public class Switch {

    private List<CommandPattern> commands = new ArrayList<>();

    public Switch(){
        commands = new ArrayList<>();
    }

    public void addPattern(CommandPattern commandPattern){
        commands.add(commandPattern);
    }

    public void executeCommand(){
        for(CommandPattern command : commands){
            command.execute();
        }
    }
    
}
