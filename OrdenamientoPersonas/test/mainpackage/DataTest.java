package mainpackage;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class DataTest {
    
    private final int MAX_VALUE = 100000;
    
    public DataTest() {
    }

    @Test
    public void testReadArray() {
        Data instance = new Data();
        Person[] result = instance.readArray(MAX_VALUE);
        Person expected = result[1];
        
        assertEquals(expected, result[1]);
    }

    @Test
    public void testReadArrayQuicksort() {
        Data instance = new Data();
        Person[] result = instance.readArrayQuicksort(MAX_VALUE);
        Person expected = result[1];
        
        assertEquals(expected, result[1]);
    }

    @Test
    public void testReadArrayMergesort() {
        Data instance = new Data();
        Person[] result = instance.readArrayMergesort(MAX_VALUE);
        Person expected = result[1];
        
        assertEquals(expected, result[1]);
    }

    @Test
    public void testReadTree() {
        Data instance = new Data();
        BinarySearchTree<Person> result = instance.readTree(MAX_VALUE);
        Person expected = result.getRoot();
        
        assertEquals(expected, result.getRoot());
    }
    
}
