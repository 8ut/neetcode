package level1arraysHashing;

//completed 2/5 comfort need to learn the optimized verison.


class twoSum {
    public static void main(String[] args) {

        int[] testArray = {2,7,11,15};
        int target = 9;
        int[] result = two(testArray, target);


        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] two(int[] nums, int target){

        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}