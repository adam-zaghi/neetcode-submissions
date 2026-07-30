class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        Stack<Integer>monostack=new Stack<>();
        //remplie l'array avec 0 par defaut

        Arrays.fill(res,0);
        for (int i=0;i<temperatures.length;i++){
            //tant que la stack est remplie et que le dernier element est plus petit que le actuelle
            while(!monostack.empty() && temperatures[i]>temperatures [monostack.peek()]){
                int indiceDuStack=monostack.pop();
                //
                res[indiceDuStack]=i-indiceDuStack;

            }
            monostack.push(i);
        }


        return res;
    }
}
