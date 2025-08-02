public class CountAndSay {
    public String countAndSay(int n){
        if (n ==1) return "1";
        String prev = countAndSay(n-1);
        StringBuilder res = new StringBuilder();
        int count = 0;
        char currChar = prev.charAt(0);
        for (int i = 0; i < prev.length(); i++){
            if (prev.charAt(i) == currChar){
                count++;
            } else {
                res.append(count).append(currChar);
                currChar = prev.charAt(i);
                count = 1;
            }
        }
        res. append(count).append(currChar);
        return res.toString();
    }
}
