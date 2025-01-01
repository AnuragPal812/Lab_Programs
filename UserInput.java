import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      System.out.println("String is: " + str);
      int first = sc.nextInt();
      int second = sc.nextInt();
      int sum = first + second;
      System.out.println("Sum is: " + sum);
      sc.close();
    }
}
