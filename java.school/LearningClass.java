public class LearningClass {
    
public static void main(String[] args) {

    Hand myHand = new Hand(true, "front", 15);

    System.out.println(myHand.getDominance());

    myHand.setDominance(false);

    System.out.println(myHand.getDominance());
    
}

}

class Hand{

    private boolean dominance;
    private String side;
    private int size;
    
    Hand(boolean dominance, String side, int size){
        this.dominance = dominance;
        this.side = side;
        this.size = size;
    }

    boolean getDominance(){
        return dominance;
    }

    int getSize(){
        return size;
    }

    String getSide(){
        return side;
    }

    void setSide(String newSide){
        side = newSide;
    }

    void setSize(int newSize){
        size = newSize;
    }

    void setDominance(boolean newDominance){
        dominance = newDominance;
    }

}