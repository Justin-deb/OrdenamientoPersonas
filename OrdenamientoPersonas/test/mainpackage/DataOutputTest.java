/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mainpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Justin
 */
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
