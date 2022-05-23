/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

 public class Main {
     public static int num;
     public static int sum=0;
     public static int appCount =0;
     public static int Counter=0;
     public static ArrayList <Integer> day= new ArrayList <>();
     
    public static void main(String[] args) {
        String choice;
        
        serQueue line = new serQueue();
         Scanner input = new Scanner(System.in);
        
        System.out.println("--- Welcome to CarWash System ---");
         do{
        System.out.println("To login, please type  \n - Admin \n - Customer \n - Exit " ); // to specify the user type
        choice =input.nextLine().toUpperCase(); // To uppercase to avoid mistakes
        switch (choice){
            case "CUSTOMER":
                Customer();

                break;
                        
            case "ADMIN":
               Admin admin = new Admin(); // Admin class object
               break;
                         
             case "EXIT":
              System.out.println("Exit");
                System.exit(0); // To terminate the system
                break;
                         
//            default:
//            System.out.println(" Invaled choice ");         
        }
         }
         while(!"ADMIN".equals(choice) || !"CUSTOMER".equals(choice) || !"EXIT".equals(choice)); // The condition
         
    }
    
      public static void Customer() {
         ArrayList <Integer> total = new ArrayList<>();
         ArrayList <String> services = new ArrayList<>();
         Customer Cust = new Customer();
         String service;
         String done;
         Scanner input = new Scanner(System.in);
         String name;
         String time;
         System.out.println("Please enter your name: ");
         name=input.nextLine(); 
         Counter++; // for calculate the served number of cars 
        
         
  
        do {
             
            menu();
            System.out.println("Please choose a service number, or type any number to exit: ");
            service=input.nextLine();
            System.out.println("Please enter weekday number between 1-7, Start From Sunday(1)");
            System.out.println("Enter weekday number :");
            num=Integer.parseInt(input.nextLine());
            day.add(num);
            System.out.println("Please enter the time : ");
            time=input.nextLine();
            
            
                switch (service) {
                case "1":
                System.out.println("---- Steam wash ----");
                Cust.EnQueue(name, time, "Steam wash",  "210");
                total.add(210);
                services.add("Steam wash");
                System.out.println("Are you done? ");
                done=input.nextLine();
                if(done.equals("yes")){
                    
                    break;
                }
               break;
                case "2": 
                System.out.println("---- Shine ----");
                Cust.EnQueue(name, time, "Shine",  "300");
                 total.add(300);
                services.add("Shine");
                System.out.println("Are you done? ");
                 done=input.nextLine();
                if(done.equals("yes")){
                    
                    break;
                }
                
               break;
                case "3": 
                System.out.println("---- Steam Shine ----");
                Cust.EnQueue(name, time, "Steam Shine",  "320");
                total.add(320);
                services.add("Steam Shine");
                System.out.println("Are you done? ");
                done=input.nextLine();
                if(done.equals("yes")){
                    
                    break;
                }
               break;
               
                case "4":
                System.out.println("---- Full Polishing ----");
                Cust.EnQueue(name, time, "Full Polishing",  "440");
                total.add(440);
                services.add("Full Polishing");
                System.out.println("Are you done? ");
                done=input.nextLine();
                if(done.equals("yes")){
                    
                    break;
                }
               break;
                
                case "5": 
                System.out.println("---- Car Disinfection ----");
                Cust.EnQueue(name, time, "Car Disinfection",  "190");
                total.add(190);
                services.add("Car Disinfection");
                System.out.println("Are you done? ");
                done=input.nextLine();
                if(done.equals("yes")){
                    
                    break;
                }
               break;
                 
              
                case "6": 
                System.out.println("---- Remove Dust ----");
                Cust.EnQueue(name, time, "Remove Dust",  "180");
                total.add(180);
                services.add("Remove Dust");
                System.out.println("Are you done? ");
                done=input.nextLine();
                if(done.equals("yes")){
                    
                    break;
                }
               break;
                
             
               
               case"7":
                   
                   System.exit(0);
               
                default:
                System.out.println("Make sure to enter the right code of the desired service");
                return;

                }
                } while(done.equals("no"));
        
        
                System.out.println("Reservation Summary");
                System.out.println("Your name:"+ name);
                System.out.println("Selected date and time: "+ num +", "+time);
                System.out.print("Selected service: ");
                for(String ser : services ){
                    System.out.print(ser+" ");
                }
                System.out.print("\nTotal price: ");
                
                for(int pri : total ){
                   sum=sum+pri;
                }
                System.out.println(sum);
                Customer reminingTime= new Customer();
                System.out.println(reminingTime.reminingTime()+ " minutes") ;
              
                System.out.println("Booked Successfully");
                System.out.println("Thank you for using CarWash");
                
      
    }
    
    public static void menu(){
        
           int steamWash = 210;
           int shine = 300;
           int steamShine= 320;
           int fullPolishing= 440;
           int carDisInfection = 190;
           int DustRemove = 180;
           
             System.out.println("---- Services ----");
             System.out.println("1. Steam wash " + steamWash + "SR");
             System.out.println("2. Shine " + shine + "SR");
             System.out.println("3. Steam Shine " + steamShine);
             System.out.println("4. Full Polishing " + fullPolishing + "SR");
             System.out.println("5. Car Disinfection " + carDisInfection + "SR");
             System.out.println("6. Remove Dust " + DustRemove + "SR");
             System.out.println("7. Exit");
        
    }
    
    
}

