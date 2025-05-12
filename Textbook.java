/**
 *  Each textbook has a title, author name and publisher 
 *  One can set the data for a textbook and view the same.   
 */

class Textbook
{
   String title;
   String author_name,publisher;
   
   Textbook(String t, String n, String p)
   {
       this.title = t;
       this.author_name =n;
       this.publisher =p;
   }
   void setdata(String t, String n, String p)
   {   
       this.title = t;
       this.author_name =n;
       this.publisher =p;
   }
   void getTitle()
   {
       System.out.println("Title of the Textbook : "+title);
   }
   void display()
   {
       System.out.println("Title of the Textbook : "+title);
       System.out.println("Author : "+author_name);
       System.out.println("Publisher : "+publisher);
   }
}