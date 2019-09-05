public class Format {
    public static void main(String[] args) {
      double frac = 1/3.0;
      String name = "Otto Rehagel";
      int myAge = 42;
      double myWeight = 89.3;
      double myBankBalance = 120001231.89;
      char myLetter = 'a';
      System.out.printf("");
      System.out.println("Kære " + name + " du skylder " + myBankBalance); 
      System.out.println("Hej " + name + ". Du er over " + myAge + " og skylder derfor " + myBankBalance); 
      // brug System.out.printf til at printe flg:
      // 0,33
      // |   Otto Rehagel|
      // 120,001,231
      // 000042
      // | a|   a|
      // | a|   a|  Otto Rehagel|
      

    }
}
