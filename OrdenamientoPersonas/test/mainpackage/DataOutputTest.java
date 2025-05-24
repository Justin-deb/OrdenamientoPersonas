package mainpackage;

import org.junit.Test;
import static org.junit.Assert.*;

public class DataOutputTest {
    
    private final int MAX_VALUE = 100000;
    
    public DataOutputTest() {
    }
    
    @Test
    public void testTreeInorder() {
        Data instance = new Data();
        BinarySearchTree<Person> result = instance.readTree(MAX_VALUE);
        Person expected = result.getRoot();
        
        System.out.println(result.inorder());
        
        assertEquals(expected, result.getRoot());
    }
    
}
