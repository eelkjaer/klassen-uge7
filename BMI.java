import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
    /*
    lav en scanner
    bed om højde
    hent til scanner
    bed om vægt
    hent til scanner
    bed om navn
    hent til scanner
    OBS: pas på scanner-buggen
    gem format-linjen i en streng-variabel for sig
    udregn bmi og udskriv vha printf(format,navn,bmi)
    */

    // Init klasser
    Scanner inputScanner = new Scanner(System.in);

    // Vars
    int weight, height;
    double bmi;
    String name;


    // Spørger for user input
    System.out.print("Indtast dit navn: ");
    name = inputScanner.nextLine();

    System.out.print("\nIndtast din højde (cm): ");
    height = inputScanner.nextInt();

    System.out.print("\nIndtast din vægt (kg): ");
    weight = inputScanner.nextInt();

    /* 
    Beregner BMI.
    Formel: Vægt / (Højde^2)
    Ganger med 10000 for at kunne gøre det i cm fremfor meter
    */
    bmi = Math.pow(height, 2);
    bmi = weight / bmi;
    bmi = Math.round(bmi * 10000);

    // Printer formatteret String
    System.out.printf("Hej %s. Med en kampvægt på %dkg og højde på %dcm, er din BMI: %d", name, weight, height, (int)bmi);

    }
}
