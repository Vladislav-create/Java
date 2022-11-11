public class task2 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            m--;
            n--;
            int writeInd = nums1.length -1;
            while (n >= 0) {
                if (m >= 0) {
                    if (nums1[m] > nums2[n]) {
                        nums1[writeInd] = nums1[m];
                        m--;
                    } else {
                        nums1[writeInd] = nums2[n];
                        n--;
                    }
                    writeInd--;
                } else {
                    nums1[writeInd--] = nums2[n];
                    n--;
                }
            }
        }
    }
}
