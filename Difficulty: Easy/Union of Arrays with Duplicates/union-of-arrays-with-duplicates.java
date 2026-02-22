import java.util.*;
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        /*Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> obj = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            if(obj.contains(a[i])){
                continue;
            }
            else{
                obj.add(a[i]);
            }
        }
        for(int i=0; i<b.length; i++){
            if(obj.contains(b[i])){
                continue;
            }
            else{
                obj.add(b[i]);
            }
        }
        return obj;
        */
       
        // code here
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        ArrayList<Integer> ans=new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    
    }
}