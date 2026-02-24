public class BannerApp {
    public static void main(String[] args) {
        displayUC4Banner();
    }

    public static void displayUC4Banner() {
        String[] bannerLines = {
            "***********",
            "* *",
            "* WELCOME TO OOPS APP UC4    *",
            "* Modularity via Arrays      *",
            "* *",
            "***********"
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
