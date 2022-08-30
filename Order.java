import java.util.*;


public class Order{
    /*public Order(){
        System.out.println("Restaurant Orders");
    }*/
    public int order_choice(){

        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;

    }
    public void create(){

        System.out.println("1. Create a new Order\n2. Track Order\n");
        int ch=order_choice();
        if (ch==1){
            //System.out.println("\nPlease enter preference :\n");
            Menu m=new Menu();
            m.items();
            
        }
        else if (ch==2){
            System.out.println("\nPlease create a new order");
            create();
        }
        else{
            System.out.println("\nWrong input");
            create();
        }
        
    }
}