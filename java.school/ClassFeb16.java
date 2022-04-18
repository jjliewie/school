import java.util.Scanner;

public class ClassFeb16 {

    public static int getMax(int [] a){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < a.length; i++){
            max = Math.max(a[i], max);
        }

        return max;

    }

    public static int getMin(int [] a){
        
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++){
            min = Math.min(a[i], min);
        }

        return min;

    }

    public static void array(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter value for array index" + i + ": ");
            int j = scanner.nextInt();
            array[i] = j;
        }

        scanner.close();

        System.out.println("The maximum value in the array is: " + getMax(array));
        System.out.println("The minimum value in the array is: " + getMin(array));
    }

    public static int howManyOdd(int [] array){
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                cnt++;
            }
        }
        return cnt;
    }

    public static int [] multiplyArray(int [] array, int a){
        int [] second = new int[array.length];

        for(int i = 0; i < array.length; i++){
            if(i == 2 || i == array.length-2){
                second[i] = array[i];
            }
            else{
                second[i] = a*array[i];
            }
        }

        return second;
    }

    public static int [] reverseArray(int a){
        int [] original = new int[a];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < a; i++){
            int j = scanner.nextInt();
            original[i] = j;
        }

        scanner.close();

        for(int i = 0; i < a; i++){
            System.out.println(original[i]);
        }

        int [] reverse = new int[a];

        for(int i = 0; i < a; i++){
            reverse[i] = original[(a-1)-i];
        }

        return reverse;
    }
    
    
    public static void main(String[] args) {
    }
}
