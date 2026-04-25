class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
      Map<String , List<String> > ang = new HashMap<>();

      for(String s : strs)
      {
        int add[]= new int [26];
        for(char c : s.toCharArray())
        {
            add[c-'a']++;
        }

        String key = Arrays.toString(add);
        if(!ang.containsKey(key))
        {
            ang.put(key,new ArrayList<>());
        }

        ang.get(key).add(s);
      }
       
        return new ArrayList<>(ang.values());

    }
}
