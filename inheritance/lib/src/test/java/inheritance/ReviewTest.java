package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReviewTest {
    @Test
    public void testToString() {
        Review review = new Review("This restaurant was fine", "Jimmy jimmy", 4);

        assertEquals(
                "testToString should print: ",
                "Author is Joe Schmoe with number of stars: 4.0 and he/she wrote: This restaurant was fine",
                review.toString()
        );
    }
}
