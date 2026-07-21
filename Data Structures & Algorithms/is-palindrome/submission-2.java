class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        String lw = s.toLowerCase();    
        for(int i =0; i< lw.length(); i++){
            if(Character.isLetter(lw.charAt(i)) || Character.isDigit(lw.charAt(i))){
                sb.append(lw.charAt(i));
            }
        }

        String ss = sb.toString();
        System.out.println(ss);
        for(int i = 0, j = ss.length()-1; i< ss.length()/2 ; i++, j--){
                if(ss.charAt(i) != ss.charAt(j)){
                    return false;
                }
        }
        return true;
    }
}
