import java.util.*;
public class switchcase {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int day=scan.nextInt();
        String name;
        switch(day){
        case 1:
        name="Monday";
        break;
        case 2:
        name="tuesday";
        break;
        case 3:
        name="wednesday";
        break;
        case 4:
        name="thursday";
        break;
        case 5:
        name="friday";
        break;
        case 6:
        name="saturday";
        break;
        case 7:
        name="sunday";
        break;
        default:
        name="Invalid day";
        }
        System.out.println(name);



    }
}
