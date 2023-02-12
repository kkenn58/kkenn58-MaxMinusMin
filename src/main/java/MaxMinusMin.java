
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int max = 0;
        int min = 1000;

        for(int i:nums){
            if(max < i){
                max = i;
            }
        }
        for(int x:nums){
            if(min > x){
                min = x;
            }
        }
        int sum = max - min;
        System.out.print(max);
        System.out.println(min);
        return sum;
    }
}
