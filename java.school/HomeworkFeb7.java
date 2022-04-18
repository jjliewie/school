import java.util.Scanner;

public class HomeworkFeb7 {

    public static int minofthree(int a, int b, int c){
        return Math.min(Math.min(a, b), c);
    }
    
    public static void guesssecret(int secret){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number: ");
        int n = Integer.parseInt(scanner.nextLine());

        if(n!=secret){
            while(true){
                System.out.println("Incorrect. Guess the number again: ");
                n = Integer.parseInt(scanner.nextLine());
                if(n == secret){
                    break;
                }
            }
        }

        System.out.println("Correct! The secret number was "+ Integer.toString(secret));

        scanner.close();
    }

    public static void guessGame(int secret){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the number: ");
        int n = Integer.parseInt(scanner.nextLine());

        if(n!=secret){
            while(true){
                if(n > secret){
                    System.out.print("Incorrect. Your guess is greater than the secret number. Guess the number again: ");
                }
                else if(n < secret){
                    System.out.print("Incorrect. Your guess is lower than the secret number. Guess the number again: ");
                }
                n = Integer.parseInt(scanner.nextLine());
                if(n == secret){
                    break;
                }
            }
        }

        System.out.println("Correct! The secret number was "+ Integer.toString(secret));

        scanner.close();
    }

    public static void color(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if(n>=30){
            System.out.println("not an option");
        }
        else if (n >=20){
            System.out.println("green");
        }
        else if (n >= 10){
            System.out.println("red");
        }
        else if (n >= 0){
            System.out.println("blue");
        }
        else{
            System.out.println("not an option");
        }
    }

    public static void fivenums(){
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int e = Integer.parseInt(scanner.nextLine());

        System.out.println("minimum: ");
        System.out.print(Math.min(a, Math.min(b, Math.min(c, Math.min(d, e)))));
        
        System.out.println("maximum: ");
        System.out.print(Math.max(a, Math.max(b, Math.max(c, Math.max(d, e)))));

        scanner.close();
    }
    public static void main(String[] args) {
        
    }
}
