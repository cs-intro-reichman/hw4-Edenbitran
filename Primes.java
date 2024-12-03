
public class Primes {

    public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int j = 2;
        boolean[] bool = new boolean[lim];
        for (int i = 0; i < bool.length; i++) { // if the index>1 it is true
            if (i > 1) {
                bool[i] = true;
            }
            // System.out.printf("%8s", bool[i]);
        }
        System.out.println();
        for (int i = 2; i <= bool.length; i++) {
            while (i % j == 0 && i > j) {
                bool[i] = false;
                //System.out.println(bool[i]);
                break;
            }
            if (i + 1 == lim) {
                j++;
                i = j + 1;
            }
        }

        double countP = 0;
        for (int i = 0; i < bool.length; i++) {
            // System.out.printf("%8s", bool[i]);
            if (bool[i] == true) {
                countP++;
            }
        }

        double presentage = (countP / lim) * 100;
        System.out.println();
        System.out.println("Prime numbers up to " + lim + ":");
        System.out.println("There are " + (int) countP + " primes between 2 and " + lim + " (" + (int) presentage + "% are primes) ");
    }
}
