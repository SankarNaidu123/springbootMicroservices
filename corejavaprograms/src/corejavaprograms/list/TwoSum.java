package corejavaprograms.list;

import java.util.Arrays;

class TwoSum {
	  public static void main(String[] args) {
	   // System.out.println("Hello World!");
	   int[] nums={2,7,11,15};
	   int total=13;
	   //ouput:[0,1]
	   //TwoSum twoSum=new TwoSum();
	   System.out.println(Arrays.toString(twoSum(nums, total)));
	  }
	  public static int[] twoSum(int[] nums,int target){
	       for(int i=0;i<nums.length;i++){
	    for(int j=i+1;j<nums.length;j++){
	      if(nums[i]+nums[j]==target){
	       return new int[]{i,j};
	      }
	    }
	   }
	   return null;
	  }
 }