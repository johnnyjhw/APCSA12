
/**
 * Write a description of class curve here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawCurve {
    public static void main(String[] args) {
        StdDraw.setScale(0, 500);
        int step = 20;

        for (int i = 0; i <= 500; i += step) {
            StdDraw.line(0, i, i, 500);
        }

        for (int i = 0; i <= 500; i += step) {
            StdDraw.line(i, 0, 500, i);
        }
    }
}

