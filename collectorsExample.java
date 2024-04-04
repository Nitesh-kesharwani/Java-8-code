package questions;

import java.util.*;
import java.util.stream.Collectors;

public class collectorsExample {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Java", 10);
        Person person2 = new Person(2, "Python", 20);
        Person person3 = new Person(3, "Java", 10);
        Person person4 = new Person(4, "c++", 30);


        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);


        Map<Integer, Set<Person>> collect = list.stream().collect(Collectors.groupingBy(Person::getAge, TreeMap::new, Collectors.toSet()));

        System.out.println(collect);

    }


}
