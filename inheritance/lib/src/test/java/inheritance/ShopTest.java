package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTest {
    @Test
    public void getNameTest() {
        Shop testShop = new Shop("come in your time", "Home requirements " , 2);

        assertEquals("come in your time", testShop.getName());
    }

    @Test
    public void getStarsTest() {
        Shop testShop = new Shop("come in your time", "Home requirements",2);

        assertEquals(0, testShop.getStars());
    }

    @Test
    public void getDescriptionTest() {
        Shop testShop = new Shop("come in your time", "Home requirements",2);

        assertEquals("Home requirements", testShop.getDescription());
    }
    @Test
    public void getPriceCategoryTest() {
        Shop testShop = new Shop("come in your time", "Home requirements",2);

        assertEquals(2, testShop.getPriceCategory());
    }
    @Test
    public void getPriceCategoryCharTest() {
        Shop testShop = new Shop("come in your time", "Home requirements",2);

        assertEquals("$$", testShop.getPriceString(testShop.getPriceCategory()));
    }

    @Test
    public void emptyGetReviewTest() {
        Shop testShop = new Shop("come in your time", "Home requirements",2);

        assertEquals(0, testShop.getReviews().size());
    }

    @Test
    public void fillingGetReviewTest() {
        ArrayList<Review> testOfReview = new ArrayList<>();
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was not bad", "Moh kh", 3);

        ShopTest.addReview(review);
        testOfReview.add(review);

        assertEquals("[Author is Moh kh with number of stars 3 and he/she wrote: This Shop was not bad]",
                ShopTest.getReviews().toString());
    }

    @Test
    public void toStringTest() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);

        assertEquals(
                "Name: "+ShopTest.getName()+ "\n"+
                        "Description: "+ShopTest.getDescription()+"\n"+
                        "with Stars : " +ShopTest.getStars()+"\n"+
                        "Price Category: "+ShopTest.getPriceCategory()+"\n",
                ShopTest.toString()
        );
    }

    @Test
    public void addOneReview() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was not bad", "Moh kh", 3);
        ShopTest.addReview(review);

        assertEquals(
                "Author is Moh kh with number of stars 3 and he/she wrote: This Shop was not bad"+"\n",
                ShopTest.toStringOfReviews());
    }

    @Test
    public void addMultipleReviewTest() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was good", "Moh Kh", 4);
        Review review1 = new Review("This Shop was bad", "Moh kh", 1);
        ShopTest.addReview(review);
        ShopTest.addReview(review1);

        assertEquals(
                "Author is Moh Kh with number of stars 4 and he/she wrote: This Shop was good" +"\n"+
                        "Author is Moh kh with number of stars 1 and he/she wrote: This Shop was bad"+"\n",
                ShopTest.toStringOfReviews());
    }

    @Test
    public void oneReviewUpdateStarsTest() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was not bad", "Moh Kh", 4);
        ShopTest.addReview(review);

        assertEquals(4, ShopTest.getStars());
    }

    @Test
    public void multipleReviewUpdateStarsTest() {
        Shop ShopTest = new Shop("come in your time", "Home requirements",2);
        Review review = new Review("This Shop was good", "Moh Kh", 4);
        Review review1 = new Review("This Shop was bad", "Moh Kh", 2);
        ShopTest.addReview(review);
        ShopTest.addReview(review1);

        assertEquals(3, ShopTest.getStars());
    }
}
