import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyTest {
    
    private Property property1;

    @BeforeEach
    public void setUp() {
        property1 = new Property("T3 Monte Belo", 150000.0); 
    }

    @AfterEach
    public void tearDown() {
        property1 = null;
    }

    @Test
    public void testConstructor() { 
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(150000.0, property1.getPrice(), 0.01);
    }
}
