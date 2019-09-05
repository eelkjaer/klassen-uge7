public class FormatTwo {
    public static void main(String[] args) {
      double frac = 1/7.0;
      String name = "Kurt Verner";
      int myAge = 22;
      double myWeight = 89.3;
      double myBankBalance = 121231.75;
      char myLetter = 'z';
      System.out.printf("");
      // lav flg println om til printf
      System.out.println("Kære " + name + " du skylder " + myBankBalance); 
      System.out.println("Hej " + name + ". Du er over " + myAge + " og skylder derfor " + myBankBalance); 
      // brug System.out.printf til at printe flg:
      // 0,14
      // |  Kurt Verner|
      // 120,001,231
      // 000022
      // | z|   z|
      // | z|   z|  Kurt Verner| z|

    }
}
