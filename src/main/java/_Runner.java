/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _Runner {

    public static void main(String[] args) {
        System.out.println(calculate(args));
    }

    public static double calculate (String[] numS) {

        try {
            double a = Double.parseDouble(numS[0]);
            double b = Double.parseDouble(numS[1]);
            double c = Double.parseDouble(numS[2]);

            if (a <= b) {
                if (b <= c) {
                    return a + c;
                } else {
                    return a + b;
                }
            } else {
                if (a < c) {
                    return b + c;
                } else {
                    return a + b;
                }
            }
        } catch (NumberFormatException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        }

        return 0;
    }

}
