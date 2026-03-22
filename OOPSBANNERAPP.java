import java.util.HashMap;
import java.util.Map;

public class BannerApp {
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
            " ### ",
            "#   #",
            "#   #",
            "#   #",
            " ### "
        });
        patternMap.put('P', new String[]{
            "#### ",
            "#   #",
            "#### ",
            "#    ",
            "#    "
        });
        patternMap.put('S', new String[]{
            " ####",
            "#    ",
            " ### ",
            "    #",
            "#### "
        });
    }

    public static void main(String[] args) {
        String word = args.length > 0 ? args[0] : "OOPS";
        renderBanner(word);
    }

    public static void renderBanner(String word) {
        int height = 5;
        
        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toUpperCase().toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }
            System.out.println(line);
        }
    }
}
