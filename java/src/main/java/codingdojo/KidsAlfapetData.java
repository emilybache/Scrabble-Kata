package codingdojo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KidsAlfapetData {

    public static final String SP = "  ";
    private static final String P1 = "+1";
    private static final String P2 = "+2";
    private static final String P3 = "+3";
    private static final String P4 = "+4";

    public static Map<Character, Integer> Tiles = new HashMap<Character, Integer>() {
        {
            put(' ', 0);
            put('A', 1);
            put('B', 1);
            put('C', 1);
            put('D', 1);
            put('E', 1);
            put('F', 1);
            put('G', 1);
            put('H', 1);
            put('I', 1);
            put('J', 1);
            put('K', 1);
            put('L', 1);
            put('M', 1);
            put('N', 1);
            put('O', 1);
            put('P', 1);
            put('Q', 1);
            put('R', 1);
            put('S', 1);
            put('T', 1);
            put('U', 1);
            put('V', 1);
            put('W', 1);
            put('X', 1);
            put('Y', 1);
            put('Z', 1);
            put('Å', 1);
            put('Ä', 1);
            put('Ö', 1);
        }
    };

    public static List<List<String>> Board = Arrays.asList(
            Arrays.asList(P4, SP, SP, SP, SP, P4, SP, SP, SP, SP, SP, P4, SP, SP, SP, SP, P4),
            Arrays.asList(SP, SP, SP, SP, SP, SP, SP, SP, P3, SP, SP, SP, SP, SP, SP, SP, SP),
            Arrays.asList(SP, SP, P3, SP, SP, SP, SP, P3, SP, P3, SP, SP, SP, SP, P3, SP, SP),
            Arrays.asList(SP, SP, SP, SP, SP, SP, P2, SP, SP, SP, P2, SP, SP, SP, SP, SP, SP),
            Arrays.asList(SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP),
            Arrays.asList(P4, SP, SP, SP, SP, SP, SP, SP, P2, SP, SP, SP, SP, SP, SP, SP, P4),
            Arrays.asList(SP, SP, SP, P2, SP, SP, P1, SP, SP, SP, P1, SP, SP, P2, SP, SP, SP),
            Arrays.asList(SP, SP, P3, SP, SP, SP, SP, P1, SP, P1, SP, SP, SP, SP, P3, SP, SP),
            Arrays.asList(SP, P3, SP, SP, SP, P2, SP, SP, SP, SP, SP, P2, SP, SP, SP, P3, SP),
            Arrays.asList(SP, SP, P3, SP, SP, SP, SP, P1, SP, P1, SP, SP, SP, SP, P3, SP, SP),
            Arrays.asList(SP, SP, SP, P2, SP, SP, P1, SP, SP, SP, P1, SP, SP, P2, SP, SP, SP),
            Arrays.asList(P4, SP, SP, SP, SP, SP, SP, SP, P2, SP, SP, SP, SP, SP, SP, SP, P4),
            Arrays.asList(SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP, SP),
            Arrays.asList(SP, SP, SP, SP, SP, SP, P2, SP, SP, SP, P2, SP, SP, SP, SP, SP, SP),
            Arrays.asList(SP, SP, P3, SP, SP, SP, SP, P3, SP, P3, SP, SP, SP, SP, P3, SP, SP),
            Arrays.asList(SP, SP, SP, SP, SP, SP, SP, SP, P3, SP, SP, SP, SP, SP, SP, SP, SP),
            Arrays.asList(P4, SP, SP, SP, SP, P4, SP, SP, SP, SP, SP, P4, SP, SP, SP, SP, P4)
    );

    public static Map<String, String> PremiumSquares = new HashMap<String, String>() {
        {
            put("A,1", P4);
            put("F,1", P4);
            put("L,1", P4);
            put("Q,1", P4);

            put("I,2", P3);
            
            put("C,3", P3);
            put("H,3", P3);
            put("J,3", P3);
            put("O,3", P3);

            put("G,4", P2);
            put("K,4", P2);

            put("A,6", P4);
            put("I,6", P2);
            put("Q,6", P4);

            put("D,7", P2);
            put("G,7", P1);
            put("K,7", P1);
            put("N,7", P2);

            put("C,8", P3);
            put("H,8", P1);
            put("J,8", P1);
            put("O,8", P3);

            put("B,9", P3);
            put("F,9", P2);
            put("L,9", P2);
            put("P,9", P3);

            put("C,10", P3);
            put("H,10", P1);
            put("J,10", P1);
            put("O,10", P3);

            put("D,11", P2);
            put("G,11", P1);
            put("K,11", P1);
            put("N,11", P2);
            
            put("A,12", P4);
            put("I,12", P2);
            put("Q,12", P4);

            put("G,14", P2);
            put("K,14", P2);

            put("C,15", P3);
            put("H,15", P3);
            put("J,15", P3);
            put("O,15", P3);

            put("I,16", P3);

            put("A,17", P4);
            put("F,17", P4);
            put("L,17", P4);
            put("Q,17", P4);
        }
    };

}
