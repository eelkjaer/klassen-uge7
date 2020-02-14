import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

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
    */
    bmi = weight / Math.pow(height/100f, 2);

    // Printer formatteret String
    System.out.printf("Hej %s. Med en kampvægt på %dkg og højde på %dcm, er din BMI: %.2f", name, weight, height, bmi);

    }
}
