public class Main {

    static Methods methods = new Methods();

    public static void main(String[] args) {
        methods.add("Иван", "123456");
        methods.add("Иван", "123456");
        methods.add("Иван", "234567");
        methods.add("Василий", "234567");
        methods.add("Василий", "0987654");
        System.out.println(methods.find("Иван"));
        System.out.println(methods.find("Василий"));
        System.out.println(methods.find("Петр"));
    }
}