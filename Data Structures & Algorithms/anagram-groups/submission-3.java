class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {

            // 1. String ko character array mein convert karo
            char[] chars = str.toCharArray();

            // 2. Characters ko sort karo
            Arrays.sort(chars);

            // 3. Sorted characters se key banao
            String key = new String(chars);

            // 4. Agar key pehli baar aayi hai,
            //    toh nayi list banao
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // 5. Original word ko uski group mein add karo
            map.get(key).add(str);
        }

        // 6. Sirf saari groups return karo
        return new ArrayList<>(map.values());
    }
}