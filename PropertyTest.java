import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyTest {
    
    private Property property1;

    @BeforeEach
    public void setUp() {
        property1 = new Property("Casa na praia", 500000.0); 
    }

    @AfterEach
    public void tearDown() {
        property1 = null;
    }

    @Test
    public void testConstructor() { 
        assertEquals("Casa na praia", property1.getDescription());
        assertEquals(500000.0, property1.getPrice(), 0.01);
    }
}
