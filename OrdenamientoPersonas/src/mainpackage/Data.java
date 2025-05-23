package mainpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Data {
    private int counter = 0;
    public Person[] readArray(int max){
        final int MAX_VALUES = max;
        Person[] list = new Person[MAX_VALUES];
        try {
            FileReader archive = new FileReader("Registros.txt");
            BufferedReader information = new BufferedReader(archive);
            
            
            String line = "";
            String chain[];
            
            while((line = information.readLine()) != null && counter != MAX_VALUES){
                chain = line.split(",");
                
                list[counter] = (new Person(Integer.parseInt(chain[0]),chain[1],Integer.parseInt(chain[2])));
                
                counter++;
            }
            
            archive.close();
            information.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        return list;
    }
    
    public BinarySearchTree<Person> readTree(int max){
        final int MAX_VALUES = max;
        BinarySearchTree<Person> t =  new BinarySearchTree<>();
        try {
            FileReader file = new FileReader("Registros.txt");
            BufferedReader information = new BufferedReader(file);
            
            String line = "";
            String chain[];
            
            while((line = information.readLine()) != null && counter != MAX_VALUES){
                chain = line.split(",");
                
                t.insert(new Person(Integer.parseInt(chain[0]),chain[1],Integer.parseInt(chain[2])));
                counter++;
            }
            
            file.close();
            information.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        return t;
    }
}
