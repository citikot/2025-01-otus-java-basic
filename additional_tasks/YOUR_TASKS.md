1 Реализуйте метод, который принимает строку с пробелами и возвращает количество слов в этой строке.

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

2. Реализуйте метод, который принимает букву и возвращает ту же букву, но в обратно регистре. Пример: при y - вернёт Y Если передана не буква - вернуть переданный символ без изменений.

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

3. Реализуйте метод, который принимает символ и проверяет, является ли этот символ числом.

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

4. Даны два массива с целочисленными элементами. Напишите метод, который возвращает массив 
со смежными элементами (их пересечение). Если пересечений нет, метод должен вернуть пустой массив.

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

5. Дан массив целочисленных элементов. Реализуйте метод, который сдвигает все элементы массива, 
кроме первого, на одну позицию влево. Значение, находившееся в начальной ячейке массива,
должно перейти в последнюю ячейку (левый сдвиг).

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

6. Дана строка. Реализуйте метод который бы приводил полученную строку к camel case нотации. 
Если встречаются знаки препинания, иные специальные символы или цифры - они должны быть удалены. 
Пример: входная строка - my camel * case string 1, результат - myCamelCaseString

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

7. Дана строка, состоящая из скобок, а также открывающий и закрывающий символ скобок. 
Необходимо реализовать метод, который проверяет что в строке у каждой открывающей скобки 
есть соответствующая ей закрывающая скобка. Строка в которой закрывающая скобка идёт 
впереди открывающей является некорректной. Например (()) - корректная строка, ()) - некорректная строка

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

8. Дана строка, состоящая из слов, разделенных пробелами. Необходимо реализовать метод, 
который возвращает строку, слова в которой записаны в обратном порядке. Например, для 
строки "test abc" необходимо получить строку "abc test".

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

9. Реализуйте метод, который заменяет все нулевые биты переданного числа на 1 и возвращает 
получившееся десятиричное число.

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

10. Реализуйте метод, который возвращает шестнадцатеричное представление переданного числа.

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

11. Реализуйте метод, который из переданного шестнадцатеричного числа возвращает двоичное.

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

12. Реализуйте класс, который принимает целую и дробную часть денежной суммы и 
возвращает полное значение строкой. Целую и дробную части в строке разделять запятой.

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

13. Реализуйте метод, который принимает объекты любого типа и возвращает список из таких объектов

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

14. Реализуйте класс итератора одномерного массива.

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OneDimensionalTask {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        OneDimensionalArrayIterator<Integer> itr = new OneDimensionalArrayIterator<>(intArray);
        System.out.print("Элементы массива: ");
        while (itr.hasNext()) {
            Integer result = itr.next();
            System.out.print(result + " ");

        }
    }
}

class OneDimensionalArrayIterator<T> implements Iterator<T> {

    private final T[] array;
    private int index = 0;

    public OneDimensionalArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        //TODO
        return false;
    }

    @Override
    public T next() throws NoSuchElementException {
        //TODO
        return null;
    }

15. Реализуйте метод, который получает коллекцию объектов, и на выходе возвращает коллекцию уникальных значений

import java.util.*;

public class CollectionUtilsUniqueValues {
public static <T> Collection<T> removeDuplicates(Collection<T> inputCollection) {
//TODO
return List.of();
}

private CollectionUtilsUniqueValues() {

}

public static void main(String[] args) {
System.out.println("При вводе коллекции (1, 2, 3, 3, 2, 4) метод должен вернуть (1, 2, 3, 4) - "
+ CollectionUtilsUniqueValues.removeDuplicates(List.of(1, 2, 3, 3, 2, 4)));
  }
  }

16. Реализуйте метод, который принимает массив элементов и возвращает Map<K, Integer> 
где K - элемент массива, Integer — количество таких элементов в массиве

import java.util.*;

public class CollectionUtilsCount {
public static <K> Map<K, Integer> countElements(K[] inputArray) {
//TODO
return Map.of();
}

private CollectionUtilsCount() {

}

public static void main(String[] args) {
System.out.println("При вводе массива [1, 2, 4, 1, 1, 1, 2, 3, 2], метод должен вернуть [\"1\", 4, \"2\", 3, \"4\", 1, \"3\", 1] - "
+ CollectionUtilsCount.countElements(new String[]{"1", "2", "4", "1", "1", "1", "2", "3", "2"}));
  }
  }

17. Реализуйте метод, который принимает два списка и сравнивает равны ли множества их элементов

import java.util.*;

public class CollectionUtilsElementComparison {
public static boolean isValuesMatch(List<?> leftList, List<?> rightList) {
//TODO
return true;
}
private CollectionUtilsElementComparison(){

}

public static void main(String[] args) {
System.out.println(
"При вводе массивов: (1, 2, 3) и (4, 5, 6), метод должен вернуть false - '"
+ CollectionUtilsElementComparison.isValuesMatch(List.of(1, 2, 3), List.of(4, 5, 6))
+ "'"
  );
  }
  }

18. Реализуйте метод, принимающий Map<K, V> и возвращающий Map, в котором ключи и значения поменяны местами

import java.util.*;

