class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pr=1;
        int po=1;
        int n=nums.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=1;
        }
        for(int i=0;i<n;i++){
            a[i]*=pr;
            pr*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            a[i]*=po;
            po*=nums[i];
        }
        return a;
    }
}
