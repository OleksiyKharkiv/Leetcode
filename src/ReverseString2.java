public class ReverseString2 {
    public String reverseString (String str){
        char[] res = str.toCharArray();
        int left = 0;
        int right = res.length -1;
        while (left < right){
            char temp = res[left];
            res[left] = res[right];
            res[right] = temp;
        }
        return new String (res);
    }
}
