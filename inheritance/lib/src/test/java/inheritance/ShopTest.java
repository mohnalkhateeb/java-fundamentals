package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    @Test
    public void getNameTest() {
        Shop testShop = new Shop("come in your time ", "Home requirements " , 2);

        assertEquals(
                "testGetName should return: ",
                "come in your time",
                testShop.getName()
        );
    }

    @Test
    public void getStarsTest() {
        Shop testShop = new Shop("come in your time", "Home requirements",2);

        assertEquals(
                0,
                testShop.getStars()

        );
    }

    @Test
    public void getDescriptionTest() {
        Shop testShop = new Shop("come in your time", "Home requirements",2);

        assertEquals(
                "Home requirements ",
                testShop.getDescription()
        );
    }
    @Test
    public void getPriceCategoryTest() {
        Shop testShop = new Shop("come in your time", "Home requirements",2);

        assertEquals(
                2,
                testShop.getPriceCategory()
        );
    }

    @Test
    public void emptyGetReviewTest() {
        Shop testShop = new Shop("come in your time", "Home requirements",2);

        assertEquals(
                "emptyGetReviewTest should print: ",
                testShop.getReviews()
        );
    }

    @Test
    public void fillingGetReviewTest() {
        ArrayList<Review> testOfReview = new ArrayList<>();
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was not bad", "Moh kh", 3);

        ShopTest.addReview(review);
        testOfReview.add(review);

        assertEquals(
                "fillingGetReviewTest should print: ",
                ShopTest.getReviews()
        );
    }

    @Test
    public void toStringTest() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);

        assertEquals(
                "testToString should return: ",
                "come in your time \n"+
                        ShopTest.getDescription()+"\n"+
                        ShopTest.getStars()+"\n"+
                        ShopTest.getPriceCategory(),
                ShopTest.toString()
        );
    }

    @Test
    public void addOneReview() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was not bad", "Moh kh", 3);
        ShopTest.addReview(review);

        assertEquals(
                "addOneReview should print: ",
                "Author: Moh Kh give Number of Stars: 4.0 and write  This Shop was not bad",
                ShopTest.toStringOfReviews()
        );
    }

    @Test
    public void addMultipleReviewTest() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was good", "Moh Kh", 4);
        Review review1 = new Review("This Shop was bad", "Moh kh", 1);
        ShopTest.addReview(review);
        ShopTest.addReview(review1);

        assertEquals(
                "addMultipleReviewTest should print: ",
                "Author: Moh Kh give Number of Stars: 4.0 and write  This Shop was good" +
                        "Author: Moh Kh give Number of Stars: 4.0 and write  This Shop was bad",
                ShopTest.toStringOfReviews()
        );
    }

    @Test
    public void oneReviewUpdateStarsTest() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was not bad", "Moh Kh", 4);
        ShopTest.addReview(review);

        assertEquals(
                "oneReviewUpdateStarsTest should return: ",
                ShopTest.getStars()

        );
    }

    @Test
    public void multipleReviewUpdateStarsTest() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was good", "Moh Kh", 4);
        Review review1 = new Review("This Shop was bad", "Moh Kh", 1);
        ShopTest.addReview(review);
        ShopTest.addReview(review1);

        assertEquals(
                "multipleReviewUpdateStarsTest should print: ",
                ShopTest.getStars()

        );
    }
}
