
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> person;

    public Room() {
        this.person = new ArrayList<>();
    }

    public void add(Person person) {
        this.person.add(person);
    }

    public boolean isEmpty() {
        return this.person.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.person;
    }

    public Person shortest() {
        if (this.person.isEmpty()) {
            return null;
        }
        Person tempPerson = this.person.get(0);

        for (Person person : this.person) {
            if (person.getHeight() < tempPerson.getHeight()) {
                tempPerson = person;
            }
        }
        return tempPerson;
    }

    public Person take() {
        Person tempPerson = shortest();
        if (this.person.contains(tempPerson)) {
            this.person.remove(tempPerson);
        }
        return tempPerson;
    }
}
