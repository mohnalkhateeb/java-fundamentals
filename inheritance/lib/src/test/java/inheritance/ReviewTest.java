package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReviewTest {
    @Test
    public void toStringTest() {
        Review review = new Review("This restaurant was fine", "Moh Kh", 4);

        assertEquals(
                "Author is Moh Kh with number of stars 4 and he/she wrote: This restaurant was fine",
                review.toString());
    }
    @Test
    public void getBodyTest() {
        Review review = new Review("This restaurant was fine", "Moh kh", 4);

        assertEquals("This restaurant was fine", review.getBody());
    }

    @Test
    public void getAuthorTest() {
        Review review = new Review("This restaurant was fine", "Moh kh", 4);

        assertEquals("Moh kh", review.getAuthor());
    }

    @Test
    public void getStarsTest() {
        Review review = new Review("This restaurant was fine", "Moh kh", 4);

        assertEquals(4, review.getStars());
    }






}
