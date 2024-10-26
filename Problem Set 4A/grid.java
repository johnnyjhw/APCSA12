
/**
 * Write a description of class patterns here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class grid {
     public static void main(String[] args) {
        StdDraw.setScale(0, 500);

        for (int x = 0; x <= 500; x += 20) {
            StdDraw.line(x, 0, x, 500);
        }

        for (int y = 0; y <= 500; y += 20) {
            StdDraw.line(0, y, 500, y);
        }
    }
}
