package ru.otus.homework9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 9.");
        System.out.println("_________________");
        System.out.println();

        Methods methods = new Methods();
        List<Long> testList1 = Arrays.asList(1L,2L,3L,5L,6L);
        List<Long> testList2 = Arrays.asList(1L,2L,null,3L,5L,null,6L);
        System.out.println(methods.createRange(-5.0,5.0));
        System.out.println(methods.calculateSum(testList1));
        methods.fillListByNumber(10L, testList2);
        System.out.println(testList2);
        System.out.println(methods.addNumberToElements(10L, testList1));
        Employee employee1 = new Employee("John", 40);
        Employee employee2 = new Employee("Monika", 29);
        Employee employee3 = new Employee("Jack", 34);
        Employee employee4 = new Employee("Paul", 22);
        List<Employee> testList3 = Arrays.asList(employee1, employee2, employee3, employee4);
        System.out.println(methods.getNamesList(testList3));
        System.out.println(methods.filterEmployeesByAge(30, testList3));
        System.out.println(methods.checkEmployeesByMinimumAverageAge(40, testList3));
        System.out.println(methods.checkEmployeesByMinimumAverageAge(30, testList3));
        System.out.println(methods.getYoungestEmployee(testList3));
    }
}