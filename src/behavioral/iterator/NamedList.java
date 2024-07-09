package iterator;

public class NamedList {

    private String[] names = {"nani", "dhana", "manu", "jashu"};
    public IteratorPattern getIterator(){
        return new NamedIterator(names);
    }
}
