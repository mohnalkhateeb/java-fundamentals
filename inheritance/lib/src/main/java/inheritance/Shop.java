package inheritance;

import java.util.LinkedList;

public class Shop implements InterfaceOfReview{
    private String name;
    private String description;
    private int stars = 0;
    private int priceCategory;
    private LinkedList<Review> reviews = new LinkedList<>();

    // Constructor
    Shop(String name, String description, int priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = Math.min(priceCategory, 5);
    }
    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public int getStars() {
        return this.stars;
    }


    public int getPriceCategory() {
        return this.priceCategory;
    }

    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        review.setReviewInterface(this);
        updateStars();
    }


    public String getPriceString(int numOfChars) {
        return new String(new char[numOfChars]).replace("\0", "$");
    }

    @Override
    public LinkedList<Review> getReviews() {
         return this.reviews;
    }

    @Override
    public void updateStars() {
        int current = 0;
        for (int i = 0; i < getReviews().size(); i++) {
            current += getReviews().get(i).getStars();
        }
        current /= (getReviews().size());
        current = (int) Math.ceil(Math.round(current * 10.0) / 10.0);
        this.stars = current;
    }

    @Override
    public String toStringOfReviews() {
        LinkedList<Review> reviews = getReviews();
        StringBuilder review = new StringBuilder();
        for (Review value : reviews) {
            review.append(value.toString()).append("\n");
        }
        return review.toString();
    }
    @Override
    public String toString() {

        return String.format(
                "Name: %s\n" +
                        "Description: %s\n" +
                        "with Stars : %s\n"+
                        "Price Category: %s\n",
                getName(), getDescription(),getStars(), getPriceCategory()
        );
    }

    public String getDescription() {
        return  this.description;
    }
}
