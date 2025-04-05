public class Main {

    static PhoneBookService phoneBookService = new PhoneBookService();

    public static void main(String[] args) {
        phoneBookService.add("Иван", "123456");
        phoneBookService.add("Иван", "123456");
        phoneBookService.add("Василий", "123456");
        phoneBookService.add("Иван", "234567");
        phoneBookService.add("Василий", "234567");
        phoneBookService.add("Василий", "0987654");
        phoneBookService.add("Василий", "0987654");
        phoneBookService.add("Иван", "0987654");
        System.out.println(phoneBookService.find("Иван"));
        System.out.println(phoneBookService.find("Василий"));
        System.out.println(phoneBookService.find("Петр"));
    }
}