package level1arraysHashing;

//solution works but time completexity is O(n^2), which sucks for larger arrays.
class ContainsDuplicate217{
    public static void main(String[] args) {
        
        int[] testArray = {1,2,3,1};
        
        System.out.println(containsDuplicate(testArray));
        
        
    }

    //methods need to be static so it doesn't need the class to be created for the methods to be useable, independment methods.
    public static boolean containsDuplicate(int[] nums){

        for(int i = 0; i < nums.length; i++){
            for(int p = i+1; p < nums.length; p++){
                if(nums[i] == nums[p]){
                    return true;
                }
            }
        }

        return false;
    }
}