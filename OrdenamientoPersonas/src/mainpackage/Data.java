package mainpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    //public String read; not finished
    public String read(){
        try {
            FileReader archive = new FileReader("Registros.txt");
            BufferedReader information = new BufferedReader(archive);
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }
}
