package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample {

    public static void main(String[] args) {
//        new Thread(() -> System.out.println("Shortest creation of thread")).start();

        Person person1 = new Person(1, "Java", 10);
        Person person2 = new Person(2, "Python", 20);
        Person person3 = new Person(3, "Java", 10);
        Person person4 = new Person(4, "c++", 30);


        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);

//        Collections.sort(list, (p1, p2) -> {
//            return p1.getName().compareTo(p2.getName());
//        });


    }
}
