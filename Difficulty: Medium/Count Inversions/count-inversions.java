// class Solution {
//     static int inversionCount(int arr[]) {
//         // Code Here
//         /* // Below is brute force approach:
//         int count=0;
//         int low=0;
//         int len=arr.length;
//         int high=low+1;
//         while(high<len && low<len){
//             if(arr[low]>arr[high]){
//                 count++;
//             }
//             high++;
//             if(high>=arr.length){
//                 low++;
//                 high=low+1;
//             }
//         }
//         return count;
//         */
        
        
        
//     }
// }
class Solution {
    public static long inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }
    static long mergeSort(int[] arr, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = (left + right) / 2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }
    static long merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        long invCount = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (i = left, k = 0; i <= right; i++, k++)
            arr[i] = temp[k];
        return invCount;
    }
}