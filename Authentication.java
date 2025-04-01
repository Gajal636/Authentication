import java.util.Scanner;
class Authentication {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the username :");
        String username=sc.nextLine();
        System.out.println("enter the password :");
        String password=sc.nextLine();
       if(username.equals("user1") && password.equals("abcd")){
        System.out.println("Authentication Successful");
       }
       else if(username.equals("user2") && password.equals("120")){
        System.out.println("Authentication Successful");
       }
    
       else{
        System.out.println("Authentication Failed");
       }
    }
}