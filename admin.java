import java.util.*;


public class admin{
    public void adminis(){
        Branch b=new Branch();
        Inventory i=new Inventory();
        Staff s=new Staff();
        Scanner sc=new Scanner(System.in);
        System.out.print("\nWelcome to the Admin page\n");
        System.out.println("1. Branch Details\n2. Check Inventory\n3. Staff Details");
        int choice=sc.nextInt();
        switch(choice){
            case 1:b.branches();
            break;
            case 2:i.invent();
            break;
            case 3:s.staff_dets();
            break;
            default:adminis();
        }


    }
}