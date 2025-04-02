package ru.otus.homework9;

import java.util.ArrayList;
import java.util.List;

public class Methods {

    public List<Double> createRange(Double min, Double max) {
        List<Double> range = new ArrayList<>();
        Double currentNumber = min;
        while (currentNumber <= max) {
            range.add(currentNumber);
            currentNumber += 1;
        }
        return range;
    }

    public Long calculateSum(List<Long> list) {
        return list.stream().mapToLong(Long::longValue).filter(elem -> elem > 5).sum();
    }

    public void fillListByNumber(Long number, List<Long> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                list.set(i, number);
            }
        }
    }

    public List<Long> addNumberToElements(Long number, List<Long> list) {
        return list.stream().map(elem -> elem + number).toList();
    }

    public List<String> getNamesList(List<Employee> employees) {
        return employees.stream().map(Employee::name).toList();
    }

    public List<Employee> filterEmployeesByAge(int age, List<Employee> employees) {
        return employees.stream().filter(elem -> elem.age() >= age).toList();
    }

    public boolean checkEmployeesByMinimumAverageAge(int minimumAverageAge, List<Employee> employees) {
        double averageAge = 0.0;
        for (Employee employee : employees) {
            averageAge = averageAge + employee.age();
        }
        averageAge /= employees.size();

        return averageAge > minimumAverageAge;
    }

    public Employee getYoungestEmployee(List<Employee> employees) {
        int result = -1;
        int minimumAge = Integer.MAX_VALUE;
        for (int i = 0; i < employees.size(); i++) {
            int currentAge = employees.get(i).age();
            if (minimumAge > currentAge) {
                result = i;
                minimumAge = currentAge;
            }
        }
        return employees.get(result);
    }

}
