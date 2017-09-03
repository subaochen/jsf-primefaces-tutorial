package cn.edu.sdut.softlab;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean( eager = true)
@SessionScoped
public class Member implements Serializable{
  private static final long serialVersionUID = 1L;
  
  private Name name = new Name();
  private Company company = new Company();
  
  public Member (Name Name, Company Company) {
    this.setName(Name);
    this.setCompany(Company);
  }
  public Member () {}
  
  
  public Company getCompany() {
    return company;
  }
  
  public void setCompany(Company Company) {
    this.company = Company;
  }
  
  public Name getName() {
    return name;
  }
  
  public void setName(Name Name) {
    this.name = Name;
  }
  
  public String memberInformation() {
    return("members");
  }
}