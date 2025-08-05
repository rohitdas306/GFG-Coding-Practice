// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
        // code here
        int sum=arr[0];
        for(int i=1; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
