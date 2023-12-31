public class ValidPalindrome {
    public boolean isPalindrom(String s){
        if (s == null) {
            return true;
        }
        else{
            String sMod = s.replaceAll("^a-zA-Z0-9", "");
            sMod = sMod.toLowerCase();
            char [] charArr = sMod.toCharArray();
            int i = 0;
            while (i <= sMod.length()/2-1){
                if (charArr[i] ==charArr[charArr.length-1-i]){
                    i++;
                }
                else return false;
            }
            return true;
        }
    }
}