class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Character> mpp1 = new HashMap<>();
        HashMap<Character, Character> mpp2 = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            char c1 = s1.charAt(i);   // s1 = aab
            char c2 = s2.charAt(i);   // s2 = xxy
            if(mpp1.containsKey(c1)){
                if(mpp1.get(c1) != c2){
                    return false;
                }
            }
            else{
                if(mpp2.containsKey(c2)){
                    return false;
                }
                mpp1.put(c1,c2);
                mpp2.put(c2,c1);
            }
            
        }
        return true;
        
    }
}