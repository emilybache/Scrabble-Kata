package codingdojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class KidsAlfapetDataTest {
    
    @Test
    public void testBoardMatchesPremiumSquares() {
        int totalPremiumCellsFound = 0;
        for (int i = 0; i < KidsAlfapetData.Board.size(); ++i) {
            List<String> row = KidsAlfapetData.Board.get(i); 
            for (int j = 0 ; j < row.size(); ++j) {
                String cell = row.get(j);
                char column = Character.valueOf((char) ('A' + j));
                if (! cell.equals(KidsAlfapetData.SP)) {
                    totalPremiumCellsFound++;
                    String key = column + "," + (i+1);
                    assertEquals(cell, KidsAlfapetData.PremiumSquares.get(key),"for key: " + key );
                }   
            }
        }
        assertEquals(KidsAlfapetData.PremiumSquares.size(), totalPremiumCellsFound);
    }

}
