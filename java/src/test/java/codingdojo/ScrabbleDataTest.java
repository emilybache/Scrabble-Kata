package codingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.junit.jupiter.api.Test;

/**
 * Test case proving that the top-level json file matches the data stored in the ScrabbleData POJO.
 * 
 * @author epkanol
 */
public class ScrabbleDataTest {
    
    @Test
    public void testBoardMatchesPremiumSquares() {
        int totalPremiumCellsFound = 0;
        for (int i = 0; i < ScrabbleData.Board.size(); ++i) {
            List<String> row = ScrabbleData.Board.get(i); 
            for (int j = 0 ;    j < row.size(); ++j) {
                String cell = row.get(j);
                char column = Character.valueOf((char) ('A' + j));
                if (! cell.equals("    ")) {
                    totalPremiumCellsFound++;
                    String key = column + "," + (i+1);
                    assertEquals(cell, ScrabbleData.PremiumSquares.get(key),"for key: " + key );
                }   
            }
        }
        assertEquals(ScrabbleData.PremiumSquares.size(), totalPremiumCellsFound);
    }
    
    @Test
    public void testTilesMatchJson() throws IOException {
        JsonObject jsonObject = readScrabbleDataJson();
        JsonObject tiles = jsonObject.get("Tiles").asJsonObject();
        Set<String> tileKeys = tiles.keySet();
        assertEquals(ScrabbleData.Tiles.size(), tileKeys.size());
        for (Character c : ScrabbleData.Tiles.keySet()) {
            assertEquals(ScrabbleData.Tiles.get(c).intValue(), tiles.getInt(c.toString()));
        }
    }

    private JsonObject readScrabbleDataJson() throws FileNotFoundException {
        JsonObject jsonObject = null;
        try (JsonReader reader = Json.createReader(new FileReader("../scrabble_data.json"))) {
            jsonObject = reader.readObject();
        }
        return jsonObject;
    }
    
    @Test
    public void testBoardMatchJson() throws IOException {
        JsonObject jsonObject = readScrabbleDataJson();
        JsonArray board = jsonObject.get("Board").asJsonArray();
        assertEquals(ScrabbleData.Board.size(), board.size());
        for (int i = 0, len = ScrabbleData.Board.size(); i < len; ++i) {
            List<String> row = ScrabbleData.Board.get(i);
            JsonArray jsonArray = board.getJsonArray(i);
            int rowlength = row.size();
            assertEquals(rowlength, jsonArray.size(), "row " + i);
            for (int j = 0; j < rowlength; ++j) {
                assertEquals(row.get(j), jsonArray.getString(j), "for coordinate " + coord(i,j));
            }
        }
    }

    private String coord(int i, int j) {
        char col = (char) ('A'+j);
        int row = i+1;
        return col + "," + row;
    }
    
    @Test
    public void testPremiumSquaresMatchJson() throws IOException {
        JsonObject jsonObject = readScrabbleDataJson();
        JsonObject premiumSquares = jsonObject.getJsonObject("PremiumSquares");
        assertEquals(ScrabbleData.PremiumSquares.size(), premiumSquares.size());
        for(String key : ScrabbleData.PremiumSquares.keySet()) {
            assertEquals(ScrabbleData.PremiumSquares.get(key), premiumSquares.getString(key));
        }
    }
}
