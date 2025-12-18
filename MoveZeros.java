public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros mz=new MoveZeros();
        int[] nums={0,1,0,3,12};
        mz.moveZeroes(nums);
        System.out.print("Array after moving zeros: [");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i!=nums.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[lastNonZeroIndex]=nums[i];
                lastNonZeroIndex++;
            }
        }
        for(int i=lastNonZeroIndex;i<nums.length;i++){
            nums[i]=0;
        }
    }
    
}
