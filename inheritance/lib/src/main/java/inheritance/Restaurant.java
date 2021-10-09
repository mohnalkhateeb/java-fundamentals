package inheritance;

import java.util.LinkedList;

public class Restaurant  {

    private String name;
    private int stars = 0;
    private int priceCategory;

    private  static LinkedList<Review> reviews = new LinkedList<>();
    //  Constructor
    Restaurant(String name, int priceCategory ) {
        this.name = name;
        this.priceCategory = Math.min(priceCategory, 4);
    }
    public String getName() {
        return this.name;
    }
    public int getStars() {
        return this.stars;
    }

    public int getPriceCategory() {
        return this.priceCategory;
    }

    public String getPriceString(int numOfChars){
        return new String(new char[numOfChars]).replace("\0", "$");
    }

    public LinkedList<Review> getReviews() {
        return this.reviews;
    }

    public String toStringOfReviews() {
        LinkedList<Review> reviews = getReviews();
        StringBuilder review = new StringBuilder();
        for (Review value : reviews) {
            review.append(value.toString()+"\n");
        }
        return review.toString();
    }
    public void updateStars() {
        int current = 0;
        for (int i = 0; i < getReviews().size(); i++) {
            current += getReviews().get(i).getStars();
        }
        current /= (getReviews().size());
        current = (int) Math.ceil(Math.round(current * 10.0) / 10.0);
        this.stars = current;
    }
    public void addReview(Review review) {
        this.reviews.add(review);
//        review.setReviewInterface(this);
        updateStars();
    }
    @Override
    public String toString() {

        return String.format(
                "%s has a rating of %s stars and is a %s price category",
                getName(), getStars(), getPriceString(getPriceCategory())
        );
    }
}
