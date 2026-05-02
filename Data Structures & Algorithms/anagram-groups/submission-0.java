class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map< String , ArrayList<String> > ans = new HashMap<>();

        for (String s : strs){
            char[] slist=s.toCharArray();
            Arrays.sort(slist);
            String sorted=new String(slist);
            if(!ans.containsKey(sorted)){
                ans.put(sorted,new ArrayList<String>());
                ans.get(sorted).add(s);
            }else{
                ans.get(sorted).add(s);
            }


        }
        return new ArrayList<>(ans.values()) ;


    }
}
