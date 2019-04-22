class Person3{
  private String name;
  public String getName(){
    return name;
  }
  public void setName(String Name){
    this.name = name;
  }
  public Person3(String name){
    this.name = name;
  }
  public void introduce(){
    System.out.println("私は" + name + "と申します。");
  }
}

class Employee3 extends Person3{
  private String department;
  public String getDepartment(){
    return department;
  }
  public void setDepartment(String department){
    this.department = department;
  }
  Employee3(String name, String department){
    super(name);
    this.department = department;
  }
  public void introduce(){
    super.introduce();
    System.out.println("所属は" + department + "です。");

  }
}

class UsePerson3{
  public static void main(String[] args){
    Person3 p1 = new Person3("ジョニー・アーチャー");
    p1.introduce();
    System.out.println();
    Person3 p2 = new Employee3("エフレン・レイズ", "営業部");
    p2.introduce();
  }
}
