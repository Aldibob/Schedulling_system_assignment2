import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Comic_con comic_con = new Comic_con("Comic-con", "2025-07-13", "Astana Tourism and festival team" , "Astana , Astana arena");
        comic_con.showLocation();
        comic_con.showDate();
        comic_con.displayInfoComic_con();
        comic_con.showTitle();
    }
}