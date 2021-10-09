package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheaterTest {
    @Test
    public void getNameTest() {
        Theater testTheater = new Theater("come in your time");

        assertEquals("come in your time",
                testTheater.getName());
    }

    @Test
    public void getStarsTest() {
        Theater testTheater = new Theater("come in your time");

        assertEquals(0, testTheater.getStars());
    }
    @Test
    public void addMoviesTest() {
        Theater theater = new Theater("come in your time");
        theater.addMovie("Transporter ");

        assertEquals(1, theater.getMovies().size());
    }
    @Test
    public void getMoviesTest() {
        Theater theater = new Theater("come in your time");
        theater.addMovie("Transporter");

        assertEquals("[Transporter]", theater.getMovies().toString());
    }

    @Test
    public void removeMovieTest() {
        Theater theater = new Theater("come in your time");
        theater.addMovie("Transporter");
        theater.addMovie("Jaki");
        theater.removeMovie("shan");

        assertEquals("Transporter , Jaki , ", theater.toStringOfMovies(theater.getMovies()));
    }

    @Test
    public void toStringOfMovieTest() {
        Theater theater = new Theater("come in your time");
        assertEquals("No Movies To Show",theater.toStringOfMovies(theater.getMovies()));
        theater.addMovie("Transporter");
        theater.addMovie("Jaki");
        assertEquals("Transporter , Jaki , ", theater.toStringOfMovies(theater.getMovies()));
    }
    @Test
    public void emptyGetReviewTest() {
        Theater testTheater = new Theater("come in your time");

        assertEquals(0, testTheater.getReviews().size());
    }

    @Test
    public void fillingGetReviewTest() {
        ArrayList<Review> testOfReview = new ArrayList<>();
        Theater TheaterTest = new Theater("come in your time");
        Review review = new Review("This Theater was not bad", "Moh kh", 3);

        TheaterTest.addReview(review);
        testOfReview.add(review);

        assertEquals("[Author is Moh kh with number of stars 3 and he/she wrote: This Theater was not bad]",
                TheaterTest.getReviews().toString());
    }


    @Test
    public void toStringWithMoviesTest() {
        Theater TheaterTest = new Theater("come in your time");
            TheaterTest.addMovie("Jaki");
            TheaterTest.addMovie("Baby");
        assertEquals(
                "Name: "+TheaterTest.getName()+"\n" +
                        "Stars: "+TheaterTest.getStars()+"\n" +
                        "Movies: "+TheaterTest.getMovies()+"\n",
                TheaterTest.toString());
    }

    @Test
    public void addOneReview() {
        Theater TheaterTest = new Theater("come in your time");
        Review review = new Review("This Theater was not bad", "Moh kh", 3);
        TheaterTest.addReview(review);

        assertEquals(
                "Author is Moh kh with number of stars 3 and he/she wrote: This Theater was not bad\n",
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
                "Author is Moh Kh with number of stars 4 and he/she wrote: This Theater was good\n" +
                        "Author is Moh kh with number of stars 1 and he/she wrote: This Theater was bad\n",
                TheaterTest.toStringOfReviews()
        );
    }

    @Test
    public void oneReviewUpdateStarsTest() {
        Theater TheaterTest = new Theater("come in your time");
        Review review = new Review("This Theater was not bad", "Moh Kh", 4);
        TheaterTest.addReview(review);

        assertEquals(4, TheaterTest.getStars());
    }

    @Test
    public void multipleReviewUpdateStarsTest() {
        Theater TheaterTest = new Theater("come in your time");
        Review review = new Review("This Theater was good", "Moh Kh", 4);
        Review review1 = new Review("This Theater was bad", "Moh Kh", 2);
        TheaterTest.addReview(review);
        TheaterTest.addReview(review1);

        assertEquals(3, TheaterTest.getStars());
    }
}
