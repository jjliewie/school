package miniproject;

public class A {

    private int [] temperatures;;

    A(){
        temperatures = new int[7];
    }

    int [] getTemperatures(){
        return temperatures;
    }

    void setTemperatures(int [] given){
        temperatures = given;
    }

    String toString(int x){
        return Integer.toString(x); 
    }

    int cntFreezing(){
        int cnt = 0;
        for(int i = 0; i < temperatures.length; i++){
            if(temperatures[i] < 0){
                cnt += 1;
            }
        }
        return cnt;
    }

    int cntBoiling(){
        int cnt = 0;
        for(int i = 0; i < temperatures.length; i++){
            if(temperatures[i] > 100){
                cnt += 1;
            }
        }
        return cnt;
    }

    int largestChange(){
        int res = 0;
        for(int i = 0; i < temperatures.length -1; i++){
            int diff = abs(temperatures[i] - temperatures[i+1]);
            if(diff > res){res = diff;} 
        }
        return res;
    }

    int abs(int x){
        if(x >= 0){
            return x;
        } return (-x);
    }


    int [] returnDescending(){
        boolean swap = true;
        int temp;
        while(swap){
            swap = false;
            for(int i = 0; i< temperatures.length-1; i++){
                if(temperatures[i] < temperatures[i+1]){
                    temp = temperatures[i];  
                    temperatures[i] = temperatures[i+1];  
                    temperatures[i+1] = temp;  
                    swap = true;
                }
            }
        }
        return temperatures;
    }
    
}
