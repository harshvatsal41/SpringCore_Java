package org.spring.SterioType;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;


public class DistinctAverages {
    public static int disAvg(ArrayList<Integer> nums) {
        Set<Double> distinctAvgs = new HashSet<>();

        while (nums.size() > 1) {
            int minNum = Collections.min(nums);
            int maxNum = Collections.max(nums);

            nums.remove(Integer.valueOf(minNum));
            nums.remove(Integer.valueOf(maxNum));

            double avg = (minNum + maxNum) / 2.0;
            distinctAvgs.add(avg);

            nums.add((int) avg);
        }

        return distinctAvgs.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        Collections.addAll(nums1, 4, 1, 4, 0, 3, 5);
        int output1 = disAvg(nums1);
        System.out.println(output1);

        ArrayList<Integer> nums2 = new ArrayList<>();
        Collections.addAll(nums2, 1, 100);
        int output2 = disAvg(nums2);
        System.out.println(output2);
    }
}
