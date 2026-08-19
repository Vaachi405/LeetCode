class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
        int[] l = new int[n+1];
        for(int[] e:edges){
            l[e[0]]++;
            l[e[1]]++;
        }

        for(int i=1; i<=n; i++){
            if(l[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}