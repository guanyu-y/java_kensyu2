class UsePerson2{
  public static void main(String[] args){
    Person2 p1 = new Person2();
    p1.setName("Joh Lennon");
    p1.setAge(40);
    Person2 p2 = new Person2();
    p2.setName("@$%###");
    p2.setAge(-400);

    System.out.println("私の名前は" + p1.getName() + "です。年齢は" + p1.getAge() + "です。");

    System.out.println("私の名前は" + p2.getName() + "です。年齢は" + p2.getAge() + "です。");

  }
}
