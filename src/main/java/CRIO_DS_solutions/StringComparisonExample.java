package CRIO_DS_solutions;

public class StringComparisonExample {

    public static void main(String[] args) {
        String string1 = "APple";
        String string2 = "Apple";

        String result = compareStringsIgnoreCase(string1, string2);

        System.out.println("The string that comes first alphabetically: " + result);
    }

    public static String compareStringsIgnoreCase(String str1, String str2) {
        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();

        if (lowerStr1.compareTo(lowerStr2) < 0) {
            return str1;
        } else {
            return str2;
        }
    }
}

