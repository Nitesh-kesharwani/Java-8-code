package questions;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class minMaxAvgExample {

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

        List<Integer> ages = list.stream().distinct().map(Person::getAge).toList();

        IntSummaryStatistics intSummaryStatistics = ages.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println(intSummaryStatistics);
    }
}
