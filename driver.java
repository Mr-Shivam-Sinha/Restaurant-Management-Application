import java.util.*;


public class driver{

    public int input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Login\n"+"2. Register\n");
        int ch1=sc.nextInt();
        return ch1;
    }

    public void login_page(){
        Login l=new Login();
        Scanner sc=new Scanner(System.in);
        System.out.println("Login as :\n");
        System.out.println("1. Customer\n"+"2. Admin\n");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            l.customer();
            break;
            case 2:
            l.admin();
            break;
            default:System.out.println("\nEnter correct choice");
        }

    }
    public void login_reg(){
        Scanner sc=new Scanner(System.in);
        Login l=new Login();
        System.out.println("\n");
        System.out.println("*************** Welcome to Rolled Out ***************\n");
        System.out.println("-----------------------------------------------------");
        System.out.println("\nPlease Register if you are a new customer..\n"+"\nOr login to continue\n");
        
        int ch=input();
        if (ch==1){

            login_page();         
        }
        else if(ch==2){
            
            l.register();
        }
        else{
            System.out.println("   !!! Wrong input !!!\n!!! Please try again !!!\n");
            input();
        }
        System.out.println("-----------------------------------------------------");
        l.customer();  
                     
    }
    
    

    public void create_order(){
        Order o=new Order();
        o.create();
    }
}