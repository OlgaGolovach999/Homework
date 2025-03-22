package Homework8;

public class Text {
    public String twoStrings(String str1, String str2) {
        return str1 + " " + str2;
    }
    public String logikaStrings(String str1, String str2) {
        if (str1.endsWith(str2)) {
            int index = str1.indexOf(str2);
            return str1.substring(0, index).trim();
        } else {
            return str1.toUpperCase();
        }
    }
    public String insertSubstringAfterIndex(String text, int k, String str) {
        String[] newText = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (String Text : newText) {
             if (Text.length() > k) {
                 String beforeIndex = Text.substring(0, k);
                 String afterIndex = Text.substring(k);
                 result.append(beforeIndex).append(str).append(afterIndex).append(" ");
            } else {
               result.append(Text).append(" ");
            }
        }
        return result.toString();
    }
}