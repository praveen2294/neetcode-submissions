class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        boolean isanagram = true;

        HashMap<Character,Integer> hash  = new HashMap<>();
        for(int i=0;i<s.length();i++){
        hash.put(s.charAt(i),hash.getOrDefault(s.charAt(i),0)+1);
        
        }  
        for(int i=0;i<t.length();i++){
            if(!hash.containsKey(t.charAt(i))){
                isanagram = false;
                break;
            }else{
                hash.put(t.charAt(i),hash.get(t.charAt(i))-1);
                if(hash.get(t.charAt(i))==-1){
                   isanagram = false;
                   break; 
                }
            }
        }
        return isanagram;
    }
}