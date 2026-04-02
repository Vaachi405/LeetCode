class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans= new int[k];
        
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> dq= new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int num:map.keySet()){
            dq.add(num);
            if(dq.size()>k) dq.poll();
        }

        for(int i=0; i<k;i++){
            ans[i]=dq.poll();
        }

        return ans;
    }
}