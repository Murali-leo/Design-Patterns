package nullobject;

import java.util.List;
import java.util.ArrayList;
public class DataBase {

    List<String> locations;
    public DataBase(){
        locations = new ArrayList<>();
        locations.add("Vizag");
        locations.add("Vijayawada");
        locations.add("Tirupati");
    }

    public boolean isExist(String location){
        for(String name : locations){
            if(name.equalsIgnoreCase(location)){
                return true;
            }
        }
        return false;
    }
}
