class HandyPhone4 extends Phone4{
  private String mailAddress;

  public String getMailAddless(){
    return mailAddress;
  }
  public void setMailAddress(String mailAddress){
    this.mailAddress = mailAddress;
  }

  public void info(){
    System.out.println("電話番号=" + getNo() + ",メールアドレス=" + mailAddress);
  }
  public void mail(String to){
    System.out.println(mailAddress + "から" + to + "へメールしました。");
  }
  public HandyPhone4(String no, String mailAddress){
      super(no);
      this.mailAddress = mailAddress;
  }
}
