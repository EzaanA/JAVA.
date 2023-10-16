public class Sudoku {

    public static boolean check(int arr[][],int element,int row,int col) {
//        check for row
        for (int i = 0; i < arr.length; i++) {
            if (arr[row][i] == element) {
                return false;
            }
        }
        //checek for column
        for (int j = 0; j < arr.length; j++) {
            if (arr[j][col] == element) {
                return false;
            }
        }
        int Start_row=(row/3)*3;
        int Start_col=(col/3)*3;
        //check for grid
        for (int j = Start_row; j < Start_row+3;j++) {
            for(int k=Start_col;k<Start_col+3;k++){
                if(arr[j][k]==element){
                    return  false;
                }
            }
        }
        return  true;
    }

    public static boolean sudukosolve(int arr[][],int row,int col) {
        if (row == 9 && col==0) {
            return true;
        }
        else if(row==9){
            return  false;
        }

            int nextRow=row,nextCol=col+1;
            if(col+1==9){//sudoku se bahar jaara hai
                nextRow=row+1;//like aese dhundte dhundte upar ki line cover krli so now second line p aane k liye if lagaya tk phonch gaya row then col change
                nextCol=0;//agli row k col=0 se start karna hoga
            }

            if(arr[row][col]!=0){// like jo elemnts pehle se hi diye hue hain agr vo apni jgah p pehle se hi honge to ham dusre elemnt k liye chek krnge
                return sudukosolve(arr,nextRow,nextCol);
            }

                for (int digit = 1; digit <= 9; digit++) {
                    if (check(arr,digit,row,col)) {
                        arr[row][col]=digit;
                        if(sudukosolve(arr,nextRow,nextCol)){//soln exists
                            return true;
                        }
                        //ki yaha par mujhe apna element place nhi karna
                            arr[row][col]=0;
                        }
                    }
                return false;
            }

            public static void display(int arr[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
                }
            }
    public static void main(String[] args) {

        int arr[][]={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        if(sudukosolve(arr,/*row*/0,/*col*/0)){
            System.out.println("SOLN EXISTS");
            display(arr);
        }
        else{
            System.out.println("NOPEE");
        }

    }
}
