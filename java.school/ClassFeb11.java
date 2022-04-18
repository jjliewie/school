public class ClassFeb11 {

    public static String stars(int x){
        String ans = "";
        for(int i = 0; i < x; i++){
            ans += "*";
        }
        return ans;
    }

    public static void starSquare(int a, int b){
        for(int i = 0; i < a; i++){
            System.out.println(stars(b));
        }
    }

    public static int convert(int feet, int inches){
        return (12*feet) + inches;
    }

    public static int[] convertBack(int inches){
        int [] feet_inches = new int[2];
        feet_inches[0] = inches/12;
        feet_inches[1] = inches%12;

        return feet_inches;
    }

    public static int[] futureHeight(int mother_feet, int mother_inch, int father_feet, int father_inch, Boolean gender){
        if(gender){ return convertBack(((convert(mother_feet, mother_inch) * 13/12)+convert(father_feet, father_inch))/2); }
        else{ return convertBack(((convert(mother_feet, mother_inch) * 12/13)+convert(father_feet, father_inch))/2); }
    }

    public static double inflation(int cost, double percent, int year){
        return (double) cost * (Math.pow(1+(percent/100), year));
    }

    public static int interest(double percent, double cost, int months, double payment){
        if(cost == 0){
            return months;
        }

        double monthly_percent = percent/1200;
        double money_left = payment - (monthly_percent*cost);
        double new_cost = cost - money_left;

        return interest(percent, Math.max(new_cost, 0), months+1, payment);
    }

    public static void printPrime(){
        for(int i = 3; i < 100; i+=2){
            Boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if (i%j==0){isPrime = false;}
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }

    public static void printMultiples(int a, int end){
        for(int i = a; i <= end; i+=a){
            System.out.println(i);
        }
    }

    public static void printStars(int a){
        for(int i = 1; i <= a; i++){
            System.out.println(stars(i));
        }
    }

    public static double toFeet(int a){
        return (double) a * (3.28084);
    }

    public static void printToFeet(int x){
        for(int i = 1; i < x+1; i++){
            System.out.println(i + " meter(s) to feet is: " + toFeet(i));
            if(i%4==0){System.out.println();}
        }
    }

    public static void main(String[] args) {

        // printMultiples(3, 36);

        // System.out.println(interest(18, 1000, 0, 50));

        // printPrime();

        // printToFeet(15);

        // futureHeight(5, 6, 6, 1, true); // true if male, false if female

        starSquare(5, 3);

        // System.out.println(inflation(1000, 5.6, 2));
        
    }
}
