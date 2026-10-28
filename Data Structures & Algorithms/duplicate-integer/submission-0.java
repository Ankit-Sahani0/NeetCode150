class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            // If the number is already in the map, a duplicate exists
            if (map.containsKey(num)) {
                return true;
            }
            // Otherwise, add the number to the map
            map.put(num, 1);
        }
        
        return false;
    }
}