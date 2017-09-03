package cn.edu.sdut.softlab;

import java.io.Serializable;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean( eager = true)
@SessionScoped
public class Basic implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private Date Time = new Date();
  private String greeting = "Welcome";
  private String[] messages =
    {"input members' information","others..."};
  private Member Member;
  
  public Date getTime() {
    return(Time);
  }
  
  public String getGreeting() {
    return(greeting);
  }
  
  public Member getMember() {
    return Member;
  }
  
  public void setMember(Member Member) {
    this.Member = Member;
  }
  
  public String[] getMessages() {
    return messages;
  }
}

