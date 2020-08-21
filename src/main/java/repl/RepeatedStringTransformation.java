package repl;

public class RepeatedStringTransformation {
    static String repeatedTransfor(String s) {
        s = s.toUpperCase();

        if (s.length() < 250000 && s.matches("^[ABCD]+$")) {
            while (s.contains("AB") || s.contains("BA") || s.contains("CD") || s.contains("DC")) {
            }


         /*   while (s.contains("AB") || s.contains("BA") || s.contains("CD") || s.contains("DC")) {
                if (s.contains("AB"))
                    s = s.replace("AB", "");
                if (s.contains("BA"))
                    s = s.replace("BA", "");
                if (s.contains("CD"))
                    s = s.replace("CD", "");
                if (s.contains("DC"))
                    s = s.replace("DC", "");
                System.out.println(s);
            } */

            System.out.print("Non repeated string is " + s);
            return s;
        }
        System.out.print("Invalid");
        return null;
    }


    public static void main(String[] args) {

        repeatedTransfor("AcddcBcabbad");
    }
}
