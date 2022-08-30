import java.util.*;


public class Staff{
    public void staff_dets(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nDisplaying Staff details :\n");
        System.out.println("1. Shivam (Chef)\n2. Anurag (Waiter)\n3. Piyal (waiter)\n4. Raina (maid)\n");
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