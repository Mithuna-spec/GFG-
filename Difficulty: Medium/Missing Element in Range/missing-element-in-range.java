class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // Below code is working but, time limit exceeded..
        /*
        // code here
        ArrayList<Integer> obj = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=low && arr[i]<=high){
                obj.add(arr[i]);
            }
        }
        ArrayList<Integer> obj2 = new ArrayList<>();
        for(int i=low; i<=high; i++){
            if(obj.contains(i)){
                continue;
            }
            else{
                obj2.add(i);
            }
        }
        return obj2;
        */
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> obj = new HashSet<>();
        for(int ele : arr){
            obj.add(ele);
        }
        for(int i=low; i<=high; i++){
            if(obj.contains(i)){
                continue;
            }
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}