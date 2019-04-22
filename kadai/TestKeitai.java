class KeitaiDenwa{
  private String number;
  private int nokoriDenki;
  private String passwd;

  public KeitaiDenwa(){
  }

  public void setPasswd(String passwd){
    this.passwd = passwd;
  }
  public String getPasswd(){
    return passwd;
  }

  public void setNokoriDenki(int nokoriDenki){
    if(nokoriDenki >= 0){
      this.nokoriDenki = nokoriDenki;
    }else{
      System.out.println("Battery Error: minus value is substituted.");
    }
  }
  public int getNokoriDenki(){
    if(nokoriDenki >= 0){
      return nokoriDenki;
    }else{
      return 0;
    }
  }


}

class TestKeitai{
  public static void main(String[] args){
    KeitaiDenwa phone = new KeitaiDenwa();

    phone.setPasswd("himitu");
    System.out.println(phone.getPasswd());
    phone.setNokoriDenki(300);
    System.out.println("残りの電池量 : " + phone.getNokoriDenki());

  }
}
