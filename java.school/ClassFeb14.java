public class ClassFeb14 {

    public static double twoDaverage(int[][] a){
        int sum = 0;

        int h = a.length;
        int w = a[0].length;

        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                sum += a[i][j];
            }
        }
        return (double)sum/(h*w);
    }

    public static void main(String[] args) {
        
    }
    
}
