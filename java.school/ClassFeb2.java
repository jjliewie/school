import java.util.Scanner;

public class ClassFeb2 {

    public static int abs(int a){
        if(a>=0){return a;}
        else{ return -a;} 
    }

    public static String makeString(char[] a){
        String res = "";
        for(int i = 0; i < a.length; i++){
            if(a[i] == '*'){
                res += "*";
            }
            else{
                res += " ";
            }
        }
        return res;
    }

    public static void asterisks(int a){
        for(int i = 0; i < a; i++){
            char[] arr = new char[a];
            arr[abs(a-1 - i)] = '*';
            arr[i] = '*';
            System.out.println(makeString(arr));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        asterisks(n);
        scanner.close();
    }
}