public class CollectionUtilsInvertMap {
public static <K, V> Map<V, K> invertMap(Map<? extends K, ? extends V> inputMap) {
//TODO
return Map.of();
}

private CollectionUtilsInvertMap() {

}

public static void main(String[] args) {
System.out.println("При вводе Map {1=a, 2=b, 3=c} метод должен вернуть {a=1, b=2, c=3} - '"
+ CollectionUtilsInvertMap.invertMap(Map.of(1, "a", 2, "b", 3, "c")) + "'");
  }
  }

19. Реализуйте класс стека, который работает с целочисленными значениями.

import java.util.LinkedList;

public class SimpleStackTest {
private SimpleStackTest(){}

    public static void main(String[] args) {
        Stack<Integer> stack = new SimpleStack();
        System.out.println("Вначале стек пуст: " + stack.isEmpty());
        System.out.println("Помещаем в стек 42: " + stack.push(42));
        System.out.println("После добавления элемента - не пуст: " + stack.isEmpty());
        System.out.println("Достали из стека последнее значение: " + stack.pop());
        System.out.println("После удаления элемента стек снова пуст: " + stack.isEmpty());
    }
}
interface Stack<T> {
T push(T item);
T pop();
boolean isEmpty();
}

class SimpleStack implements Stack<Integer> {
//TODO
}

20. Доработайте метод getAllElements так, чтобы в случае возникновения ошибки 
он в качестве результата записывал в список сообщение выброшенного исключения, 
а также после каждой итерации в любом случае добавлял бы строку ""end""

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionTaskGetAllElements {
private static String processString(String item) {
if(item.contains("Ю")) {
throw new IllegalArgumentException("Обнаружена буква Ю!");
}
if(item.contains("Ё")) {
throw new NullPointerException("Ё не разрешено!");
}
return item;
}

public static String[] getAllElements(String[] input) {
var result = new ArrayList<String>(input.length);
for (String item : input) {
//TODO
result.add(processString(item));
}
return result.toArray(new String[0]);
}


public static void main(String[] args) {
System.out.println(Arrays.toString(getAllElements(new String[]{"Ю", "б", "в", "Ю", "Д", "ЁЖ"})));
}
}

21. Дан метод, который принимает два целочисленных значения и выводит разницу 
их абсолютного значения |left - right| - однако в случае если left < right метод 
возвращает CustomException - реализуйте класс данного исключения. В качестве 
сообщения для исключения метод должен использовать строку 'my custom exception'

public class ExceptionTaskCustomException {
public static int simpleAbs(int left, int right) throws CustomException {
if (left < right) {
throw new CustomException("my custom exception");
}
return left - right;
}

public static void main(String[] args) throws Exception {
System.out.println("No exception: " + simpleAbs(3, 2));
try {
System.out.println("Exception: " + simpleAbs(1, 2));
System.out.println("Исключение не брошено, ошибка!");
} catch (CustomException e) {
System.out.println("Успешно брошено исключение.");
}
}
}

class CustomException extends Exception {

//TODO
}

22. Дан метод, который содержит скрытые ошибки в вычислениях. 
Необходимо доработать метод так, чтобы при возникновении ошибок 
он продолжал работу, а результат вычисления итерации, на которой 
была получена ошибка, был бы равен 0.

public class ExceptionTaskBuggyMethod {
private ExceptionTaskBuggyMethod(){}

public static int buggyMethod(Integer[] inputNumbers) {
int result = 0;
for (var item: inputNumbers) {
result += (item + 1) / item;
}
return result;
}

public static void main(String[] args) {
buggyMethod(null);
buggyMethod(new Integer[]{1, 0});
}
}

23. Реализуйте метод, который принимает чётное количество целочисленных 
элементов и попарно делит их друг на друга. Если в качестве делителя 
встречается ноль, то нужно отловить ArithmeticException и записать 
в качестве результата 0. Если общее количество элементов не является 
чётным, метод должен бросить IllegalArgumentException Метод должен 
вернуть массив с результатами деления (использовать обычное деление).

import java.util.Arrays;

public class ExceptionTaskDivide {
private ExceptionTaskDivide(){}

public static int[] divide(int... numbers) {
//TODO
return null;
}

public static void main(String[] args) {
System.out.println("Делим попарно 4, 2, 4, 1: " + Arrays.toString(divide(4, 2, 4, 1)));
System.out.println("Делим попарно 0, 2, 0, 0: " + Arrays.toString(divide(0, 2, 0, 0)));
}
}

24. Напишите метод, который проверяет было ли выброшено исключение 
(класс исключения передаётся параметром в метод)

public class ExceptionTaskMain {

    public static void main(String[] args) {
        System.out.println("Этот вызов бросает нужное исключение: " +
                ExceptionTask.invokesException(IllegalArgumentException.class, () -> {
                    throw new IllegalArgumentException();
                }));
        System.out.println("Этот вызов не бросает исключение: " +
                ExceptionTask.invokesException(IllegalArgumentException.class, () -> {
                    var a = 2 * 2;
                }));
        System.out.println("Этот вызов бросает не то исключение: " +
                ExceptionTask.invokesException(IllegalArgumentException.class, () -> {
                    throw new ArrayIndexOutOfBoundsException();
                }));
    }

}

interface Callable {
void call();
}

class ExceptionTask {
private ExceptionTask() {
}

    public static <T extends Throwable> boolean invokesException(Class<T> clazz, Callable callable) {
        //TODO
    }
}