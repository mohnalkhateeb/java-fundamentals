/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;


public class Library {

    public static void main(String[] args){
        Restaurant restaurant = new Restaurant("hhh",1);
        System.out.println(restaurant.toString());
        Review review = new Review("njuhiy","momo",0);
        System.out.println(review);
        Review r1 = new Review("pppp","5555",3);
        Review r2 = new Review("pppp","5555",3);
        restaurant.addReview(review);
        restaurant.addReview(r1);
        restaurant.addReview(r2);
        System.out.println(restaurant.toStringOfReviews());
        Shop bobo = new Shop("bobo","toys Shop",3);
        System.out.println(bobo.toString());
        bobo.addReview(review);
        bobo.addReview(r1);
        bobo.addReview(r2);
        System.out.println(bobo.toStringOfReviews());
         Theater theater = new Theater("Joki");
         theater.addMovie("jaki");
         theater.addMovie(("sporter"));
        System.out.println(theater.toStringOfMovies(theater.getMovies()));
         theater.addReview(review);
         theater.addReview(r1);
         theater.addReview(r2);

        System.out.println(theater.toStringOfReviews());
        System.out.println(theater.toString());


    }

}
