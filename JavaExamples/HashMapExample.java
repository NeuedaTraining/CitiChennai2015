import java.util.*;

public class HashMapExample {

  public static void main(String [] args) {

    HashMap<Integer, String>  myhash = new HashMap<Integer, String>();

      String Name; 

      myhash.put(12345,"Braun Brelin");
      myhash.put(12346,"Bill Clinton");
      myhash.put(12347,"Barack Obama");
      myhash.put(12348,"Ronald Reagan");
      myhash.put(12349,"Richard Nixon");
      myhash.put(12344,"John F. Kennedy");


      Name = myhash.get(12345);
      System.out.println("Name = " + Name);
  }
}

