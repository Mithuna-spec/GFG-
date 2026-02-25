// class Solution {
//     public int longestSubarray(int[] arr, int k) {
//         // Code Here
        
//         int i=0;
//         int maxlen=0;
//         ArrayList<Integer> obj = new ArrayList<>();
//         while(i<arr.length){
//             if(arr[i]>=k){
//                 obj.add(arr[i]);
//             }
//             if(arr[i]<k){
//                 obj = new ArrayList<>();
//             }
//             maxlen = Math.max(obj.size(), maxlen);
//             i++;
//         }
//         return maxlen;
//     }
// }

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Code Here
        HashMap<Integer, Integer> obj = new HashMap<>();
        int maxlen=0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>k){
                sum +=1;
            }
            else{
                sum -=1;
            }
            if(sum>0){
                maxlen = Math.max(maxlen, i+1);
            }
            if(!obj.containsKey(sum)){
                obj.put(sum, i);
            }
            if(obj.containsKey(sum-1)){
                maxlen = Math.max(maxlen, i - obj.get(sum - 1));
            }
        }
        return maxlen;
    }
}