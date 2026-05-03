class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        Map<Integer,Integer> counter=new HashMap<>();

        for (int n:nums){
            counter.put(n,counter.getOrDefault(n,0)+1);
        }

        List<Integer>[] bucket=new ArrayList[nums.length+1];
        
        for (
            Map.Entry<Integer,Integer> paire : counter.entrySet()
        ){
            //on aura tjr une list 
            if (bucket[paire.getValue()]== null){
                bucket[paire.getValue()]= new ArrayList<Integer>();

            }

            bucket[paire.getValue()].add(paire.getKey());
        }

       // recolte des k element en partant de la droite 
       int count = 0;
       //le break sort juste de la premiere boucle
        for (int i=nums.length ; i>=0 && count<k ; i--){
            
            if(bucket[i]!= null){
                for(int n:bucket[i]){
                    //affectation + incre
                    ans[count++]=n;
                    
                    
                    if(count>=k){
                        break;
                    }

                }
            }
        }
         return ans;
    }
   
}
