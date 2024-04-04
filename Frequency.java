package questions;

import java.util.Arrays;
import java.util.Optional;

public class Frequency {

    public static void main(String[] args) {

//        String str = "Hello World coding";
//
////        StringJoiner str1 = new StringJoiner(" ");
//
//        Arrays.stream(str.split(" ")).collect(Collectors.joining("-"));
//
//        StringJoiner collect = str.chars().mapToObj(eachChar -> String.valueOf((char) eachChar)).collect(StringJoiner::new,
//                (joiner, strChar) -> {
//                    if (strChar.equals(" ")) {
//                        joiner.add("-");
//                    }
//                }, StringJoiner::merge);
//
//
//        var strFreq = str.chars().mapToObj(eachChar -> (char) eachChar).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
//        System.out.println(strFreq);

        int[] arr = {2, 4, 6, 1, 3, 3, 54, 6, 3, 6, 43, 7, 54, 7, 3, 7, 5};

        Optional<Integer> first = Arrays.stream(arr).boxed().sorted((o1, o2) ->
                o2 - o1
        ).skip(2).findFirst();
        int asInt = Arrays.stream(arr).boxed().sorted().mapToInt(e -> e).skip(arr.length - 3).min().getAsInt();
        System.out.println(asInt);
        System.out.println(first.get());

    }

}