// ADMIN CLASSES


class Admin{
String Admin;
String Password;
String Service;
Main c = new Main();
Customer coun = new Customer();
Admin(){
       Scanner input= new Scanner(System.in);
       String username = "admin";
       String pass = "admin";
       
       System.out.println("Username: ");
       this.Admin=input.nextLine();
       System.out.println("Password: ");
       this.Password=input.nextLine(); // To Verfy the admin identity
             
       if ( Admin.equals(username) && Password.equals(pass) ) {
 
          do {
             System.out.println("Enter the service: ");
             System.out.println("OFFER to Add an offer");
             System.out.println("TOTAL to Display total served cars");
             System.out.println("INCOME Display The income of the day");
             System.out.println("APP to Display the upcoming appointments");
             System.out.println("Exit to signout");
             
             Service=input.nextLine().toUpperCase(); //  To uppercase to avoid mistakes
                switch (Service) {
                case "OFFER":
                System.out.println("---- Add an offer ----");
                OffersAdd offer;
                offer = new  OffersAdd(); // OffersAdd class object to add a new offer
                               break;
                
                case "TOTAL": 
                System.out.println("---- Total served cars ----"); // -------------  A counter must be specified for this service !!
                System.out.println(" "+ c.Counter + " cars served Successfully");
                 break;
                 
                case "INCOME": 
                System.out.println("---- Income of the day ----"); // -------------  A counter must be specified for this service !!
               System.out.println(" "+  c.sum + "SR");
                 break;
                 
                case "APP": 
                System.out.println("---- Upcoming appointments ----"); // -------------  A counter must be specified for this service !!
                System.out.println("We have in sunday ("+findNumber1(c.day,1)+ " )Appointments" );
                System.out.println("We have in Monday ("+findNumber1(c.day,2)+ " )Appointments" );
                System.out.println("We have in Tuesday ("+findNumber1(c.day,3)+ " )Appointments" );
                System.out.println("We have in Wednesday ("+findNumber1(c.day,4)+ " )Appointments" );
                System.out.println("We have in Thursday ("+findNumber1(c.day,5)+ " )Appointments" );
                System.out.println("We have in Friday ("+findNumber1(c.day,6)+ " )Appointments" );
                System.out.println("We have in Saturday ("+findNumber1(c.day,7)+ " )Appointments" );
                 break;

                default:
                System.out.println("Thank you");
                System.exit(0);
                
                }
          } while ( !Service.equals("OFFER") || !Service.equals("TOTAL") || !Service.equals("INCOME") || !Service.equals("APP"));
          }
}
public static int findNumber1(ArrayList<Integer> arr, int k) {
                int res = 0;  
                for (int i = 0; i < arr.size(); i++) {
                    if (k == arr.get(i))
                        res ++;

                }

                return res;

            }
}

