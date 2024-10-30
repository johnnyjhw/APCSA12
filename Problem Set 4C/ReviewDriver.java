
/**
 * Write a description of class ReviewDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReviewDriver
{
    public static void main(String[] args) {
        
        double a = Review.sentimentVal("approved.txt");
        System.out.println(a);
        double simplesenti = Review.totalSentiment("SimpleReview.txt");
        System.out.println(simplesenti);
    
        double lbssreview = Review.totalSentiment("lbreview.txt");
        System.out.println(lbssreview);
        
        double teststar = Review.starRating("lbreview.txt");
        System.out.println(teststar);
    
    }
    }

