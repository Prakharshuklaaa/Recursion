import java.util.ArrayList;

public class permutation {
    public static void main(String arg[]){
        System.out.println(permutation("abc",""));
    }

    public static ArrayList<String> permutation(String unPro,String pro){
        ArrayList<String> lst = new ArrayList<>();

        if(unPro==""){
            lst.add(pro);
            return lst;
        }

        for(int i=0;i<=pro.length();i++){
            String f = pro.substring(0, i);
            char m = unPro.charAt(0);
            String l = pro.substring(i,pro.length());
            lst.addAll(permutation(unPro.substring(1), f+m+l));
        }
        return lst;


    }
}
