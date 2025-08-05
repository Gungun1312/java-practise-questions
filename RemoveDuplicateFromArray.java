public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        int[] temp = new int[arr.length]; // max possible size
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[uniqueCount++] = arr[i];
            }
        }

        
        int[] arrWithoutDuplicates = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            arrWithoutDuplicates[i] = temp[i];
        }

        
        System.out.print("Array after removing duplicates: ");
        for (int num : arrWithoutDuplicates) {
            System.out.print(num + " ");
        }
    }
}
