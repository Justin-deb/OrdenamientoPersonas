package mainpackage;
/**
 *
 * @author Justin
 */
public class Main {
    private static final int MAX_VALUES = 100000;
    public static void main(String[] args) {    
        Data d = new Data();
        
        Person[] arrayPersons = d.readArray(MAX_VALUES);
        Person[] arrayPersonsQuicksort = d.readArrayQuicksort(MAX_VALUES);
        Person[] arrayPersonsMergesort = d.readArrayMergesort(MAX_VALUES);

        BinarySearchTree<Person> t = d.readTree(MAX_VALUES);
    }
}
