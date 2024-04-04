package questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class uniqueDuplicateElements {

    public static void main(String[] args) {
//        Person person1 = new Person(1, "Java", 10);
//        Person person2 = new Person(2, "Python", 20);
//        Person person3 = new Person(3, "Java", 10);
//        Person person4 = new Person(4, "c++", 30);
//
//        List<Person> list = new ArrayList<>();
//        list.add(person1);
//        list.add(person2);
//        list.add(person3);
//        list.add(person4);
//
//        List<String> collect = list.stream().map(Person::getName).toList();
//
//        Set<String> uniqueNames = new HashSet<>();
//
//        List<String> duplicateNames = collect.stream().filter(each -> !uniqueNames.add(each)).collect(Collectors.toList());
//
//        System.out.println(uniqueNames);
//        System.out.println(duplicateNames);

        String str = "Hello my name is nitesh";

        Map<Character, Long> collect = str.chars().mapToObj(each -> (char) each).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }

}
