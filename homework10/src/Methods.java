import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Methods {

    PhoneBook phoneBook;

    public Methods() {
        this.phoneBook = new PhoneBook();
    }

    public void add(String name, String phoneNumber) {

        if (containsPhoneNumber(phoneNumber)) {
            System.out.println("Такой номер уже зарегистрирован.");
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

    public boolean containsPhoneNumber(String phoneNumber) {

        for (Map.Entry<String, List<String>> entry : phoneBook.phoneBookRecords.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
