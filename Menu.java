import java.util.*;

public class Menu{
    

    // public int menu_choice(){
    //     Scanner sc=new Scanner(System.in);
    //     int choice=sc.nextInt();
    //     return choice;
    // }

    public void show_menu(String a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an item from the menu below :\n1. VEG ROLL - 50\n2. PANEER ROLL - 60\n3. MUSHROOM ROLL - 80");
        int ch=sc.nextInt();
        switch(ch){
            case 1:System.out.println("You have ordered a VEG ROLL.\nPlease pay ₹50 and collect your order at the counter");
            break;
            case 2:System.out.println("You have ordered a PANEER ROLL.\nPlease pay ₹60 and collect your order at the counter");
            break;
            case 3: System.out.println("You have ordered a MUSHROOM ROLL.\nPlease pay ₹50 and collect your order at the counter");
            break;
            default : System.out.println("Wrong Input!!!!!");
            break;
        }
    }

    public void show_menu(String [] a){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an item from the menu below :\n1. EGG ROLL - 50\n2. CHICKEN ROLL - 60\n3. EGG-CHICKEN ROLL - 80");
        int ch1=sc.nextInt();
        switch(ch1){
        case 1:System.out.println("You have ordered a Egg Roll.\nPlease pay ₹40 and collect your order");
        break;
        case 2:System.out.println("You have ordered a Chicken Roll.\nPlease pay ₹70 and collect your order");
        break;
        case 3:System.out.println("You have ordered a Egg-Chicken Roll.\nPlease pay ₹80 and collect your order");
        break;
        default: System.out.println("Wrong Input");
        break;
        }
    }


    public void items(){
        // System.out.println("\n************** Restaurant Menu ****************\n"); 
        // System.out.println("1. Egg roll - ₹50\n2. Biryani - ₹100\n");
        // int ch=menu_choice();
        // switch(ch){
        //     case 1:System.out.println("Please pay ₹50 and collect your order at the counter");
        //     break;
        //     case 2:System.out.println("Please pay ₹100 and collect your order at the counter");
        //     break;
        //     default:items();
        // }
        System.out.println("\nPlease enter your preference : \n");
        System.out.println("Please type VEG for vegtarian or NON-VEG for non vegetarian :");
        Scanner sc=new Scanner(System.in);
        String choice=sc.next();
        if(choice.equals("veg")){
            show_menu(choice);
        }
        else if(choice.equals("non-veg")){
            String [] choices=choice.split("-");
            show_menu(choices);
        }
        else{
            System.out.println("Wrong input!!!! Please try again !!!!!");
            items();
        }


    }
}