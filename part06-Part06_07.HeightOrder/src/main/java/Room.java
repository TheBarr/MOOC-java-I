import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<Person>();
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
        return this.persons;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortestPerson = persons.get(0);
        for (Person person : persons) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.shortest();
        persons.remove(shortestPerson);
        return shortestPerson;
    }
}
