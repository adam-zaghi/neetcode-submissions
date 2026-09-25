class Solution {
    List<String>res=new ArrayList<>();
    String sub="";
    Map<String,Integer>map=new HashMap<>();

    public List<String> generateParenthesis(int n) {
            map.put(")",0);
            map.put("(",0);
            dfs(n);
            return res;
    }
    public void dfs(int n){
        if (sub.length()==n*2){
            res.add(sub);
            return;
        }
        if(map.get("(")<n){

            sub=sub.concat("(");
            map.put("(",map.get("(")+1);
            dfs(n);
            sub=sub.substring(0,sub.length()-1);
            map.put("(",map.get("(")-1);
           

           

        }
         if(map.get("(")>map.get(")")){
                sub=sub.concat(")");
                map.put(")",map.get(")")+1);
                dfs(n);
                sub=sub.substring(0,sub.length()-1);
                  map.put(")",map.get(")")-1);
            }
        
    }
}
