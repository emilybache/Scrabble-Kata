package codingdojo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScrabbleData {

    public static Map<Character, Integer> Tiles = new HashMap<Character, Integer>() {
        {
            put(' ', 0);
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

    public static Map<String, String> PremiumSquares = new HashMap<String, String>() {
        {
            put("A,1", "3xWS");
            put("D,1", "2xLS");
            put("H,1", "3xWS");
            put("L,1", "2xLS");
            put("O,1", "3xWS");

            put("B,2", "2xWS");
            put("F,2", "3xLS");
            put("J,2", "3xLS");
            put("N,2", "2xWS");

            put("C,3", "2xWS");
            put("G,3", "2xLS");
            put("I,3", "2xLS");
            put("M,3", "2xWS");

            put("A,4", "2xLS");
            put("D,4", "2xWS");
            put("H,4", "2xLS");
            put("L,4", "2xWS");
            put("O,4", "2xLS");

            put("E,5", "2xWS");
            put("K,5", "2xWS");

            put("B,6", "3xLS");
            put("F,6", "3xLS");
            put("J,6", "3xLS");
            put("N,6", "3xLS");

            put("C,7", "2xLS");
            put("G,7", "2xLS");
            put("I,7", "2xLS");
            put("M,7", "2xLS");

            put("A,8", "3xWS");
            put("D,8", "2xLS");
            put("H,8", "star");
            put("L,8", "2xLS");
            put("O,8", "3xWS");

            put("C,9", "2xLS");
            put("G,9", "2xLS");
            put("I,9", "2xLS");
            put("M,9", "2xLS");

            put("B,10", "3xLS");
            put("F,10", "3xLS");
            put("J,10", "3xLS");
            put("N,10", "3xLS");

            put("E,11", "2xWS");
            put("K,11", "2xWS");

            put("A,12", "2xLS");
            put("D,12", "2xWS");
            put("H,12", "2xLS");
            put("L,12", "2xWS");
            put("O,12", "2xLS");

            put("C,13", "2xWS");
            put("G,13", "2xLS");
            put("I,13", "2xLS");
            put("M,13", "2xWS");

            put("B,14", "2xWS");
            put("F,14", "3xLS");
            put("J,14", "3xLS");
            put("N,14", "2xWS");

            put("A,15", "3xWS");
            put("D,15", "2xLS");
            put("H,15", "3xWS");
            put("L,15", "2xLS");
            put("O,15", "3xWS");
        }
    };

}
