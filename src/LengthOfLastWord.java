public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char [] arr = s.toCharArray();
        char space = ' ';
        int count = 0;
        int index = arr.length -1;
        if (arr.length == 0) {
            return 0;
        }
        else {
            while (arr[index] == space){
                index--;
            }
            while (index >= 0){
                if (arr[index] != space){
                    count++;
                    index--;
                }
                else {
                    return count;
                }
            }
        }
        return count;
    }
}