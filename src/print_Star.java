public class print_Star {

    public static void main(String args[]){
        helper(4,0);
    }

    public static void helper(int row,int col){
        if(row==0){
            return;
        }

        if(col<row){
            
            helper(row,col+1);
            System.out.print("* ");
        }else{            
            helper(row-1,0);
            System.out.println();
        }
        
    }

    
    
}
