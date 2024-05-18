import java.util.HashMap;
import java.util.Set;

public class SongJava {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Title1", "Lyrics 1");
        trackList.put("Title2", "Lyrics 2");
        trackList.put("Title3", "Lyrics 3");
        trackList.put("Title4", "Lyrics 4");

        System.out.println(trackList);

        System.out.println(trackList.get("Title1"));

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.printf(" %s : %s %n", key, trackList.get(key));
        }
    }
}