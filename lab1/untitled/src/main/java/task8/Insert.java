package task8;

import java.util.ArrayList;

public class Insert {
    public static int[] GetIndexes(int[] arr1, int[] arr2){
        ArrayList<Integer> indexes = new ArrayList<>();
        int i=0, j=0, shift=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>=arr2[j]){
                indexes.add(i + shift);
                j++;
                shift++;
            } else if(arr1[i]<arr2[j]){
                i++;
            }
        }
        while(j<arr2.length){
            indexes.add(i + shift);
            shift++;
            j++;
        }
        return indexes.stream().mapToInt(Integer::intValue).toArray();
    }
}
