## Lab 06 - Composition and Inheritance, part 1

#### Classes:
# Restaurant

  * ##### Variables:
  * String name
  * double stars
  * String priceCategory
  * LinkedList<Review> reviews
* #### Methods:
  * getName() : returns the name of the restaurant
  * getStars() : returns the double value of the stars
  * getPriceCategory : returns the price category of the restaurant
  * addReview(Review review) : adds a new review to the reviews LinkedList
  * getReview() : returns an LinkedList<Review> of the reviews
  * updateStars() : updates the star count as new reviews are added to the review list
  * toStringOfReviews() : Builds a string with all the elements from the reviews ArrayList using the 
  * toString() : Returns a formated string for the restaurant
    

**Review**
* #### Variables:
  * String body
  * String author
  * double stars
  * Restaurant restaurant
* #### Methods:
  * getBody() : returns the body of the review
  * getAuthor() : returns the author
  * getStars() : returns the stars
   class variables of the current review
  * toString() : returns the review as an organized string


## Lab 07 - Composition and Inheritance, part 2
#### Classes:
 

# Reviewable
#### Methods:
**Instance Reviewable**
* #### Methods:
  * **_public String getName()_**
  * **_public double getStars()_**
  * _**default void addMovie(String movieTitle) {}**_
  * _**public void addReview(Review review)**_
  * _**public LinkedList<Review> getReviews()**_
  * _**public void updateStars()**_
  * _**public String toReviewString()**_
  * _**public String toString()_**
# Shop
**Class Shop**
* #### Variables:
  * _String name_
  * _String description_
  * _double stars_
  * _int priceCategory_
  * _LinkedList<Review> reviews_
  * #### Methods:
  * getName() : returns the name of the shop
  * getStars() : returns the double value of the stars
  * getPriceCategory : returns the price category of the shop
  * addReview(Review review) : adds a new review to the reviews LinkedList
  * getReview() : returns an LinkedList<Review> of the reviews
  * updateStars() : updates the star count as new reviews are added to the review list
  * toStringOfReviews() : Builds a string with all the elements from the reviews ArrayList using the
  * toString() : Returns a formated string for the shop
# Theater
* #### Variables:
  * _String name_
  * _double stars_
  * _LinkedList<String> movies = new LinkedList<>()_
  * _LinkedList<Review> reviews = new LinkedList<>()_
  * #### Methods:
  * getName() : returns the name of the Theater
  * getStars() : returns the double value of the stars
  * getPriceCategory : returns the price category of the Theater
  * addReview(Review review) : adds a new review to the reviews LinkedList
  * getReview() : returns an LinkedList<Review> of the reviews
  * updateStars() : updates the star count as new reviews are added to the review list
  * toStringOfReviews() : Builds a string with all the elements from the reviews ArrayList using the
  * toString() : Returns a formated string for the Theater
  * _**addMovie(String movieTitle)**_ : adds a movie to the movies LinkedList
  * _**getMovies()**_ : returns the LinkedList of movies
  * _**removeMovie(String movieTitle)**_ : removes a movie from the LinkedList of movies
  * _**toMovieString(LinkedList<String> movie)**_ : returns a string will all of the movies from the LinkedList

# Review 
**Class Review**
* Variables:
  * _String body_
  * _String author_
  * _double stars_
  * _Reviewable reviewable_
  * _String movie_
* Methods:
  * _**getBody()**_ : returns the body of the review
  * _**getAuthor()**_ : returns the author
  * _**getStars()**_ : returns the stars
  * _**getMovie()**_ : returns the movie title
  * _**setReviewable(Reviewable reviewable)**_ : assigns an instance of the reviewable to the class variables of the current review
  * _**getReviewable()**_ :returns an instance of the reviewable assigned to the review
  * ***toString()*** : returns the review as an organized string


