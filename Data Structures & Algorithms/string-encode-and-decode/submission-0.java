class Solution {

    public String encode(List<String> strs) {
        String ans="";
        for (String s:strs){
            ans=ans+String.valueOf(s.length())+"#"+s ;
        }
        return ans;

    }


    public List<String> decode(String str) {
        int count=0;
    
        List<String> ans=new ArrayList<>();
        while(str.length()>1)
        {

             
            int diese=str.indexOf("#");
            //subsrting (indexoffirst ,   index after the last)
            count= Integer.parseInt( str.substring(0,diese ) );
            
            ans.add( str.substring(diese+1,diese+count+1 ));
            str= str.substring(diese+count+1 );
            
        }
        return ans;
    }
}
