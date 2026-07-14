class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();

        Map<Character,Character> map =new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

    
       
       

        for(Character c :s.toCharArray()){
            if(c =='('||c =='['||c =='{'){
                stack.push(c);
            }
            else{
                if(stack.empty()){
                    return false;
                }
                Character lastOpen=stack.pop();
                if (map.get(c)==lastOpen){
                    continue;
                }
                return false;
            }
        }

        if(!stack.empty()){
            return false;
        }
        return true;
    }
}
