/**
 *  Each Instructor has name and phone number. 
 *  One can view instructor information and set the information.  
 */

class Instructor
{
   String name;
   String phn_no;
   
   Instructor(String n,String p)
   {
       this.name = n;
       this.phn_no =p;
   }
   void setdata(String n,String p)
   {
       this.name = n;
       this.phn_no = p;
   }
   void getName()
   {
       System.out.println("Instructor's Name : "+name);
   }
   void display()
   {
       System.out.println("Instructor's Name : "+name);
       System.out.println("Instructor's PhoneNumber : "+phn_no);
   }
}