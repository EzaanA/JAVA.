public interface PermuatationStrings {
    public static void Permutation(String str,String ans){
        if (str.length()==0){
            System.out.println(ans);
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //check notebook to know why this deleting step is being taken
            //eg:-str="abc" now here the first swap will take place on a then b then c
            //so when a is repeated then it becomes aabc while the a is on 2 so we delete the i'th element
            //like curr=abcc;  then  Newstr= ab+c;
            String Newstr=str.substring(0,i)+str.substring(i+1);
            Permutation(Newstr,ans+curr);//backtracking step;
        }
    }
    public static void main(String args[]){
        String str="abc";
       Permutation(str,"");
    }
}

