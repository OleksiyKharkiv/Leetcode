public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[nums1.length + nums1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                res[k++] = nums1[i];
            } else {
                res[k++] = nums2[j++];
            }
        }
        while (i < n1) {
            res[k++] = nums1[i];
        }
        while (j < n2) {
            res[k++] = nums2[j++];
        }
        if (res.length % 2 == 0) {
            return (double) (res[res.length / 2] + res[res.length / 2 - 1]) / 2.0;
        } else {
            return res[res.length / 2];
        }
    }
}