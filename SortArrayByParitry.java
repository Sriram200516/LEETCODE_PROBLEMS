public class SortArrayByParitry {
    public static void main(String[] args) {
        SortArrayByParitry sap=new SortArrayByParitry();
        int[] nums={3,1,2,4};
        int[] sorted=sap.sortArrayByParity(nums);
        System.out.print("Sorted Array by Parity: [");
        for(int i=0;i<sorted.length;i++){
            System.out.print(sorted[i]);
            if(i!=sorted.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public int[] sortArrayByParity(int[] nums) {
        int[] result=new int[nums.length];
        int evenIndex=0;
        int oddIndex=nums.length-1;
        for(int num:nums){
            if(num%2==0){
                result[evenIndex]=num;
                evenIndex++;
            }else{
                result[oddIndex]=num;
                oddIndex--;
            }
        }
        return result;
    }
}
