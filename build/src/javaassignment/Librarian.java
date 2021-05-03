/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;


public class Librarian extends Users {
    String ID, firstName, lastName, email, phoneNumber, State;
    String password;
    
    public Librarian(){
       super();
       this.password = "Pass";
       
   }
    
   public Librarian(String password){
       super();
       this.password = password;
       
   }
   
   public Librarian(String ID, String password, String firstName, String lastName, String email, String phoneNumber, String State){
       super(ID, firstName, lastName, email, phoneNumber, State);
       this.password = password;
       
   }
   
   public String getPassword(){
       return password;
   }
   
   public void setPassword(String password){
       this.password = password;
   }
   
   @Override
   public String toString(){
      
       return "ID : " + super.getID() + "\n" +
              "Password : " + getPassword() + "\n" +
              "First Name : " + super.getFirstName() + "\n" +
              "Last Name : " + super.getLastName() + "\n" +
              "Email : " + super.getEmail() + "\n" +
              "Phone Number : " + super.getPhoneNumber() + "\n" +
              "State : " +  super.getState()
              ;
       
   }
   
}
