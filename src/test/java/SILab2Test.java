import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private static SILab2 object = new SILab2();

    private List<String> getList(String... strings){
        return new ArrayList<>(Arrays.asList(strings));
    }

    @Test
    void EveryStatementTest() {
            IllegalArgumentException iae = null;
            iae = assertThrows(IllegalArgumentException.class, () -> object.function(new ArrayList<>()));
            assertTrue(iae.getMessage().contains("List length should be greater than 0"));
            assertEquals(getList("1", "#", "2", "#", "1"), object.function(getList("0", "#", "0", "#", "0")));
    }

    @Test
    void EveryPathTest(){
            IllegalArgumentException iae = null;
            iae = assertThrows(IllegalArgumentException.class, () -> object.function(new ArrayList<>()));
            assertTrue(iae.getMessage().contains("List length should be greater than 0"));
            assertEquals(getList("#"), object.function(getList("#")));
            assertEquals(getList("0"), object.function(getList("0")));
            assertEquals(getList("#", "#", "#", "#"), object.function(getList("#", "#", "#", "#")));
            assertEquals(getList("0", "0", "0", "0"), object.function(getList("0", "0", "0", "0")));
            assertEquals(getList("#", "2", "#", "1"), object.function(getList("#", "0", "#", "0")));
            assertEquals(getList("#", "1", "1", "#"), object.function(getList("#", "0", "0", "#")));
            assertEquals(getList("1", "#", "2", "#"), object.function(getList("0", "#", "0", "#")));
            assertEquals(getList("#", "#", "#", "1"), object.function(getList("#", "#", "#", "0")));
            assertEquals(getList("0", "1", "#", "#"), object.function(getList("0", "0", "#", "#")));
            assertEquals(getList("1", "#", "#", "#"), object.function(getList("0", "#", "#", "#")));
    }
}