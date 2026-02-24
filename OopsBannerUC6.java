public class OopsBannerUC6 {

    public static void main(String[] args) {
        // UC6 Goal: Use methods during array declaration for modularity
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            // We build each line by calling specific character methods
            banner[i] = String.join("  ", getO(i), getO(i), getP(i), getS(i));
        }

        // Render the final banner using an enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Modular Helper Methods for each character pattern
    public static String getO(int row) {
        String[] pattern = {
            " *** ", "* *", "* *", "* *", "* *", "* *", " *** "
        };
        return pattern[row];
    }

    public static String getP(int row) {
        String[] pattern = {
            "**** ", "* *", "**** ", "* ", "* ", "* ", "* "
        };
        return pattern[row];
    }

    public static String getS(int row) {
        String[] pattern = {
            " ****", "* ", " *** ", "    *", "    *", "* *", "**** "
        };
        return pattern[row];
    }
}
