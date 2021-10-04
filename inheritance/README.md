## Lab 06 - Composition and Inheritance, part 1

#### Classes:
*  
    * Restaurant.java
    
    **Restaurant**
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