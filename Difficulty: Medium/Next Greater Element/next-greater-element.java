import java.util.*;
class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        
        /*
        ArrayList<Integer> obj = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++){
            //for(int j=i+1; j<arr.length; j++){
            int j=i+1;
            while(j<arr.length){
                if(arr[j] > arr[i]){
                    obj.add(arr[j]);
                    break;
                }
                else{
                    j++;
                }
                if(j>=arr.length){
                    obj.add(-1);
                }
            }
        }
        obj.add(-1);
        return obj;*/
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int len = arr.length;
        //st.push(arr[len-1]);
        //result.add(-1);
            
        for(int i=len-1;  i>=0; i--){
            // if(st.peek()>arr[i]){
            //     result.add(st.peek());
            //     st.push(arr[i]);
            // }    
            //else{
                while(!st.isEmpty() && arr[i] >= st.peek()){
                    st.pop();
                }
                
                if(st.isEmpty()){
                    result.add(-1);
                } else {
                    result.add(st.peek());
                }
                
                st.push(arr[i]);
            }
        //}
        
        Collections.reverse(result);
        return result;
    }
}