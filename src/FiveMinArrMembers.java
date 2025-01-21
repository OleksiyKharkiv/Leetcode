public class FiveMinArrMembers {
    public void fiveMinVal (int[]arr){
        if (arr.length == 0){
            throw new ArrayIsNullExeption();
        }
        int min1 = arr[0];
        int min2 = arr[0];
        int min3 = arr[0];
        int min4 = arr[0];
        int min5 = arr[0];

    }

    private class ArrayIsNullExeption extends Throwable {

    }
}
