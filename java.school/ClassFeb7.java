import java.util.*;

public class ClassFeb7 {

    public static void tryWhile(int a, String x){
        int i = 0;

        while(i < a){
            System.out.println(i+1);
            i++;
        }

        int j = 0;
        while(j < x.length()){
            System.out.println(x.charAt(j));
            j++;
        }

    }

    public static void printEvenOdd(){
        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()){
            String wrongInput = scanner.nextLine();
            System.out.println("please enter an integer " + wrongInput + " is not an integer.");
        }

        int n = scanner.nextInt();

        String oddoreven = scanner.nextLine();

        int k = 0;

        if(oddoreven.equals("odd")){
            k = 1;
        }

        int i = 0;
        while(i <= n){
            if(i%2 == k){
                System.out.println(i);
            }
            i++;
        }

        scanner.close();
        
    }

    public static void printGrade(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        while(i < num){
            System.out.print("Enter student grade: ");
            int grade = scanner.nextInt();
            sum += grade;
            min = Math.min(grade, min);
            max = Math.max(grade, max);
            i++;
        }

        System.out.println("The minimum grade in the class is: " + Integer.toString(min));
        System.out.println("The maximum grade in the class is: " + Integer.toString(max));

        double average = (double) sum / num;

        System.out.println("The average grade in this class is: " + Double.toString(average));

        scanner.close();
    }

    public static void guessGame(){
        Random random = new Random();
        int randint = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number: ");
        int guess = scanner.nextInt();

        if(guess!=randint){
            while(true){
                if(guess > randint){
                    System.out.print("Incorrect. Your guess is greater than the secret number. Guess the number again: ");
                }
                else if(guess < randint){
                    System.out.print("Incorrect. Your guess is lower than the secret number. Guess the number again: ");
                }
                guess = Integer.parseInt(scanner.nextLine());
                if(guess == randint){
                    break;
                }
            }
        }

        System.out.println("Correct! The secret number was "+ Integer.toString(randint));

        scanner.close();

    }

    public static void main(String[] args) {

        // tryWhile(10, "hello");
        
    }
    
}
