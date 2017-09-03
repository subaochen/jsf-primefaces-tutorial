package cn.edu.sdut.softlab;

public class Name {
	
  private String firstName, lastName;
  
  public Name(String firstName, String lastName) {
    this.setFirstName(firstName);
    this.setLastName(lastName);
  }
  public Name(){}
  
  public String getLastName() {
    return lastName;
  }
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public String getFirstName() {
    return firstName;
  }
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
  
