package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test
    public void testToString() {
        Restaurant testRestaurant = new Restaurant("KFCCopy", 1,2);

        assertEquals(
                "testToString should print: ",
                "KFCCopy is a $ price point",
                testRestaurant.toString()
        );
    }
}
