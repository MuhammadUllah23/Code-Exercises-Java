package codingProblems.ArrayAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {

    public static void main(String[] args) {
        System.out.println(encode(List.of("", "abc", "")));

        System.out.println(decode("0#3#abc0#"));
    }


    public static String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length());
            encoded.append("#");
            encoded.append(str);
        }

        return encoded.toString();
    }

    public static List<String> decode(String str) {
        List<String> decoded = new ArrayList<String>();

        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));

            int start = j + 1;
            int end = start + len;
            decoded.add(str.substring(start, end));

            i = end;
        }


        return decoded;

    }
    
}
