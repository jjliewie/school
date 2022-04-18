import java.util.*;

public class HomeworkFeb2 {
    
    public static void multiply(int a, int b){
        System.out.println(a);
        System.out.println(b);
        System.out.println(a*b);
    }

    public static void even_or_odd(int a){
        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static double weight_on_moon(int a){
        return (double) a * 0.17;
    }

    public static double inches_to_centi(int a){
        return (double) 2.54 * a;
    }

    public static double fahrenheit_to_celsius(int a){
        return (double) (a-32)*(5/9);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        multiply(n, k);

        int x = Integer.parseInt(scanner.nextLine());

        even_or_odd(x);

        int y = Integer.parseInt(scanner.nextLine());

        System.out.println(weight_on_moon(y));

        int p = Integer.parseInt(scanner.nextLine());

        System.out.println(inches_to_centi(p));

        int q = Integer.parseInt(scanner.nextLine());

        System.out.println(fahrenheit_to_celsius(q));

        scanner.close();
        
    }
}
