import java.util.*;


public class Branch{
    
    public void branches(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n1. Nabagram Branch :\n");
        System.out.println("Address : Konnagar Nabagram, Hooghly\n");
        System.out.println("\n2. Baidyabati Branch :\n");
        System.out.println("Address : Notunpara champdani, Baidyabati");
        System.out.println("-----------------------------------------------------");
        System.out.println("\nPress 1 to Check other details?\n");
        System.out.println("Press 2 to exit");
        int choice=sc.nextInt();
        if(choice==1){
            admin ad=new admin();
            ad.adminis();
        }
        else {
            System.exit(1);
        }
        
    }
}