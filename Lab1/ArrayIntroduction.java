import java.util.Scanner;

public class ArrayIntroduction {
    public static void main(String[] args){
        int[][] firstArray = new int[4][3];
        System.out.println("Enter the elements of the array");
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                firstArray[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for(int[] it : firstArray){
            for(int itt : it){
                sum += itt;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
