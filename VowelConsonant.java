package questions;


import java.util.List;

public class VowelConsonant {

    public static void main(String[] args) {

        String str = "Hello  how are you?";
//        Character ch =  new  Character() ['a', 'e', 'i', 'o', 'u'];
//        List<Character> vowels = new ArrayList<>();
//        String collect = str.chars().mapToObj(eachChar -> (char) eachChar).filter(eachChar -> !"aeiouAEIOU".contains(String.valueOf(eachChar))).map(String::valueOf).collect(Collectors.joining());
//        System.out.println(collect);
//        List<Character> collect = str.chars().mapToObj(c -> (char) c).filter(c -> "aeiouAEIOU".indexOf(c) != -1).toList();
        List<Character> list = str.chars().mapToObj(c -> (char) c).filter(c -> "aeiouAEIOU".indexOf(c) == -1 && !Character.isWhitespace(c) && Character.isLetter(c)).toList();
//        System.out.println(collect);
        System.out.println(list);
    }
}