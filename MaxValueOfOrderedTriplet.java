public class MaxValueOfOrderedTriplet {
    public static long maximumTripletValue(int[] nums) {
        long value = Integer.MIN_VALUE;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    long temp = nums[i]-nums[j];
                    temp = temp*nums[k];
                    if(temp > value){
                        value = temp;
                    }
                }
            }
        }

        return value<0 ? 0:value;
    }

    public static void main(String[] args) {
        int[] nums = {6,14,20,19,19,10,3,15,12,13,8,1,2,15,3};
        System.out.println(maximumTripletValue(nums));
    }
}
