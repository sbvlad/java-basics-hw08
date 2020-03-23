import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        String result = "";
        String string = "\\d+\\.+\\d+\\.+\\d+\\.+\\d+";
        Pattern pattern = Pattern.compile(string);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {

            result = matcher.group();
            double first_group = Double.parseDouble(result.substring(0, 3));
            if (255 < first_group) {
                result = "";
            }

        }

        return result;
    }
}