//TaskFour, 4.a, 4.b, 4.c, 4.d

public class Arrays {

  public static void main(String [] array) {
    int [] arrayOne = {2, 1, 3};
    String [] arrayTwo = {"Hello", "with", "you"};
    boolean [] arrayThree = {true, true, false};
    stringFunction(arrayTwo);
    intFunction(arrayOne);
    intAverage(arrayOne);
  }
  public static void stringFunction(String[] givenString){
    int l = givenString.length;
    for (int i = 0; i < l; i++) {
      String ord = givenString[i];
      System.out.println(ord);
    }
  }
  public static void intFunction(int [] givenInt) {
    int sum = 0;
    for(int i= 0; i < givenInt.length; i++)
      sum+=givenInt[i];
      System.out.println(sum);
  }
  public static void intAverage(int [] averageInt) {
    int sum = 0;
    for(int i = 0; i < averageInt.length; i++)
      sum+=averageInt[i];
      int average = sum/averageInt.length;
      System.out.println(average);
  }
}
