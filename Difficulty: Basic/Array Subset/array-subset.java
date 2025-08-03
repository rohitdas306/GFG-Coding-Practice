
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        Map<Integer, Integer> count=new HashMap<>();
        for(int num:a){
            count.put(num,count.getOrDefault(num, 0) + 1);
        }
        
        for(int num:b){
            if (!count.containsKey(num) || count.get(num) == 0) {
                return false; // Not enough of num in a[]
            }
            count.put(num, count.get(num) - 1); // Use one occurrence
        }

        return true;
    }
}
