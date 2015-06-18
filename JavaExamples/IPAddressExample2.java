import java.io.*;
import java.util.regex.*;

public class IPAddressExample2 {
     public static void main(String args[]) throws IOException {
          File file = new File ("ip.dat");
          FileReader fr = new FileReader(file);
          BufferedReader reader = new BufferedReader(fr);
          final String REGEX = "^([0-9]{1,3}\\.){3}[0-9]{1,3}$";
          Pattern p = Pattern.compile(REGEX);
          Matcher m;
          String line;
          String [] octets;
          int valid=0;
          int invalid=0;
          int total=0;
          boolean validflag=TRUE;


         try {
            while ((line = reader.readLine()) != null)  {
                m = p.matcher(line);
                if (m.find()) {
                     octets = line.split("."); 
                     for (String octet: octets) {
                         if (Integer.parseInt(octet)) > 255) {
                            invalid++;
                            validflag = FALSE;
                            break;
                         }
                     }
                     if validflag == TRUE) {
                         valid++;
                     } else {
                       invalid++;
                        validflag = TRUE;
                     }
                             
                } else {
                  invalid ++;
            }
         } finally {
           if (file != null) {
//              file.close();
           }
        }
        System.out.println("Valid IP addresses: " + valid);
        System.out.println("Invalid IP addresses: " + invalid);
        total=valid+invalid;
        System.out.println("Total IP addresses: " + total);
    }
}
