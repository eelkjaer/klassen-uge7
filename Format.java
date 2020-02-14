public class Format {
    public static void main(String[] args) {
      double frac = 1/3.0;
      String name = "Otto Rehagel";//15 tegn
      int myAge = 42;
      char myLetter = 'a';
      long lbase = (long) 1.0E17;
      // brug System.out.printf til at printe flg:
      // 0,33
      // |   Otto Rehagel|
      // |100.000.000.000.000.000|
      // 00042
      // | a|   a|
      // | a|   a|  Otto Rehagel|


      System.out.printf("%.2f"
        + "%n|%s|"
        + "%n|%,d|"
        + "%n%05d"
        + "%n| %c|  %c|"
        + "%n| %c|  %c| %s|",
        frac, name, lbase, myAge, myLetter, myLetter, myLetter, myLetter, name);

    }
}
