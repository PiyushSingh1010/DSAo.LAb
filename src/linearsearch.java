public class linearsearch {
     public static int linear(int arr[],int x){
         int n=arr.length;
         for (int i = 0; i <n ; i++) {
             if(arr[i]==x)
                 return i;

         }return -1;
     }

    public static void main(String[] args) {
        int arr[]={30,40,50,60};
        int x=30;
        int result=linear(arr,x);
        if (result==-1)
            System.out.println("nnn");
        else
            System.out.println("pp "+result);
    }
}
