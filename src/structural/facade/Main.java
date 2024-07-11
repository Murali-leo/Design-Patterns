package structural.facade;

public class Main {
    public static void main(String[] args) {
        SorterManager sorterManager = new SorterManager();
        sorterManager.doBubbleSort();
        sorterManager.doMergeSort(); 
        sorterManager.doQuickSort();  
    }
    
}
