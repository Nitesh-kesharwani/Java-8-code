package questions;

import java.util.ArrayList;
import java.util.List;

public class AgeSort {

    public static void main(String[] args) {


        Person person1 = new Person(1, "Java", 10);
        Person person2 = new Person(2, "Python", 20);
        Person person3 = new Person(3, "Java", 40);
        Person person4 = new Person(4, "c++", 30);


        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);


        List<Person> list1 = list.stream().sorted((o1, o2) -> o1.getAge() - o2.getAge()).limit(2).toList();
        System.out.println(list1);

    }
}
