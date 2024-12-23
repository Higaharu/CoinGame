import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        // 入力を受け取る
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        // 配列に格納
        int[] array = {x, y, z};

        // 昇順にソート
        Arrays.sort(array);

        // 結果を出力（空白区切りで表示）
        System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
}
