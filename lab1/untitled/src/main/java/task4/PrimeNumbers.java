package task4;

import java.math.BigInteger;
import java.util.ArrayList;

public class PrimeNumbers {

    public static ArrayList<Integer> indexesOfPrimes(int[] arr){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] <= 1) continue;
            BigInteger bigInteger = BigInteger.valueOf(arr[i]);
            boolean isPrime = bigInteger.isProbablePrime((int) Math.log(arr[i]));
            if(isPrime){
                indexes.add(i);
            }
        }
        System.out.println(indexes);
        return indexes;
    }
    private boolean isPrimeNuber( int number){
        if (number <= 1) return false;
        if (number == 2) return true;

        if (number % 2 == 0) return false;
        for (int i = 2; i <= Math.sqrt(number)+1; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
