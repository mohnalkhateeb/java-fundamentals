package inheritance;

import java.util.LinkedList;

public interface InterfaceOfReview {
    String getName();

    int getStars();
//    int getPriceCategory();
    void addReview(Review review);
//     String getPriceString(int numOfChars);
    LinkedList<Review> getReviews();

    void updateStars();

    String toStringOfReviews();

    String toString();
}