class OffersAdd {

     public static  int size; // the size of the offers that will be entered

     String serviceName;
     int servicePrice;
     serQueue ser = new serQueue(); // queue object for OFFERS

    public OffersAdd() {
      Scanner inp= new Scanner(System.in);
      System.out.println("Enter the number of services to be added: ");
      size=inp.nextInt(); // the size of the offers that will be entered
      
      for(int i=0; i<size; i++){
      System.out.println("Enter Service number "+(i+1)+ ": ");
      serviceName=inp.next();
          
      System.out.println("Enter Service Price");
      servicePrice=inp.nextInt();
          
      ser.EnQueueFront(serviceName, servicePrice); // Enqueue the offer to the queue "ser"
          }
          }
    
        public static void Offers(){
             System.out.println("---- Limited Time Offers ----"); 
//             ser.display();  // There is an error here.. will be discussed later 
       }
       }

class serQueue{
class Node {
         String service;
         int price;
         Node next;
         Node prev;

        public Node(String service, int price, Node next, Node prev) {
            this.service = service;
            this.price = price;
            this.next = next;
            this.prev = prev;
            
        }
    }

    Node front = null;
    Node rear = null;
    private int count = 0;

    boolean isEmpty() {
        return (count == 0);
    }

    public int getSize() {
        return count;
    }

    Node getFront() {
        if (!isEmpty()) {
            return front;
        } else {
            return null;
        }
    }

    Node getRear() {
        if (!isEmpty()) {
            return rear;
        } else {
            return null;
        }
    }

    public void display() {
        Node current = front;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    void EnQueueRear(String service, int price) {
        Node newNode = new Node(service, price, null, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        count++;
        System.out.println(service + "Service is added to Services List");

    }

    Node DeQueueFront() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return null;
        } else {
            Node temp = front;
            front = front.next;
            if(front != null)
               front.prev = null;
            count--;
            return temp;
        }
    }
    Node DeQueueRear()
    {
        if (isEmpty()) {
            System.out.println("Underflow");
            return null;
        } else {
            Node temp = rear;
            rear = rear.prev;
            if(rear!=null)
               rear.next = null;
            count--;
            return temp;
        }  
    }
    void EnQueueFront(String service, int price) {
        Node newNode = new Node(service, price, null, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            front.prev = newNode;
            newNode.next = front;
            front = newNode;
        }
        count++;
        System.out.println(service + " is added to Services List");
    }
}

// CUSTOMER CLASSES

class Customer{
    
    Node front = null;
    Node rear = null;
    int count = 0;
    
    class Node{
        
    String name , time , service, total_price;
    Node next;

        public Node(String name, String time, String service, String total_price, Node next) {
            this.name = name;
            this.time = time;
            this.service = service;
            this.total_price = total_price;
            this.next = next;
        }

    }
    
   
   public boolean isEmpty() {
        
        return (count == 0);
    }
   
      public void EnQueue(String name, String time, String service, String total_price) {
          
        Node newNode = new Node( name, time,  service, total_price, null);
        
        if (isEmpty())
        {
            front = rear = newNode;

        } else {
            rear.next = newNode;
            rear = newNode;

        }
        newNode.next = front;
        count++;
    }

    public String DeQueue() {
        if (isEmpty()) {
          
            System.out.println("Underflow");
            return null;
        } 
        else {
           
            String temp = front.name;
            front = front.next;
            rear.next = front;
            count--;
            return temp;
        }
    }
    
    void display() {
        Node current = front;
        
       System.out.print("------ Incoming Appointments ------"); 
        do {
            
            System.out.print(current.name + " " +current.time+ " " +current.service + " " +current.total_price);
            current = current.next;
        } while (current != front);

    }
    
    String reminingTime(){
        int min=0;
        int max =15;
        Random rand = new Random();
        int random =  rand.nextInt((max - min) + 1) + min;
        String reminingTime= (" "+random);
        System.out.print("The reminning time :\n");
        return reminingTime;
       
    }
     
    }
