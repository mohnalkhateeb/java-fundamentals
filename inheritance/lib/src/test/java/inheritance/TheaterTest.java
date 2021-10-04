package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheaterTest {
    @Test
    public void getNameTest() {
        Theater testTheater = new Theater("come in your time ");

        assertEquals(
                "testGetName should return: ",
                "come in your time",
                testTheater.getName()
        );
    }

    @Test
    public void getStarsTest() {
        Theater testTheater = new Theater("come in your time");

        assertEquals(
                0,
                testTheater.getStars()

        );
    }

    @Test
    public void getMoviesTest() {
        Theater theater = new Theater("come in your time");
        theater.addMovie("Transporter ");

        assertEquals(
                "testGetMovies should return: ",
                "[Transporter]",
                theater.getMovies().toString()
        );
    }

    @Test
    public void removeMovieTest() {
        Theater theater = new Theater("come in your time");
        theater.addMovie("Transporter");
        theater.addMovie("Jaki");
        theater.removeMovie("shan");

        assertEquals(
                "testRemoveMovie should return: ",
                "shan",
                theater.toStringOfMovies(theater.getMovies())
        );
    }

    @Test
    public void toStringOfMovieTest() {
        Theater theater = new Theater("come in your time");
        theater.addMovie("Transporter");

        assertEquals(
                "testToMovieString should return: ",
                "Hebrew Hammer",
                theater.toStringOfMovies(theater.getMovies())
        );
    }
    @Test
    public void emptyGetReviewTest() {
        Theater testTheater = new Theater("come in your time");

        assertEquals(
                "emptyGetReviewTest should print: ",
                testTheater.getReviews()
        );
    }

    @Test
    public void fillingGetReviewTest() {
        ArrayList<Review> testOfReview = new ArrayList<>();
        Theater TheaterTest = new Theater("come in your time");
        Review review = new Review("This Theater was not bad", "Moh kh", 3);

        TheaterTest.addReview(review);
        testOfReview.add(review);

        assertEquals(
                "fillingGetReviewTest should print: ",
                TheaterTest.getReviews()
        );
    }

    @Test
    public void toStringTest() {
        Theater TheaterTest = new Theater("come in your time");

        assertEquals(
                "testToString should return: ",
                "come in your time \n"+
                TheaterTest.getStars()+"\n"+
                TheaterTest.getMovies(),
                TheaterTest.toString()
        );
    }

    @Test
    public void addOneReview() {
        Theater TheaterTest = new Theater("come in your time");
        Review review = new Review("This Theater was not bad", "Moh kh", 3);
        TheaterTest.addReview(review);

        assertEquals(
                "addOneReview should print: ",
                "Author: Moh Kh give Number of Stars: 4.0 and write  This Theater was not bad",
                TheaterTest.toStringOfReviews()
        );
    }

    @Test
    public void addMultipleReviewTest() {
        Theater TheaterTest = new Theater("come in your time");
        Review review = new Review("This Theater was good", "Moh Kh", 4);
        Review review1 = new Review("This Theater was bad", "Moh kh", 1);
        TheaterTest.addReview(review);
        TheaterTest.addReview(review1);

        assertEquals(
                "addMultipleReviewTest should print: ",
                "Author: Moh Kh give Number of Stars: 4.0 and write  This Theater was good" +
                        "Author: Moh Kh give Number of Stars: 4.0 and write  This Theater was bad",
                TheaterTest.toStringOfReviews()
        );
    }

    @Test
    public void oneReviewUpdateStarsTest() {
        Theater TheaterTest = new Theater("come in your time");
        Review review = new Review("This Theater was not bad", "Moh Kh", 4);
        TheaterTest.addReview(review);

        assertEquals(
                "oneReviewUpdateStarsTest should return: ",
                TheaterTest.getStars()

        );
    }

    @Test
    public void multipleReviewUpdateStarsTest() {
        Theater TheaterTest = new Theater("come in your time");
        Review review = new Review("This Theater was good", "Moh Kh", 4);
        Review review1 = new Review("This Theater was bad", "Moh Kh", 1);
        TheaterTest.addReview(review);
        TheaterTest.addReview(review1);

        assertEquals(
                "multipleReviewUpdateStarsTest should print: ",
                TheaterTest.getStars()

        );
    }
}
