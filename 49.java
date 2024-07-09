class Solution {
    public static void addElement(HashMap<String, List<String>> hash, String key, String value){
        if (!hash.containsKey(key)){
            hash.put(key, new ArrayList<>());
        } 

        hash.get(key).add(value);
    }



    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<String, List<String>>() ;

        for (String s : strs) {
            char[] a = s.toCharArray() ;
            Arrays.sort(a) ;
            String key = new String(a) ;
            addElement(hash, key,s) ;
        }

        return new ArrayList<>(hash.values());

    }
}