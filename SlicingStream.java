package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SlicingStream {

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

        List<Integer> skip = list.stream().map(Person::getAge).distinct().sorted().skip(1).limit(1).toList();
        System.out.println(skip);
    }
}
