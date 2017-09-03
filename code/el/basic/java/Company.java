package cn.edu.sdut.softlab;

public class Company {
	
  private String companyName, business;
  
  public Company(String companyName, String business) {
    this.setCompanyName(companyName);
    this.setBusiness(business);
  }
  public Company(){}
  
  public String getCompanyName() {
    return companyName;
  } 

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getBusiness() {
    return business;
  }

  public void setBusiness(String business) {
    this.business = business;
  }
}