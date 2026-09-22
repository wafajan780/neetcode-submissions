class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Map ko List mein convert karo
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Step 3: Frequency ke according sort karo
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Step 4: Top k elements lo
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }

    }

