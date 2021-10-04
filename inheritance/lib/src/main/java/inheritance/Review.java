package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;
    private InterfaceOfReview ReviewInterface;

    //  Constructors
    Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }
    public String getBody() {
        return this.body;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getStars() {
        return this.stars;
    }

    void setReviewInterface(InterfaceOfReview ReviewInterface) {
        this.ReviewInterface = ReviewInterface;
    }
    @Override
    public String toString() {
        return String.format(
                "Author is  %s with number of stars %s and he/she wrote: %s",
                getAuthor(), getStars(), getBody()
        );
    }
}
