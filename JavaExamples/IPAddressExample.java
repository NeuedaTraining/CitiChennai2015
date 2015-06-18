import java.io.*;
import java.util.regex.*;

public class IPAddressExample {
     public static void main(String args[]) throws IOException {
          File file = new File ("ip.dat");
          FileInputStream in = null;
          BufferedInputStream bis = null;
          DataInputStream dis = null;
          final String REGEX = "^([0-9]{1,3}\\.){3}[0-9]{1,3}$";
          Pattern p = Pattern.compile(REGEX);
          Matcher m;


         try {
            in = new FileInputStream(file);
            bis=new BufferedInputStream(in);
            dis=new DataInputStream(bis);
            String s;
            while (dis.available() != 0)  {
                s = dis.readLine();
                m = p.matcher(s);
                if (m.find()) {
                   System.out.println(s);
                }
            }
         } finally {
           if (in != null) {
              in.close();
           }
        }
    }
}
