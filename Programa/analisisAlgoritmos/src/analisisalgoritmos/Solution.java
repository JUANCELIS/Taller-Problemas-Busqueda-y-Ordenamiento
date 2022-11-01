/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisalgoritmos;

/**
 *
 * @author juand
 */
class Solution {
    
    public int[] sortArray(int[] nums) {
        int temp;
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if(nums[j]>50000){System.out.println("ERROR");break;}
                if(nums[j]<-50000){System.out.println("ERROR");break;}
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }
}
