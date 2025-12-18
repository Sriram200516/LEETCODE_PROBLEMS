public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        ProductOfArrayExceptSelf poas=new ProductOfArrayExceptSelf();
        int[] nums={1,2,3,4};
        int[] result=poas.productExceptSelf(nums);
        System.out.print("Product Array: [");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
            if(i!=result.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] output=new int[n];
        
        // Calculate left products
        output[0]=1;
        for(int i=1;i<n;i++){
            output[i]=output[i-1]*nums[i-1];
        }
        
        // Calculate right products and combine
        int rightProduct=1;
        for(int i=n-1;i>=0;i--){
            output[i]=output[i]*rightProduct;
            rightProduct*=nums[i];
        }
        
        return output;
    }
}
