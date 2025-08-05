public class ptrn2 {
    public static void Reversearrr(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int current = arr[i];
            for(int j =1 ; j<arr.length ; j++){
                if(current < arr[j]){
                    int temp = arr[j];
                    arr[j] = current;
                    current = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; // Example array
        Reversearrr(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
