/*public class Insertion {
    void insort(int arr[]){
        int n=arr.length;
        for (int i = 1; i <n ; i++) {
            int temp=arr[i];
            int pos=i-1;
            while (pos>=0 && temp<arr[pos] ){
                arr[pos+1]=arr[pos];
                pos=pos-1;
            }
            arr[pos+1]=temp;
        }
    }
    static void printarray(int arr[]){
        int n=arr.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={21,9,30,4,8,50,7,1};
        Insertion obj=new Insertion();
        obj.insort(arr);
        printarray(arr);
    }
}
*/
class insertion{
    void insort(int arr[]){
        int n=arr.length;
        for (int i = 1; i <n ; i++) {
            int temp=arr[i];
            int pos=i-1;
            while(pos>=0&&temp<arr[pos]){
                arr[pos+1]=arr[pos];
                pos=pos-1;
            }
            arr[pos+1]=temp;
        }
    }
    void printarry(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,7,4,2,8,10,1};
        insertion obj=new insertion();
        obj.insort(arr);
        obj.printarry(arr);
    }
}
