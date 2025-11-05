class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complement = x - arr[i];

            // Equivalent to: if (m.find(complement) != m.end()) in C++
            if (m.containsKey(complement)) {
                return true;  // Pair found
            }

            // Insert current element
            m.put(arr[i], i);
        }

        return false; // No pair found
    }
}
