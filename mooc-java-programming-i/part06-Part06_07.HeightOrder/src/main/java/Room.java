import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = this.persons.get(0);

        for (Person pers : this.persons) {
            if (shortest.getHeight() > pers.getHeight()) {
                shortest = pers;
            }
        }

        return shortest;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = this.persons.get(0);

        for (Person pers : this.persons) {
            if (shortest.getHeight() > pers.getHeight()) {
                shortest = pers;
            }
        }

        this.persons.remove(shortest);

        return shortest;
    }
}
