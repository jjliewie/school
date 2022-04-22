package linkedlists;

import java.util.LinkedList;

public class A {

    public static void main(String[] args) {
        
        LinkedList<String> demo = new LinkedList<>();

        demo.add("hello");
        demo.add("sample");
        demo.add("computer");
        demo.add("science");

        System.out.println(demo.size());

        demo.addFirst("this is unique!");
        demo.addLast("also this!");

        System.out.println("first element: " + demo.getFirst());
        System.out.println("last element: " + demo.getLast());

        // these are also unique!

        demo.removeFirst();
        demo.removeLast();

    }
    
}
