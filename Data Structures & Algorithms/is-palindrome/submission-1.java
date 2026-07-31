class Solution {
    public boolean isPalindrome(String s) { 
        int left=0; 
        int right=s.length()-1; 
        s=s.toLowerCase(); 
        while(left<right){ 
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++; 
                } 
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                    right-=1; 
                    
                }
            if(s.charAt(left)!=s.charAt(right)){ 
                    return false; 
            } 
            left++;
            right-=1; 
            } 
            return true; } }