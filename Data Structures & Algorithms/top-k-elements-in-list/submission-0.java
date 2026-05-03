class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //top k element avec min hip (prio queu)
        int[] ans=new int[k];

        //1 hashmap pour compter les ocurence
        Map<Integer,Integer> counter = new HashMap<>();
        for (int n:nums){
            //incrementer ou creer et incrementer par 1 si y'a pas key=n 0=default value 
            counter.put(n,counter.getOrDefault(n,0)+1);
           
        }
        //min heap /prioqueu
        //on a tableau de int [] on doit precise avec quoi on va comparer 
        PriorityQueue<int[]> minheap =new PriorityQueue<>(
            (a,b)->a[0]-b[0]
        ); 
        //entry = une paire clee valeur 
        for (
            Map.Entry<Integer,Integer> paire : counter.entrySet()
        ){
            minheap.add(new int[]{paire.getValue(),paire.getKey()});
            //a chaque fois que la size est depassé on enleve le plus petit
            //resultat les k element seront les plus grand
            if (minheap.size()>k){
                minheap.poll();
            }
          //  pas de add dans int[](qui est ans)
            

        }
        for(int i=0;i<k;i++){
                ans[i]=minheap.poll()[1];
            }
            return ans;



    }
}
