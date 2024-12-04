
public class Primes {

    public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int j = 2;
        boolean[] bool = new boolean[lim];
        for (int i = 0; i < bool.length; i++) { // if the index>1 it is true
            if ((i + 1) > 1) {
                bool[i] = true;
            }
            // System.out.println(i + 1); // count 1-7
        }
        for (int i = 1; i < bool.length; i++) {
            while ((i + 1) % j == 0 && i > j) {
                bool[i] = false;
                break;
            }
            if (i + 1 == lim) {
                j++;
                i = j + 1;
            }
        }
        System.out.println("Prime numbers up to " + lim + ":");

        double countP = 0;
        for (int i = 0; i < bool.length; i++) {
            if (bool[i] == true) {
                countP++;
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
        double presentage = (countP / lim) * 100;
        System.out.println("There are " + (int) countP + " primes between 2 and " + lim + " (" + (int) presentage + "% are primes) ");
    }
}
