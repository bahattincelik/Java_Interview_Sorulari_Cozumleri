package day01;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class IQ3 {
    public static void main(String[] args) {
        /* Ebay Interview Question Put all zeros to end in an integer array
         *  {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
         *  {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
         */
        // Bir method olusturarak tekrar etmeyen elemanlari yazdiran programi yazin

        Integer arr[] ={2,3,3,5,8,99,2,1,14};
        List<Integer> nums = new ArrayList<>();

        //1. way
        Collections.addAll(nums,arr);
        //System.out.println(nums);

        //2. way
        nums= Arrays.stream(arr).collect(Collectors.toList());
        System.out.println(nums);

        //Cozum
        HashSet<Integer> hs = new HashSet<>(nums);
        System.out.println(hs.toString());


    }
}
