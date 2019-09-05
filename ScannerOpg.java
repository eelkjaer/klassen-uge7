import java.util.Scanner;

public class ScannerOpg {
    public static void main(String[] args) {
      /*
       * lav scanner objekt
       * prompt bruger for alder
       * læs tallet med scanner
       * prompt bruger for postnummer
       * læs tallet med scanner
       * prompt bruger for fulde navn
       * læs navn med scanner
       * prompt bruger for interesser
       * læs interesser med scanner
       * prompt bruger for om han/hun bor i byen
       * læs bystatus med scanner
       * udskriv "Det er false at <navn> bor i byen"
       *
       */
      Scanner myScan = new Scanner(System.in);
      System.out.println("Hvor gammel?");
      int age = myScan.nextInt();
      System.out.println("Hvad hedder du ?");
      myScan.nextLine();
      String name = myScan.nextLine();
      System.out.println("Postnr ?");
      int postal = myScan.nextInt();
      System.out.println("Hvad er din hovedinteresse?");
      myScan.nextLine();
      String interesse = myScan.nextLine();
      System.out.println("Bor du i byen?");
      boolean liveCity = myScan.nextBoolean();

      System.out.printf("Det er %b at %s bor i byen%n",liveCity,name);
      
      // Definér en konstant som er generationsårene
      // udregn generationen
      // brug modulo til at regne ud noget om
      // hvor mange år der er til at man
      // skifter til næste generation

      final int generationPeriode = 30;
      int generation = age/generationPeriode;
      int rest = age%generationPeriode;
      System.out.printf("Du tilhører %d generation og har %d år inden skift%n",generation,(generationPeriode - rest));
      // Prompt brugeren for hvor mange minutter siden sidst (over 100) 
      // udregn timer og minutter
      
    }
}
