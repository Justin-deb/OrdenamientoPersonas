package mainpackage;

public record Person(int id, String name, int age) implements Comparable<Person>{

    @Override
    public String toString(){
        return String.format("Person %s, of age: %s, and the id: %s", name(),age(),id());
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.id(), o.id());
    }
    
}
