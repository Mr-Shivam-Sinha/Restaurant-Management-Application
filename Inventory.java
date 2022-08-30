import java.util.*;


public class Inventory{
    public void invent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nDisplaying Inventory items :\n");
        System.out.println("1. Flour(30kg)\n2. oil(20lts)\n3. Vegetables(30kgs)");
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