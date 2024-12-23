import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int hour = x/3600;
        int min = (x%3600)/60;
        int second =(x%3600)%60;
        System.out.println(hour+":"+min+":"+second);
    }
}