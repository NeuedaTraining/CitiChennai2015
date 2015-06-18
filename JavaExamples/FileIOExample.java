import java.io.*;

public class FileIOExample {
     public static void main(String args[]) throws IOException {
          File file = new File ("input.txt");
          FileInputStream in = null;
          BufferedInputStream bis = null;
          DataInputStream dis = null;
         try {
            in = new FileInputStream(file);
            bis=new BufferedInputStream(in);
            dis=new DataInputStream(bis);
            String s;
            while (dis.available() != 0)  {
              s = dis.readLine();
              System.out.println(s);
            }
        } finally {
           if (in != null) {
              in.close();
           }
        }
    }
}
