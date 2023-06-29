public class subsetWithAscii {
    public static void helper(String unPro,String Pro){

        if(unPro==""){
            System.out.println(Pro);
            return;
        }

        helper(unPro.substring(1),Pro+unPro.charAt(0));
        helper(unPro.substring(1),Pro + (unPro.charAt(0)+0));
        helper(unPro.substring(1),Pro);
    }
    public static void main(String[] args){
        String unPro = "abc";
        String Pro = "";
        helper(unPro,Pro);
    } 
}


