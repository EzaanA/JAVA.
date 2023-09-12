public class numbergame {
    public static void main(String[] args) {
        int arr[]={1,2,3,3};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=(ans*10)+arr[i];
        }
        int arrnew[]=new int[arr.length];
        ans+=1;
        for (int i=arrnew.length-1;i>=0;i--){
            int a=ans%10;
            arrnew[i]=a;
        }
        
    }
}
