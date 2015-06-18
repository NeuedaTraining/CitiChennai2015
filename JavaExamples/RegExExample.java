import java.util.regex.*;

public class RegExExample {
    public static void main(String [] args) {
        
      String s1 = "192.168.100.1";
      String s2 = "192_168_100_1";

      Pattern p = Pattern.compile("^[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}$");
      Matcher m1 = p.matcher(s1);
      Matcher m2 = p.matcher(s2);
      if (m1.find()) {
         System.out.println("Found a match in String s1! " + s1);
      } else {
         System.out.println("s1 doesn't match the regexp! " + s1);
      }

      if (m2.find()) {
         System.out.println("Found a match in String s2!: " + s2);
      } else {
         System.out.println("s2 doesn't match the regexp!: " + s2);
      }
    }
}



