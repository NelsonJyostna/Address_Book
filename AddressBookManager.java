import javax.swing.*;
import java.util.*;

class Person
{

        //Scanner s = new Scanner(System.in);

       public String name;
       public String state;
       public String zipcode;
       public String mobno;

       public Person(String name, String state, String zipcode, String mobno)         // constructor
           {
            this.name = name;
            this.state = state;
            this.zipcode = zipcode;
            this.mobno = mobno;
           }

       public void print()
         {
           JOptionPane.showMessageDialog(null, "Name:" + name + "\nState:" + state + "\nZipcode : " + zipcode + "\nMobile Number :" +mobno);
         }
}

public class AddressBookManager
{

     private ArrayList<Person> person;            //ArrayList_Syntax

     public AddressBookManager ( )              //constructor
          {
            person = new ArrayList<Person>();
          }


     public void addPerson( )                             //Add new person information to arraylist by taking input from the user
      {
           String name = JOptionPane.showInputDialog("Enter Name");
           String state = JOptionPane.showInputDialog("Enter State");
           String zip = JOptionPane.showInputDialog("Enter Zipcode");
           String mobno = JOptionPane.showInputDialog("Enter Mobile Number");

          Person p = new Person(name, state, zip, mobno);         //construct new person object

          person.add(p);                   //add the above Person object to arraylist
      }//add_Method


     public void search(String name)
      {

            for(int i = 0; i < person.size(); i++)
             {
                Person p = (Person)person.get(i);
                if(name.equals(p.name))
                  {
                    p.print();
                  }//if statment
              }//for loop

       }//search_Method


     public void remove(String name)
       {
               for(int i = 0; i < person.size(); i++)
                {
                  Person p = (Person)person.get(i);
                  if(name.equals(p.name))
                   {
                    person.remove(i);
                   }
                }

       }//remove_Method


     public void show()
       {
	   for(int i=0; i< person.size(); i++)
            {
		Person p = (Person)person.get(i);
		 p.print();
	    }
       }//show_Method


     public static void main(String args[])                //Main_Method
      {
         AddressBookManager add = new AddressBookManager();
         int ch;
         String name;

        while(true)
         {
           name = JOptionPane.showInputDialog("Enter 1 to Add\n Enter 2 to Search\n Enter 3 to Remove\n Enter 4 to Display");
           ch = Integer.parseInt(name);                     //converting String to character
           switch(ch)
            {
             case 1:
                    add.addPerson();
                    break;
             case 2:
                    name = JOptionPane.showInputDialog("Enter The Name");
                    add.search(name);
                    break;
             case 3:
                    name = JOptionPane.showInputDialog("Enter The Name");
                    add.remove(name);
                    break;
             case 4:
                     add.show();
                     break;
             case 5:
                    System.exit(0);
            }//switch_statment
         }//while_loop
      }//Main_Method

}
