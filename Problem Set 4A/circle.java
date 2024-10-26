
/**
 * Write a description of class circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class circle
{
      public static void main(String[] args) {
        StdDraw.setScale(0, 500);

        int radius = 250;
        for (int i = radius; i > 0; i -= 20) {
            if (i % 40 == 0) {
                StdDraw.setPenColor(StdDraw.BLACK);
            } else {
                StdDraw.setPenColor(StdDraw.WHITE);
            }
            StdDraw.filledCircle(250, 250, i);
        }
    }
}
