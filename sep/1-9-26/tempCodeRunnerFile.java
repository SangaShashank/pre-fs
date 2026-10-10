public static int quick_sort(int arr[], int l,int h,int k){
        if(l<=h){
            int partition = quick_sort_partition(arr,l,h);
            int target = arr.length-k;
            if(partition == target){
                return arr[partition];
            }
        else if(partition > target){
           return quick_sort(arr,l,partition-1,k);}
           else{
           return  quick_sort(arr,partition+1,h,k);
        }
    }
    return -1;

    }
    public static int quick_sort_partition(int arr[], int l,int h){
        int i = l; int j = h ;int pivot = arr[l];
        while(i<j){
            while(i<=h && arr[i] <=pivot) i++;
            while(j>= l && arr[j]>pivot) j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp ;
            }
        }
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp ;
        return j;
    }
}