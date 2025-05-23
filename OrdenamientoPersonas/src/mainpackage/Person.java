package mainpackage;

import java.util.Comparator;

public record Person(int id, String name, int age) implements Comparator<Person>{

    @Override
    public String toString(){
        return String.format("Person %s, of age: %s, and the id: %s", name(),age(),id());
    }
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.id(), o2.id());
    }
    
}
