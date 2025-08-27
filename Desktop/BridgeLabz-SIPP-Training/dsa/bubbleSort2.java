public class bubbleSort2 {
    public static void ArrayDisplay(int arr[]){ 
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) { 
        int arr[]={8,5,9,7,6};
        for (int i=0;i<=arr.length-1;i++){   //outer loop runs n-1 times 
            for(int j=0;j<arr.length-i-1;j++){   // inner lopp runs n-1times at first then n-2 times then n-3 times ....and so on 
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
       ArrayDisplay(arr);
    }
}
