package src.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PersonDataBase {

    private static Long counter = 0L;
    private Set<Position> management = Set.of(Position.MANAGER, Position.DIRECTOR,
            Position.BRANCH_DIRECTOR, Position.SENIOR_MANAGER);

    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
        person.setId(counter);
        counter++;
    }

    public Person findById(Long id) {
        if (id >= counter) {
            throw new IndexOutOfBoundsException("Персоны с id " + id + " не существует.");
        }

        return personList.get(id.intValue());
    }

    public boolean isManager(Person person) {
        return management.contains(person.getPosition());
    }

    public boolean isEmployee(Person person) {
        return !isManager(person);
    }
}
