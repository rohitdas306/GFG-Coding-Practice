class Solution {
    public static int largest(int[] arr) {
        if(arr.length==0){
            return arr[0];
        }
        // code here
        int max=Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
