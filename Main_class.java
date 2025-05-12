
import java.util.*;
public class Main_class
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Instructor ob1 = new Instructor("Rohit Sarkar","9876543210");
        Textbook ob2 = new Textbook("Java Book For Beginners", "Lisa Rakshit", "Indrajit");
        Course ob3 = new Course("Java Programming",ob1,ob2);
        
        while(true)
        {
        System.out.println("Enter 1 -> Set data of Instructor \n 2 -> Set data of Textbook \n 3 -> Set Course data \n 4 -> View Instructor  data \n 5 -> View Textbook  data \n 6 -> View Course data \n 0 -> EXIT");
        int ch = sc.nextInt();
        sc.nextLine();
        switch(ch)
        {
            case 1 : 
                System.out.println("Provide the details of the Instructor");
                System.out.println("Enter Name of the instructor : ");
                String name = sc.nextLine();
                System.out.println("Enter Phone Number : ");
                String number = sc.nextLine();
                ob1.setdata(name,number);
            break;
            case 2 : 
                System.out.println("Provide the details of the Textbook");
                System.out.println("Enter title of the textbook : ");
                String title = sc.nextLine();
                System.out.println("Author's Name : ");
                String author = sc.nextLine();
                System.out.println("Publisher's Name : ");
                String pub = sc.nextLine();
                ob2.setdata(title,author,pub);
            break;
            case 3 : 
                System.out.println("Provide the details of the Course");
                System.out.println("Enter Name of the Course : ");
                String c_name = sc.nextLine();
                ob3.setdata(c_name,ob1,ob2);
            break;
            case 4 :
                System.out.println("Details of the Instructor");
                ob1.display();
                break;
            case 5 :
                System.out.println("Details of the Textbook");
                ob2.display();
                break;
            case 6 :
                System.out.println("Details of the Course");
                ob3.display();
                break;
            case 0 : 
                return;
            default :
                System.out.println("Wrong Input");
        }
    }
}
}