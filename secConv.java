import java.util.Scanner;

public class secConv {
    public static void main(String[] args) {
      /*
       * think java øvelse 3.3
       */
      Scanner myScan = new Scanner(System.in);
      System.out.println("Hvor mange sekunder?");
      int secs = myScan.nextInt();
      int h,min,sec;
      //TODO: udregn timer,minutter og sekunder vha division og modulo
      System.out.printf("%d sekunder er %d timer, %d minutter og %d sekunder%n",secs,h,min,sec);
      
    }
}
