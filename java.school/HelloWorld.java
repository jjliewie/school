public class HelloWorld {

    public static void print(String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        print("Hello World");    
    }
}

class TryNow {
    public static void main(String[] args) {
        HelloWorld.print("hi! im using classes");
    }

}