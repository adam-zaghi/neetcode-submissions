class Solution {
    public boolean isAnagram(String s, String t) {
        String[] array1=s.split("");
        Arrays.sort(array1);
        String[] array2=t.split("");
        Arrays.sort(array2);
        if (array1.length != array2.length) return false;
        for (int i =0 ; i<array1.length;i++){
            if (!array1[i].equals(array2[i])){
            return false;
            }
        }return true;

    }
}
