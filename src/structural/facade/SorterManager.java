package structural.facade;

// facade Pattern
public class SorterManager {
    private Sorter bubbleSort;
    private Sorter mergeSort;
    private Sorter quickSort;

    public SorterManager(){
        this.bubbleSort = new BubbleSort();
        this.mergeSort = new MergeSort();
        this.quickSort = new QuickSort();
    }

    public void doBubbleSort(){
        this.bubbleSort.sort();
    }
    public void doMergeSort(){
        this.mergeSort.sort();
    }
    public void doQuickSort(){
        this.quickSort.sort();
    }
}
