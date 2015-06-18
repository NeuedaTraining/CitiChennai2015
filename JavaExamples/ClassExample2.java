class Animal {
    private String name;
    private int age;

    public Animal (String n, int a) {
         name = n;
         age = a;
    }

    public String speak() {return (null);}
}

class Cat extends Animal {
   private String breed;

   public Cat (String n, String b, int a) {
     super(n,a);
     breed = b;
   }
   public String speak() {
      return ("Meow!");
   }
}


class Dog extends Animal {
     private String breed;


     public Dog (String n, String b, int a) {
       super (n,a);
       breed = b;
     }


     public String speak() {
        return ("Bark!");
     }
}

class Cow extends Animal {
     private String breed;


     public Cow (String n, String b, int a) {
       super (n,a);
       breed = b;
     }


     public String speak() {
        return ("Moo!");
     }
}
public class ClassExample2 {

   public static void main(String [] args) {
      Dog d = new Dog("Rex","Poodle",2);
      Cat c = new Cat ("Tiger","Siamese",3);
      Animal [] animalArray =  {d,c};
      System.out.println(animalArray[0].speak());
      System.out.println(animalArray[1].speak());
   }
}


