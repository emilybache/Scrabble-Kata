package codingdojo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScrabbleData {

    public static Map<Character, Integer> LetterScores = new HashMap<Character, Integer>()
    {
        {
            put('A', 1);
            put('B', 3);
            put('C', 3);
            put('D', 2);
            put('E', 1);
            put('F', 4);
            put('G', 2);
            put('H', 4);
            put('I', 1);
            put('J', 8);
            put('K', 5);
            put('L', 1);
            put('M', 3);
            put('N', 1);
            put('O', 1);
            put('P', 3);
            put('Q', 10);
            put('R', 1);
            put('S', 1);
            put('T', 1);
            put('U', 1);
            put('V', 4);
            put('W', 4);
            put('X', 8);
            put('Y', 4);
            put('Z', 10);
        }
    };

    public static List<List<String>> Board = Arrays.asList(
            Arrays.asList("3xWS", "    ", "    ", "2xLS", "    ", "    ", "    ", "3xWS", "    ", "    ", "    ", "2xLS", "    ", "    ", "3xWS"),
            Arrays.asList("    ", "2xWS", "    ", "    ", "    ", "3xLS", "    ", "    ", "    ", "3xLS", "    ", "    ", "    ", "2xWS", "    "),
            Arrays.asList("    ", "    ", "2xWS", "    ", "    ", "    ", "2xLS", "    ", "2xLS", "    ", "    ", "    ", "2xWS", "    ", "    "),
            Arrays.asList("    ", "    ", "    ", "2xWS", "    ", "    ", "    ", "2xLS", "    ", "    ", "    ", "2xWS", "    ", "    ", "    "),
            Arrays.asList("2xLS", "    ", "    ", "    ", "2xWS", "    ", "    ", "    ", "    ", "    ", "2xWS", "    ", "    ", "    ", "2xLS"),
            Arrays.asList("    ", "3xLS", "    ", "    ", "    ", "3xLS", "    ", "    ", "    ", "3xLS", "    ", "    ", "    ", "3xLS", "    "),
            Arrays.asList("    ", "    ", "2xLS", "    ", "    ", "    ", "2xLS", "    ", "2xLS", "    ", "    ", "    ", "2xLS", "    ", "    "),
            Arrays.asList("3xWS", "    ", "    ", "2xLS", "    ", "    ", "    ", "star", "    ", "    ", "    ", "2xLS", "    ", "    ", "3xWS"),
            Arrays.asList("    ", "    ", "2xLS", "    ", "    ", "    ", "2xLS", "    ", "2xLS", "    ", "    ", "    ", "2xLS", "    ", "    "),
            Arrays.asList("    ", "3xLS", "    ", "    ", "    ", "3xLS", "    ", "    ", "    ", "3xLS", "    ", "    ", "    ", "3xLS", "    "),
            Arrays.asList("2xLS", "    ", "    ", "    ", "2xWS", "    ", "    ", "    ", "    ", "    ", "2xWS", "    ", "    ", "    ", "2xLS"),
            Arrays.asList("    ", "    ", "    ", "2xWS", "    ", "    ", "    ", "2xLS", "    ", "    ", "    ", "2xWS", "    ", "    ", "    "),
            Arrays.asList("    ", "    ", "2xWS", "    ", "    ", "    ", "2xLS", "    ", "2xLS", "    ", "    ", "    ", "2xWS", "    ", "    "),
            Arrays.asList("    ", "2xWS", "    ", "    ", "    ", "3xLS", "    ", "    ", "    ", "3xLS", "    ", "    ", "    ", "2xWS", "    "),
            Arrays.asList("3xWS", "    ", "    ", "2xLS", "    ", "    ", "    ", "3xWS", "    ", "    ", "    ", "2xLS", "    ", "    ", "3xWS")
    );

}
