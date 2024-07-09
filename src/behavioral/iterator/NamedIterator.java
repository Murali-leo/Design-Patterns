package iterator;

public class NamedIterator implements IteratorPattern{

    private String[] names;
    private int index = 0;

    public NamedIterator(String[] names){
        this.names = names;
    }

    @Override
    public boolean hasNext() {
       return index < names.length;
    }

    @Override
    public Object next() {
       if(hasNext()){
        return names[index++];
       }
       return null;
    }

    
}
