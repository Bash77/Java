package data_structures;

public class TwoDarrays {
    public static void main(String[] args) {
//        int[] array =  {1,2,3,9};
        int sum = 8;
        int[] array = {1,2,4,4};
        boolean pair = isPair(array, sum);
        System.out.println(pair);

    }
    public static boolean isPair(int[] array, int sum){
         int low = 0;
         int hi = array.length;
        while ( low <= hi){
            if (low  + hi == sum)
                return true;
            low++;
        }

        return false;
    }
}
