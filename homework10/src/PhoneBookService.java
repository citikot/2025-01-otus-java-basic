import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PhoneBookService {

    PhoneBook phoneBook;

    public PhoneBookService() {
        this.phoneBook = new PhoneBook();
    }

    public void add(String name, String phoneNumber) {

        if (containsPhoneNumber(name, phoneNumber)) {
            System.out.println("Такой номер у " + name + " уже зарегистрирован.");
        } else if (phoneBook.phoneBookRecords.containsKey(name)) {
            phoneBook.phoneBookRecords.get(name).add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.phoneBookRecords.put(name, phoneNumbers);
        }
    }

    public List<String> find(String name) {
        if (phoneBook.phoneBookRecords.containsKey(name)) {
            return phoneBook.phoneBookRecords.get(name);
        }
        System.out.println("Имя " + name + " не зарегистрировано в телефонной книге.");
        return new ArrayList<>();
    }

    public boolean containsPhoneNumber(String name, String phoneNumber) {
        List<String> numbers = phoneBook.phoneBookRecords.get(name);
        return numbers != null && numbers.contains(phoneNumber);
    }

}
