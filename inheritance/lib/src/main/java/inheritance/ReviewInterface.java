package inheritance;

import java.util.LinkedList;

public interface ReviewInterface {
    String getName();

    int getStars();

    void addReview(Review review);

    LinkedList<Review> getReviews();

    void updateStars();

    String toStringOfReviews();

    String toString();
}
