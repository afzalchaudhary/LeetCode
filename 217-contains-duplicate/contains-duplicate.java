class Solution {
    public boolean containsDuplicate(int[] arr) {
        // int i =0;
        // int j=nums.length;
        Arrays.sort(arr);
        int i=arr[0];
        for(i =1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                return true;
            }
        }
        return false;
    }
}