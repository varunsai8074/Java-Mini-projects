//A simple Bank Management System Console Based
import java.util.*;
class Admin
{
    private String accno;
    private String name;
    private long balance;
    private long amount;
    private long wd;
    Scanner sc = new Scanner(System.in);
    //Method to open an Account
    void openAccount()
    {
        System.out.println("Enter Account Number:");
        accno = sc.nextLine();
        System.out.println("Enter Your Name:");
        name = sc.nextLine();
        System.out.println("Enter Amount:");
        balance = sc.nextLong();
    }
    //Method to Display Account account Details
void Details()
    {
        System.out.println("Account Number:"+accno);
        System.out.println("Your Name:"+name);
        System.out.println("Balance Amount:"+balance);
    }
    //Method to Deposit Amount
    void Deposit()
    {
        System.out.println("Enter the Amount to be Deposited");
        amount = sc.nextLong();
        balance = balance + amount;
    }
    //Method to withdraw money
    void Withdraw()
    {
        System.out.println("Enter the withdrawal Amount:");
        wd = sc.nextLong();
        if(wd <= balance )
        {
            balance = balance - wd;
        }
        else
        {
            System.out.println("INSUFFICIENT BALANACE!");
            System.out.println("DO YOU THINK YOU ARE A BILLIONARE");
        }
    }
    //Method to search Account Number
    boolean search(String acn)
    {
        if(accno.equals(acn))
        {
            Details();
            return true;
        }
        return (false);
    }
    
}

public class Bank
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Create Initial Account
        System.out .println("Enter the Customers Limit:");
        int n = sc.nextInt();
        Admin A[] = new Admin[n];
        
        for(int i=0; i<A.length; i++)
        {
            A[i] = new Admin();//5 Objects are Created A[0],A[1],A[2],A[3],A[4]
            A[i].openAccount();
        }
        
        //run b the loop unti 5 is not pressed
        int ch;
        do
        {
           System.out.println("Main Menu\n1.Display ALL \n2.Search\n3.Deposit\n4.Withdraw\n5.CHI PORA");
           System.out.println("Enter your Choice: ");
            ch = sc.nextInt();
           
           switch(ch)
           {
                case 1:
                   for(int i = 0; i< A.length;i++)
                   {
                       A[i].Details();
                       break;
                   }
                case 2:
                    System.out.println("Enter Account Number to Search: ");
                    String acn = sc.nextLine();
                    boolean found = false;
                    for (int i=0;i<A.length; i++)
                    {
                        found = A[i].search(acn);
                        if(found)
                        {
                            break;
                        }
                        if(!found)
                        {
                            System.out.println("Account doesn't Exists.....!");
                        }
                    }
                    
                    break;
                case 3:
                    System.out.println("Enter Account Number: ");
                    acn = sc.next();
                    found = false;
                    for (int i = 0; i<A.length; i++)
                    {
                        found  = A[i].search(acn);
                        if(found)
                        {
                            A[i].Deposit();
                            break;
                        }
                        if(!found)
                        {
                            System.out.println("Account doesn't Exists.....!"); 
                        }
                    }
                    
                    break;
                case 4:
                    System.out.println("Enter Account Number: ");
                    acn = sc.nextLine();
                    found = false;
                    for (int i = 0; i<A.length; i++)
                    {
                        found  = A[i].search(acn);
                        if(found)
                        {
                            A[i].Withdraw();
                            break;
                        }
                    }
                    if(!found)
                    {
                      System.out.println("Account doesn't Exists.....!"); 
                    }
                    break;
                case 5:
                    System.out.println("CHI PORA");
                    break;
           }
            
        } while(ch < 5);      
    }
}
