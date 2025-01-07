import java.util.*;
class school{
    public static void main(String[] arg){
        for ( int i=0;i<=5;i++){
        Scanner scan= new Scanner(System.in);
        int mark= scan.nextInt();
        school obj= new school();
        String result=obj.passorfail(mark);
        System.out.println(result);    
    }
    }
    
    String passorfail(int score){
        if (score>35){
            return("pass");
        }
        else{
            return("fail");
        }
    
    }
}


