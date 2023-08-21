    public class Substring {
        public static void SubString(String str,String ans,int i){
            //base case
            if(i==str.length()){
                if(ans.length()==0){
                    System.out.println("null");
                }
                else{
                    System.out.println(ans);
                }
                return;
            }
            //Yes choice
            SubString(str,ans+str.charAt(i),i+1);
            //NO choice
            SubString(str,ans,i+1);
        }
        public static void main(String[] args) {
            SubString("abc","",0);
        }
    }
