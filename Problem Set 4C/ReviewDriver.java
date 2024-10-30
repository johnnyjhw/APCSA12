
/**
 * Write a description of class ReviewDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReviewDriver
{
    public static void main(String[] args) {
        /*
        double a = Review.sentimentVal("approved");
        System.out.println(a);
        
        double b = Review.sentimentVal("dream");
        System.out.println(b);
        
        double c = Review.sentimentVal("reality");
        System.out.println(c);
        
        */
        double simplesenti = Review.totalSentiment("SimpleReview.txt");
        System.out.println(simplesenti);
        
        double lbssreview = Review.totalSentiment("lbreview.txt");
        System.out.println(lbssreview);
        
        double teststar = Review.starRating("lbreview.txt");
        System.out.println(teststar);
        
        String fakereview = Review.fakeReview("SimpleReview.txt");
        System.out.println(fakereview);
        
        String fakereview2 = Review.fakeReview("lbReview.txt");
        System.out.println(fakereview2);
    
    }
    }

