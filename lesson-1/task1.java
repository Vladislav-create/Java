public class task1 {
    
    public static void main(String[] args) {
        System.out.println("Hi man");
        System.out.println("Привет man");
        int [] nums = new int [] {3,2,2,3};
        int val = 3;
        int copyInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd++;
            }
        }
        
        System.out.println(nums);
    }
    // public int removeElement(int[] nums, int val) {
    //     System.out.println("Привет man");
    //     int copyInd = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != val) {
    //             nums[copyInd] = nums[i];
    //             copyInd++;
    //         }
    //     }
        
    //     return copyInd;
    // }
}