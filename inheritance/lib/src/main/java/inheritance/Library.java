/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {

    public static void main(String[] args){
        Restaurant restaurant = new Restaurant("hhh",4,3);
        System.out.println(restaurant.toString());
        Review review = new Review("njuhiy","momo",2);
        System.out.println(review);
        Review r1 = new Review("pppp","5555",3);
        Review r2 = new Review("pppp","5555",3);
        restaurant.addReview(review);
        restaurant.addReview(r1);
        restaurant.addReview(r2);
        System.out.println(restaurant.toStringOfReviews());
    }

}
