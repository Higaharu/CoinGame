import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        int[] array = {x, y, z};

        Arrays.sort(array);

        for (int num : array) {
          System.out.print(num + " ");
      }
    }
}