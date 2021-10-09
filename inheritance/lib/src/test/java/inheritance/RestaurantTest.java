package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class RestaurantTest {

    @Test
    public void getNameTest() {
        Restaurant testRestaurant = new Restaurant("come in your time", 1 );

        assertEquals("come in your time", testRestaurant.getName());
    }

    @Test
    public void getStarsTest() {
        Restaurant testRestaurant = new Restaurant("come in your time", 1);
        assertEquals(0, testRestaurant.getStars());
    }

    @Test
    public void getPriceCategoryTest() {
        Restaurant testRestaurant = new Restaurant("come in your time", 1);

        assertEquals(1, testRestaurant.getPriceCategory());
    }

    @Test
    public void emptyGetReviewTest() {
        Restaurant testRestaurant = new Restaurant("come in your time", 1);

        assertEquals(0, testRestaurant.getReviews().size());
    }

    @Test
    public void fillingGetReviewTest() {
        ArrayList<Review> testOfReview = new ArrayList<>();
        Restaurant restaurantTest = new Restaurant("come in your time", 1);
        Review review = new Review("This restaurant was not bad", "Moh kh", 3);

        restaurantTest.addReview(review);
        testOfReview.add(review);

        assertEquals("[Author is  Moh kh with number of stars 3 and he/she wrote: This restaurant was not bad]",
                restaurantTest.getReviews().toString());
    }

    @Test
    public void toStringTestWithNoStatrs() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1);

        assertEquals("come in your time has a rating of 0 stars and is a $ price category ",
                restaurantTest.toString());
    }
    @Test
    public void toStringTestWithStars() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1);
        Review review = new Review("This restaurant was not bad", "Moh kh", 3);

        restaurantTest.addReview(review);
//        testOfReview.add(review);
        assertEquals("come in your time has a rating of 3 stars and is a $ price category ",
                restaurantTest.toString());
    }

    @Test
    public void addOneReviewTest() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1);
        Review review = new Review("This restaurant was not bad", "Moh kh", 3);
        restaurantTest.addReview(review);

        assertEquals(
                "Author is  Moh kh with number of stars 3 and he/she wrote: This restaurant was not bad",
                restaurantTest.toStringOfReviews()
        );
    }

    @Test
    public void addMultipleReviewTest() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1);
        Review review = new Review("This restaurant was good", "Moh Kh", 4);
        Review review1 = new Review("This restaurant was bad", "Moh kh", 1);
        restaurantTest.addReview(review);
        restaurantTest.addReview(review1);

        assertEquals(
                "Author is  Moh Kh with number of stars 4 and he/she wrote: This restaurant was good"+"\n"+
                        "Author is  Moh kh with number of stars 1 and he/she wrote: This restaurant was bad"+"\n",
                restaurantTest.toStringOfReviews()
        );
    }

    @Test
    public void oneReviewUpdateStarsTest() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1);
        Review review = new Review("This restaurant was not bad", "Moh Kh", 4);
        restaurantTest.addReview(review);

        assertEquals(4, restaurantTest.getStars());
    }

    @Test
    public void multipleReviewUpdateStarsTest() {
        Restaurant restaurantTest = new Restaurant("come in your time", 1);
        Review review = new Review("This restaurant was good", "Moh Kh", 4);
        Review review1 = new Review("This restaurant was bad", "Moh Kh", 2);
        Review review2 = new Review("This restaurant was not bad", "Moh Kh", 3);
        restaurantTest.addReview(review);
        restaurantTest.addReview(review1);

        assertEquals(3, restaurantTest.getStars());
    }
    @Test
    public void restaurantToStringWithReviewsTest() {
        Restaurant restaurantTest = new Restaurant("come in your time", 3);
        Review review = new Review("This restaurant was good", "Moh Kh", 4);
        Review review1 = new Review("This restaurant was bad", "Moh Kh", 2);
        Review review2 = new Review("This restaurant was not bad", "Moh Kh", 3);
        restaurantTest.addReview(review);
        restaurantTest.addReview(review1);

        assertEquals("come in your time has a rating of 3 stars and is a $$$ price category",
                restaurantTest.toString());
    }
}
