import java.util.*;
class train
{
    public String psngrname;
    public long adhar;
    public String scr;
    public String dest;
    public String cname;
    public long num;
    public long mobile;
    public String com;
    
    Scanner sc = new Scanner(System.in);
    int tickets = 100;
    // Method to take details of the passenger
    void entry()
    {
        System.out.println("*******************************************************************");
        System.out.println("*         Enter Passenger Name:                                   *");
        psngrname = sc.next();
        System.out.println("*         Enter Aadhaar Number:                                   *");
        adhar = sc.nextLong();
        System.out.println("*         Enter Mobile Number:                                    *");
        mobile = sc.nextInt();
        System.out.println("*******************************************************************");

    }
    // Method to get booking information
    void booking()
    {
        System.out.println("*******************************************************************");
        System.out.println("*         Enter Source:                                           *");
        scr = sc.next();
        System.out.println("*         Enter Destination:                                      *");
        dest = sc.next();
        if(scr.equals("palamaner") || dest.equals("palamaner"))
        {
        System.out.println("*****Palamaner lo Railway Station ledhu BRO😜😜😜*********");
        }
            System.out.println("Enter your Name to book your Ticket");
        cname = sc.next();
        if(cname.equals(psngrname))
        {
            System.out.println("Your ticket is successfully Booked!");
            tickets = tickets - 1; 
        }
         System.out.println("******************************************************************");
        
    }
    void details()
    {
        System.out.println("Passenger Name:"+psngrname);
        System.out.println("Passenger Aadhaar number:"+adhar);
        System.out.println(psngrname+" is Travelling from "+scr+" to "+dest);
        System.out.println("Mobile Number: "+mobile);
    }
    void cancel()
    {
        System.out.println("Enter your Aadhar number of Cancellation 🤦‍♂️🤷‍♀️");
        num = sc.nextLong();
        if(num == adhar)
        {
            System.out.println("Cancellation of tickets Successful!");
            tickets = tickets + 1; 
        }
        
    }
    void tickavailable()
    {
        System.out.println("The Available Tickets are : "+tickets);
        System.out.println("You can book Them 👌😊");
    }
    void complaint()
    {
        System.out.println("*******************************************************************");
        System.out.println("*   Enter your Complaint:                                         *");
        com = sc.next();
        System.out.println("*   Complaint Registered.......!                                  * ");
        System.out.println("*******************************************************************");
    }
}
//Main class
public class TicketManagement extends train
{
    public static void main(String[] args)
    {
        Scanner sca = new Scanner(System.in);
        train t = new train();
        System.out.println("$$$$$$$$$$$$$$ *WELCOME TO ***❤️** INTERNATIONAL RAILWAY STATION* $$$$$$$$$$$$$$");
        System.out.println("\nEnter Number of Passengers");
        int  n = sca.nextInt();
        int ch;
        do
        {
            System.out.println("*************😍************");
            System.out.println("1.Register\n2.Booking\n3.Show Passenger Details\n4.Tickets cancellation\n5.Check Available tickets\n6.Complaints\n7.Exit");
            System.out.println("*************😍************");
            ch = sca.nextInt();
            switch(ch)
            {
                case 1:
                    for(int i =1;i<=n;i++)
                    {
                        t.entry();//calls entry method
                    }
                    break;
                case 2:
                    t.booking();//calls booking method
                    break;
                case 3:
                    t.details();//calls deatils method
                    break;
                case 4:
                    t.cancel();//calls cancel method
                    break;
                case 5:
                    t.tickavailable();//Calls cancel Method
                    break;
                case 6:
                    t.complaint();//Calls complaint method
                    break;
                case 7:
                    System.out.println("You are Done!");
                    break;
            }
        }while(ch!=7);
    }
}
