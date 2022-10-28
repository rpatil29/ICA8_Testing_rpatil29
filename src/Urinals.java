package ICA8_Testing_rpatil29.src;

/**
 * SER-515 ICA8 Urinals class
 *
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-27-2022
 */
public class Urinals {

    public static int goodString(String str) {
        if (str.contains("11")) return -1;
        if (str.equals("0")) return 1;
        if (str.equals("1")) return 0;

        char[] uri = str.toCharArray();
        int count = 0;
        for (int i = 0; i < uri.length - 1; i++) {
            if (i == 0) {
                if (uri[i] == '0' && uri[i + 1] == '0') {
                    uri[i] = '1';
                    count++;
                }
            }
            if (i > 0) {
                if (uri[i] == '0' && uri[i - 1] == '0' && uri[i + 1] == '0') {
                    uri[i] = '1';
                    count++;
                }
            }
        }
        if (uri[uri.length - 1] == '0' && uri[uri.length - 2] == '0') {
            count++;
        }
        return count;
    }
}
