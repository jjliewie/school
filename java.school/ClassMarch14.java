public class ClassMarch14 {

    public static double twoDaverage(int [][] a){

        int sum = 0;

        int h = a.length;
        int w = a[0].length;

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                sum += a[i][j];
            }
        }

        double average = (double)sum/(h*w);

        return average;

    }

    public static void printTable(double [][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(i == j){
                    System.out.println(a[i][j] + "\t");
                }
                else{ System.out.println(a[i][j] + "\t"); }
            }
            System.out.println();
        }
    }

    public static void prirnt_pop_table(double [] population){
        System.out.println("Cities\t\tPopulation in 2015");
        for(int i = 0; i < population.length; i++){
            // hello
        }
    }

    public static void main(String[] args) {

        int [][] a = {{1, 2, 3, 4}, {1, 2, 3, 4}, {2, 3, 4, 5}};

        System.out.println(twoDaverage(a));
        
    }
    
}
