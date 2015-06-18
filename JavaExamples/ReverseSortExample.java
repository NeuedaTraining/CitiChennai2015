import java.util.Arrays;


public class ReverseSortExample {
    public static void main(String [] args) {


        int myarray [] =  { 5,1,2,6,12,3,4,6,1,2 };

        for (int i = 0;i<myarray.length;i++) {
           myarray[i] = -myarray[i];
        }


        Arrays.sort(myarray);

        for (int i = 0;i<myarray.length;i++) {
           myarray[i] = -myarray[i];
        }

        for (int i = 0;i<myarray.length;i++) {
          System.out.print(myarray[i] + " ");
        }
        System.out.println();
    }
}



