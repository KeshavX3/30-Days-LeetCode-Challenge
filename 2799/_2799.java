import java.util.*;

public class _2799 {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : nums) {
            uniqueElements.add(num);
        }
        int totalUnique = uniqueElements.size();

        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> currentSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                currentSet.add(nums[j]);
                
                if (currentSet.size() == totalUnique) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        _2799 solution = new _2799();
        
        // Test case 1
        int[] nums1 = {1, 3, 1, 2, 2};
        System.out.println("Test case 1: " + solution.countCompleteSubarrays(nums1)); // Expected: 4
        
        // Test case 2
        int[] nums2 = {5, 5, 5, 5};
        System.out.println("Test case 2: " + solution.countCompleteSubarrays(nums2)); // Expected: 1
        
        // Test case 3
        int[] nums3 = {1, 2, 3, 4};
        System.out.println("Test case 3: " + solution.countCompleteSubarrays(nums3)); // Expected: 1
    }
} 