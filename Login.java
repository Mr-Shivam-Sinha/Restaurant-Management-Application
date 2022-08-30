import java.util.*;



public class Login{
    Scanner sc=new Scanner(System.in);
    /*public Login(){
        //System.out.println("Staff Login");
        
    }*/

    //Registration

    public String[] register(){
        Scanner sc=new Scanner(System.in);

        System.out.println("\nEnter your Uid :");
        String name=sc.nextLine();
        System.out.println("Enter a Password");
        String password=sc.nextLine();
        System.out.println("\n\tRegistration Successful!!!!\n");
        System.out.println("\nPlease Login to your account to Continue...\n");
        /*Login l=new Login();
        l.customer();*/
        String[] creds= new String[2];
        creds[0]=name;
        creds[1]=password;
        return creds;
    }


    //Customer login

    public void customer(){
        String[] credentials=register();
        /*System.out.println(credentials[0]);
        System.out.println(credentials[1]);*/
        Scanner sc=new Scanner(System.in);
        String c_uid=credentials[0];
        String c_pass=credentials[1];
        
        System.out.println("\nEnter Uid and Password :\n");
        System.out.println("Uid :");
        String uid=sc.nextLine();
        System.out.println("\nPassword :");        
        String pass=sc.nextLine();
        if (uid.equals(c_uid)==false || pass.equals(c_pass)==false){
            System.out.println("\n!!!! Uid or Password Didn't match !!!!\n"+"\t!!! Please try again !!!\n");
            customer();
        }
        else{
            System.out.println("\n\tSuccessfully Logged in.....\n");
            System.out.println("-----------------------------------------------------");
        }
    }

    //Admin login

    public void admin(){

        System.out.println("\nEnter Admni id and Password :\n");
        System.out.println("Admin id :");
        String admn_id="Admin";
        String admn_pass="Password";
        String admin_id=sc.nextLine();
        System.out.println("\nPassword :");        
        String admin_pass=sc.nextLine();
        if (admin_id.equals(admn_id)==false || admin_pass.equals(admn_pass)==false){
            System.out.println("\n!!!! Uid or Password Didn't match !!!!\n"+"\t!!! Please try again !!!\n");
            admin();
        }
        else{
            System.out.println("\n\tSuccessfully Logged in.....\n");
            System.out.println("-----------------------------------------------------");

        }
        admin ad=new admin();
        ad.adminis();


    }
}