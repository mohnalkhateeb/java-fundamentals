package inheritance;

import java.util.LinkedList;

public class Theater implements InterfaceOfReview{
    private String name;
    private int stars = 0;
    private LinkedList<String> movies = new LinkedList<>();
    private LinkedList<Review> reviews = new LinkedList<>();

    Theater(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getStars() {
        return this.stars;
    }
    public LinkedList<String> getMovies() {
        return this.movies;
    }
    public void addMovie(String movie) {

        this.movies.add(movie);
    }
    public void removeMovie(String movie) {

        this.movies.remove(movie);
    }
    public String toStringOfMovies(LinkedList<String> movies) {
        StringBuilder moviesList = new StringBuilder();
        if (movies.size() == 0) {
            return "No Movies To Show";
        }
        for (int i = 0; i < movies.size() ; i++) {
            moviesList.append(movies.get(i)).append(" , ");
        }
        return moviesList.toString();
    }
    @Override
    public void addReview(Review review) {
        this.reviews.add(review);
        review.setReviewInterface(this);
        updateStars();
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
                        "Stars: %s\n" +
                        "Movies: %s\n",
                getName(), getStars(), toStringOfMovies(getMovies())
        );
    }
}
