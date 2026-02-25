import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TravelCalTest {

    @Test
    public void testTravelCal() {
        assertEquals(60, TravelCal.calculateSpeed(60, 1));
        assertEquals(120, TravelCal.calculateSpeed(60, 0.5));
    }
}
