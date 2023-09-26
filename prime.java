public class prime {
        public static  boolean check(int n){
            if(n==2){
                return  true;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return  false;
                }
            }
            return  true;
        }
        public static  void print_prime(int n){
            for(int i=2;i<n;i++) {
                if (check(i)) {
                    System.out.println(i);
                }
            }
        }
    public static void main(String[] args) {
        int n=20;
        print_prime(n);
    }
}
