// 2.b, 2.c, 2.d

public class Sum {

public static void main(String[] args) {
  int a= 10;
  int b= 10;
  sum(a,b);
  String c = ("Hello world");
  upperCase(c);
  System.out.println(hej(c));
}

public static void sum(int first, int last) {
  System.out.println (first+last);
}

public static void upperCase(String upperString) {
  System.out.println(upperString.toUpperCase());
}

public static boolean hej(String hejj) {
  char first = hejj.charAt(0);
  if(Character.isUpperCase(first)) {
  return true;
  }
  else {
    return false;
  }
}
}
