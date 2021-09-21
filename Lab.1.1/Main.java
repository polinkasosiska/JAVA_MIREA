package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* Person myPerson = new Person.Builder()
                .withName(in.next())
                .withHeight(in.nextDouble())            <- проверка создания объекта Person с помощью шаблона Builder
                .withAge(in.nextInt())
                .build();*/
           new PersonTest().runTest();                    
                myPerson.printInfo();
        new ClientTest().runTest();
        new EmployeeTest().runTest();
       
        
        
    }

    private static class ClientTest {
        public void runTest() {
            Client client = new Client("name 1", "service 1", 400.3);
            System.out.println(client.think());
        }
    }

    private static class EmployeeTest {
        public void runTest() {
            Employee employee= new Employee("", "", AbstractPerson.PositionEnum.SELLER);
            System.out.println(employee.think());
        }
    }

    private static class PersonTest {
        public void runTest() {
           /* Person myPerson = new Person.Builder()
                    .withName("Лёха")
                    .withHeight(Person.MAX_HEIGHT+1)        <- проверка создания объекта Person с помощью шаблона Builder
                    .withAge(Person.MAX_AGE+1)
                    .build();*/
                    
           Person myPerson(Person.MAX_AGE+1, Person.MAX_HEIGHT+1, '', true) //<- проверка для классического конструктора с обработкой Исключений

        }
    }
}
