/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment;


public class Users {
    private String ID, firstName, lastName, email, phoneNumber, State;
    
    public Users(){
       ID = "ID";
       firstName = "FirstName";
       lastName = "LastName";
       email = "Email";
       phoneNumber = "PhoneNumber";
       State = "State";
   }
    
   public Users(String ID, String firstName, String lastName, String email, String phoneNumber, String State){
       this.ID = ID;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.State = State;
   }
   
   public String getID(){
       return ID;
   }
   
   public String getFirstName(){
       return firstName;
   }
   
   public String getLastName(){
       return lastName;
   }
   
   public String getEmail(){
       return email;
   }
   
   public String getPhoneNumber(){
       return phoneNumber;
   }
   
   public String getState(){
       return State;
   }
   
   public void setID(String ID){
       this.ID = ID;
   }
   
   public void setFirstName(String firstName){
       this.firstName = firstName;
   }
   
   public void setLastName(String lastName){
       this.lastName = lastName;
   }
   
   public void setEmail(String email){
       this.email = email;
   }
   
   public void setPhoneNumber(String phoneNumber){
       this.phoneNumber = phoneNumber;
   }
   
   public void setState(String State){
       this.State = State;
   }
   
   public String toString(){
      
       return "ID : " + getID() + "\n" +
              "First Name : " + getFirstName() + "\n" +
              "Last Name : " + getLastName() + "\n" +
              "Email : " + getEmail() + "\n" +
              "Phone Number : " + getPhoneNumber() + "\n" +
              "State : " +  getState()
              ;
       
   }
   
}
