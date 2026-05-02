class Solution {
    //hasmap count o(mn)
    public List<List<String>> groupAnagrams(String[] strs) {

        //on aura une string en clée  comme "0023001003"
        Map< String , ArrayList<String> > ans = new HashMap<>();

        for (String s:strs){
            int[] count=new int[26];
            //s to array
            char[] array=s.toCharArray();
            for (char a:array){
                //incrementer la lettre dans le count a-'a'= index dans count
                count[a-'a']++;
            }
            // count deviens clé en string car int[] peut pas etre une clée 
            
            String key = Arrays.toString(count);
            //si existe pas



            /* if else peut etre abrege 
            if (!ans.containsKey(count)){

                ans.put(key,new ArrayList<>());
                ans.get(key).add(s); ce code ce repete donc on peut enlever le else ou utilise putIfAbsent
            }else{
                ans.get(key).add(s);
            }*/
            ans.putIfAbsent(key,new ArrayList<>());
            ans.get(key).add(s);
        
        }
        return new ArrayList<>(ans.values());
    }
}
