package inheritance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReviewTest {
    @Test
    public void toStringTest() {
        Review review = new Review("This restaurant was fine", "Moh Kh", 4);

        assertEquals(
                "testToString should print: ",
                "Author is Moh Kh with number of stars: 4.0 and he/she wrote: This restaurant was fine",
                review.toString()
        );
    }
    @Test
    public void getBodyTest() {
        Review review = new Review("This restaurant was fine", "Moh kh", 4);

        assertEquals(
                "GetBodyT should return: ",
                "This restaurant was fine",
                review.getBody()
        );
    }

    @Test
    public void getAuthorTest() {
        Review review = new Review("This restaurant was fine", "Moh kh", 4);

        assertEquals(
                "GetAuthorTest should return: ",
                "Moh kh",
                review.getAuthor()
        );
    }

    @Test
    public void getStarsTest() {
        Review review = new Review("This restaurant was fine", "Moh kh", 4);

        assertEquals(
                "GetStarsTest should return: ",
                review.getStars()

        );
    }












}
