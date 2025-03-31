Реализуйте метод, который принимает строку с пробелами и возвращает количество слов в этой строке.

public class TypesTaskWordCount {
public static int wordCount(String input) {
//TODO
return -1;
}

private TypesTaskWordCount() {

}

public static void main(String[] args) {
System.out.println(
"В этой строке пять слов: " +
wordCount("В этой строке пять слов: ")
);
}
}

Реализуйте метод, который принимает букву и возвращает ту же букву, но в обратно регистре. Пример: при y - вернёт Y Если передана не буква - вернуть переданный символ без изменений.

public class TypesTaskChangeCase {
public static char changeCase(char input) {
//TODO
return '0';
}

private TypesTaskChangeCase() {

}

public static void main(String[] args) {
System.out.println(
"Ввод G в верхнем регистре, должны получить в нижнем: " +
changeCase('G')
);
System.out.println(
"Ввод g в нижнем регистре, должны получить в верхнем: " +
changeCase('g')
);
}
}

Реализуйте метод, который принимает символ и проверяет, является ли этот символ числом.

public class TypesTaskIsDigit {
public static boolean isDigit(char input) {
//TODO
return false;
}
private TypesTaskIsDigit() {

}

public static void main(String[] args) {
System.out.println(
"При вводе символа \"=\" метод должен вернуть false - '"
+ TypesTaskIsDigit.isDigit('=')
+ "'"
  );
  }
  }

Даны два массива с целочисленными элементами. Напишите метод, который возвращает массив со смежными элементами (их пересечение). Если пересечений нет, метод должен вернуть пустой массив.

import java.util.Arrays;

public class ArrayUtilsFindIntersection {

public static int[] findIntersection(int[] rightArray, int[] leftArray) {
//TODO
return new int[0];
}

private ArrayUtilsFindIntersection() {

}

public static void main(String[] args) {
System.out.println(
"При вводе массивов [1,4,7,3,8] и [9,12,7,4] метод должен вернуть массив [4,7] - '"
+ Arrays.toString(ArrayUtilsFindIntersection.findIntersection(new int[]{1, 4, 7, 3, 8}, new int[]{9, 12, 7, 4}))
+ "'"
  );
  }
  }

Дан массив целочисленных элементов. Реализуйте метод, который сдвигает все элементы массива, кроме первого, на одну позицию влево. Значение, находившееся в начальной ячейке массива, должно перейти в последнюю ячейку (левый сдвиг).

import java.util.Arrays;

public class ArrayUtilsShiftElements {
public static int[] shiftElements(int[] inputArray) {
// TODO
return inputArray;
}
private ArrayUtilsShiftElements() {

}

public static void main(String[] args) {
System.out.println(
"При вводе массива [1, 2, 3, 4, 5], метод должен вернуть массив [2, 3, 4, 5, 1] - '"
+ Arrays.toString(ArrayUtilsShiftElements.shiftElements(new int[]{1, 2, 3, 4, 5}))
+ "'"
  );
  }
  }

Дана строка. Реализуйте метод который бы приводил полученную строку к camel case нотации. Если встречаются знаки препинания, иные специальные символы или цифры - они должны быть удалены. Пример: входная строка - my camel * case string 1, результат - myCamelCaseString

public class StringUtilsCamel {
public static String toCamelCase(String input) {
// TODO
return "";
}

private StringUtilsCamel() {

}

public static void main(String[] args) {
System.out.println("Строка \"my camel * case string 1\" должна преобразоваться в myCamelCaseString - "
+ StringUtilsCamel.toCamelCase("my camel * case string 1"));
  }
  }

Дана строка, состоящая из скобок, а также открывающий и закрывающий символ скобок. Необходимо реализовать метод, который проверяет что в строке у каждой открывающей скобки есть соответствующая ей закрывающая скобка. Строка в которой закрывающая скобка идёт впереди открывающей является некорректной. Например (()) - корректная строка, ()) - некорректная строка

public class BracketUtil {
public static boolean isCorrectBrackets(String input,
char bracketOpenSymbol,
char bracketCloseSymbol) {
//TODO
return true;
}

private BracketUtil() {
}

public static void main(String[] args) {
System.out.println("Ввод равного поличества открывающих и закрывающих скобок - "
+ BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
  System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - "
+ BracketUtil.isCorrectBrackets("{{}}}", '{', '}'));
  }
  }

Дана строка, состоящая из слов, разделенных пробелами. Необходимо реализовать метод, который возвращает строку, слова в которой записаны в обратном порядке. Например, для строки "test abc" необходимо получить строку "abc test".

public class WordUtils {
public static String reverseWords(String inputText) {
// TODO
return "";
}

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords("два слова"));
    }
}

Реализуйте метод, который заменяет все нулевые биты переданного числа на 1 и возвращает получившееся десятиричное число.

public class FunctionUtilsShiftZeroes {
public static int shiftZeroes(int input) {
// TODO
return 0;
}
private FunctionUtilsShiftZeroes() {

}

public static void main(String[] args) {
System.out.println(
"При вводе числа 3435, метод должен вернуть 4095 - '"
+ FunctionUtilsShiftZeroes.shiftZeroes(3435)
+ "'"
  );
  }
  }

Реализуйте метод, который возвращает шестнадцатеричное представление переданного числа.

public class FunctionUtilsConvertNumToHex {
public static String convertNumToHex(int input) {
// TODO
return "0";
}

private FunctionUtilsConvertNumToHex() {

}

public static void main(String[] args) {
System.out.println(
"При вводе числа 8191, метод должен вернуть 1FFF - '"
+ FunctionUtilsConvertNumToHex.convertNumToHex(8191)
+ "'"
  );
  }
  }

Реализуйте метод, который из переданного шестнадцатеричного числа возвращает двоичное.

public class FunctionUtilsHexToBin {
public static String hexToBin(String hexBase) {
//TODO
return "010";
}
private FunctionUtilsHexToBin() {

    }

    public static void main(String[] args) {
        System.out.println(
                "При вводе числа 17, метод должен вернуть 10111 - '"
                + FunctionUtilsHexToBin.hexToBin("17")
                + "'"
        );
    }
}

Реализуйте класс, который принимает целую и дробную часть денежной суммы и возвращает полное значение строкой. Целую и дробную части в строке разделять запятой.

public class Money {
//TODO

public Money(int base, int fractional) {
//TODO
}

public String getAmount() {
//TODO
return "";
}

public static void main(String[] args) {
System.out.println("100 рублей, 90 копеек: " + new Money(100, 90).getAmount());
System.out.println("0 рублей, 1 копейка: " + new Money(0, 1).getAmount());
}
}

Реализуйте метод, который принимает объекты любого типа и возвращает список из таких объектов

import java.util.Collections;
import java.util.List;

public class ObjectsTaskBuildList {
private ObjectsTaskBuildList() {}

public static <T> List<T> generateList(T... input) {
//TODO
return Collections.emptyList();
}

public static void main(String[] args) {
System.out.println("Список разного: " + generateList(1, "2", '3', 4.5, false));
}
}

