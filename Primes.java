
public class Primes {

    public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int j = 2;
        boolean[] bool = new boolean[lim];
        for (int i = 0; i < bool.length; i++) { // if the index>1 it is true
            if (i > 1) {
                bool[i] = true;
            }
            //System.out.printf("%8s", bool[i]);
        }
        //System.out.println();
        for (int i = 3; i < lim; i++) {
            while (i % j == 0) {
                bool[i] = false;
                //System.out.println(bool[i]);
                break;
            }
            if (i + 1 == lim) {
                j++;
                i = j + 1;
            }
        }
        int countP = 0;
        for (int i = 0; i < lim; i++) {
            //System.out.printf("%8s", bool[i]);
            if (bool[i] == true) {
                countP++;
            }
        }
        System.out.println("There are " + countP + " primes between 2 and " + lim);
    }
}
//  if ((j % index == 0) && (j > index)) {
//                 bool[index] = false;
//             }
//             System.out.println(bool[index]);
// while (p < lim) {
//     if (j % index == 0) {
//         bool[j] = false;
//     }
//     System.out.println(bool[j]);
//     if (j + 1 == lim) {
//         while (bool[j] == true) {
//             p = j;
//             index = j;
//             j = index + 1;
//         }
//     }
        // }
