class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortWord = new String(ch);

            if (!map.containsKey(sortWord))
                map.put(sortWord, new ArrayList<>());
            map.get(sortWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}