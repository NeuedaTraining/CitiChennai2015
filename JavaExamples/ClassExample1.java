class Dog {
     private String name;
     private String breed;
     private int age;

     public static int count=0;

     public Dog (String n, String b, int a) {
       name = n;
       breed = b;
       age = a;
       count++;
     }

     public Dog() {
       name="King";
       breed="German Shephard";
       age=3;
       count++;
     }

     public static String description() {
        return ("A dog is a type of a mammal with four legs");
     }

     public String speak() {
        return ("Bark!");
     }
     public String getName() {
       return(name);
     }
     public String getBreed() {
       return(breed);
     }
     public int getAge() {
       return(age);
     }
     public void setName(String n) {
       name = n;
     }
     public void setBreed(String b) {
       breed = b;
     }
     public void setAge(int a) {
       age = a;
     }
}

public class ClassExample1 {

   public static void main(String [] args) {
      Dog d = new Dog("Rex","Poodle",2);
      Dog d1 = new Dog();
      Dog d2 = new Dog();
      System.out.println(d.speak());
      d.setName("Fido");
      d.setAge(10);
      System.out.println("D1's name = " + d1.getName());
      System.out.println("D1's breed = " + d1.getBreed());
      System.out.println("D1's age = " + d1.getAge());
      System.out.println("Count = " + Dog.count);
      System.out.println("Description = " + Dog.description());
   }
}


