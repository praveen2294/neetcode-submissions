class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> list = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);

            String sorteds = new String(charArr);
            list.putIfAbsent(sorteds,new ArrayList());

            list.get(sorteds).add(strs[i]);
        }
        return new ArrayList<>(list.values());
    }
}