/*
*  step of projects
 * set password,initial amount/prev balance ,->name
 * initialy ->deposite-add Amount(0),withdraw Take amount(0),
 * show all Transactions
 */

import java.util.*;

public class ATM__Projects {
   public static void main(String[] args) {
    int Pin = 1602;
    int balance = 5000;
    int deposite = 0;
    int withdraw = 0;
    Scanner sc = new Scanner(System.in);
    
    

    System.out.print("Enter Your Password: ");
    int password = sc.nextInt();

    if(password == Pin){
    
            System.out.print("Enter your name: ");
            String name = sc.next();
            System.out.println("\t\t=====  WELCOME " + name);
            while(true){
                System.out.println("\t\t----->  Press 1 to check your Balance: ");
                System.out.println("\t\t----->  Press 2 to Deposite your account: ");
                System.out.println("\t\t----->  Press 3 to withdraw your Balace: ");
                System.out.println("\t\t----->  Press 4 to see your Transaction History: ");
                System.out.println("\t\t----->  Press 5 to QUIT: ");
            

            int opt = sc.nextInt();
            switch(opt)
            {
                case 1:
                        System.out.println("\t\t----->  Your initial  Balance is " + balance);
                        break;
                case 2:
                        System.out.print("\t\t----->  How Much amount you want to add: ");
                        deposite = sc.nextInt();
                        System.out.println("\t\t----->  Successfuly Added "+ deposite);
                        balance = deposite + balance;// 5000=600+5000  -> 5600
                        break;
                        // while(true){
                        //     balance = deposite + balance;
                        //     System.out.println("\t\t----->  Total  amount " + balance);
                        //     break;
                        // }
                       
                case 3:
                        System.out.print("\t\t----->  How much amount you want to witdraw: ");
                        withdraw = sc.nextInt();
                        if(withdraw > balance){
                            System.out.println();
                            System.out.println("I\t\t--->  Insufficient Balance");
                            System.out.println("\t\t--->  Please add your Balance First ");
                            System.out.println();
                        }else{
                            System.out.println("\t\t----->  Successfully Withdraw " + withdraw);
                            balance = balance - withdraw;
                        
                        }
                        break;
                case 4:
                        System.out.println("\t\t---->  ----Welcome to MUA mini Boot----");
                        System.out.println("\t\t----------------><-------------------");
                        System.out.println();
                        System.out.println("\t\t---->  Available Balance "+ balance);
                        System.out.println("\t\t---->  Deposite Amount "+ deposite);
                        System.out.println("\t\t---->  Withdraw Amount "+ withdraw);
                        System.out.println("\t\t---->  Thank You ");
                        System.out.println();
                        break;
                        default:
                            

                            break;
                        }

                if(opt == 5)
                {
                    System.out.println("\t\t----->  --THANK YOU MUA MINI BOOT-- ");
                    break;
                } 
            }
        } 
            else{
    System.out.println("\tWrong Password");
   }
}

}