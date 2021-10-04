package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test
    public void getNameTest() {
        Restaurant testRestaurant = new Restaurant("come in your time ", 1 , 2);

        assertEquals(
                "testGetName should return: ",
                "come in your time",
                testRestaurant.getName()
        );
    }

    @Test
    public void getStarsTest() {
        Restaurant testRestaurant = new Restaurant("come in your time", 1,2);

        assertEquals(
                "come in your time ",
                testRestaurant.getStars()

        );
    }

    @Test
    public void getPriceCategoryTest() {
        Restaurant testRestaurant = new Restaurant("come in your time", 1,2);

        assertEquals(
                "come in your time ",
                testRestaurant.getPriceCategory()
        );
    }

    @Test
    public void emptyGetReviewTest() {
        Restaurant testRestaurant = new Restaurant("come in your time", 1,2);

        assertEquals(
                "emptyGetReviewTest should print: ",
                testRestaurant.getReviews()
        );
    }

    @Test
    public void fillingGetReviewTest() {
        ArrayList<Review> testOfReview = new ArrayList<>();
        Restaurant restaurantTest = new Restaurant("come in your time", 1,2);
        Review review = new Review("This restaurant was not bad", "Moh kh", 3);

        restaurantTest.addReview(review);
        testOfReview.add(review);

        assertEquals(
                "fillingGetReviewTest should print: ",
                restaurantTest.getReviews()
        );
    }

    @Test
    public void toStringTest() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1,2);

        assertEquals(
                "testToString should return: ",
                "come in your time is a $ price point",
                restaurantTest.toString()
        );
    }

    @Test
    public void addOneReview() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1,2);
        Review review = new Review("This restaurant was not bad", "Moh kh", 3);
        restaurantTest.addReview(review);

        assertEquals(
                "addOneReview should print: ",
                "Author: Moh Kh give Number of Stars: 4.0 and write  This restaurant was not bad",
                restaurantTest.toStringOfReviews()
        );
    }

    @Test
    public void addMultipleReviewTest() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1,2);
        Review review = new Review("This restaurant was good", "Moh Kh", 4);
        Review review1 = new Review("This restaurant was bad", "Moh kh", 1);
        restaurantTest.addReview(review);
        restaurantTest.addReview(review1);

        assertEquals(
                "addMultipleReviewTest should print: ",
                "Author: Moh Kh give Number of Stars: 4.0 and write  This restaurant was good" +
                        "Author: Moh Kh give Number of Stars: 4.0 and write  This restaurant was bad",
                restaurantTest.toStringOfReviews()
        );
    }

    @Test
    public void oneReviewUpdateStarsTest() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1,2);
        Review review = new Review("This restaurant was not bad", "Moh Kh", 4);
        restaurantTest.addReview(review);

        assertEquals(
                "oneReviewUpdateStarsTest should return: ",
                restaurantTest.getStars()

        );
    }

    @Test
    public void multipleReviewUpdateStarsTest() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1,2);
        Review review = new Review("This restaurant was good", "Moh Kh", 4);
        Review review1 = new Review("This restaurant was bad", "Moh Kh", 1);
        restaurantTest.addReview(review);
        restaurantTest.addReview(review1);

        assertEquals(
                "multipleReviewUpdateStarsTest should print: ",
                restaurantTest.getStars()

        );
    }
}
