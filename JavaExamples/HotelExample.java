

class Hotel {

   String name;
   Rooms []  roomArray  ;
   StaffEmployee [] staffArray;
   String address;
   String phoneNumberi;
   final int NUMSINGLES = 10;
   final int NUMDOUBLES = 5;
   final int NUMSUITES = 2;
   final int NUMROOMS = 17;


   public Hotel() {

      roomArray = new Rooms(NUMROOMS);
      allocate_single_rooms(NUMSINGLES);
      allocate_double_rooms(NUMDOUBLES)
      allocate_suites(NUMSUITES);
    }

   private void allocate_single_rooms() {
       int i = 10;

       for (i=0;i<10;i++) {
           roomArray[i] = new Room(i+1,SINGLE,TRUE);
       }

enum RoomType {SINGLE,DOUBLE,SUITE};

class Room {
  int roomNumber
  RoomType rtype;
  boolean availability;

  public Room(int n, RoomType r, boolean a) {
      roomNumber = n;
      rtype = r;
      availability = a;
}

class StaffEmployee {
  String firstName;
  String lastName;
  int age;
  String position;
}




