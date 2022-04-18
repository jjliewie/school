import java.util.*;


public class TestingAgain {


    public static void testing(ArrayList<Integer> choices, int n ){
        choices.add(n);
    }

    public static void main(String[] args) {

        ArrayList<Integer> c = new ArrayList<Integer>();
        
        Scanner scanner = new Scanner(System.in);


        for (int idx = 0; idx < 3; idx++){
            int j = scanner.nextInt();
            testing(c, j);
        }

        System.out.println("arraylist");

        for(int k = 0; k < c.size(); k++){
            System.out.println("index " + (k) + " contains: " + c.get(k));
        }

        scanner.close();
        
    }
    
}
