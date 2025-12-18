public class RotateArray {
    public static void main(String[] args) {
        RotateArray ra=new RotateArray();
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        ra.rotate(nums,k);
        System.out.print("Rotated Array: [");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i!=nums.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
        public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
    private void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    
    }
    
}
