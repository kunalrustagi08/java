public class ArrayWorking {
    
    public static void main(String[] args) {
    
        //Array declarations
        double[] weekHighs = {1,2,3,4,5,6,7}; //len fixed for arrays, default val is 0.0
        String[] month = new String[2]; //String objects, default val is null

        //Accessing array elements
        System.out.println(weekHighs[1]);
        double highsSum = 0;
        for (double dayHigh : weekHighs) {
            highsSum += dayHigh;
        }
        System.out.println("Sum of weekhighs: " + highsSum);

        //2-D arrays
        int[][] array2d_1 = new int[2][4];
        int[][] array2d_2 = {{1,2,3},
                             {5,6,7}};
    }    
}
