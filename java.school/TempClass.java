import java.util.Scanner;

public class TempClass {

    public static void starSquare(int a, int b){

        for(int i = 0; i < a; i++){

            String ans = "";

            for(int j = 0; j < b; j++){

                ans += "*";
            }

            System.out.println(ans);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        starSquare(a, b);

        scanner.close();
        
    }
}
