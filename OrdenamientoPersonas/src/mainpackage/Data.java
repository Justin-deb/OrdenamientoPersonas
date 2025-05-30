package mainpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    
    private int counter = 0;
    
    public Person[] readArray(int max){
        counter = 0;
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
    
    public Person[] readArrayQuicksort(int max){
        counter = 0;
        final int MAX_VALUES = max;
        SortAlgorithms s = new SortAlgorithms();
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
            
            s.quickSort(list, 0, list.length-1);
            
            archive.close();
            information.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        return list;
    }
    
    public Person[] readArrayMergesort(int max){
        counter = 0;
        final int MAX_VALUES = max;
        Person[] list = new Person[MAX_VALUES];
        SortAlgorithms s = new SortAlgorithms();
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
            
            s.mergeSort(list);
            
            archive.close();
            information.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        return list;
    }
    
    public BinarySearchTree<Person> readTree(int max){
        counter = 0;
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
