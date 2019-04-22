class Car3{
    void accel(){
        System.out.println("ガソリンで動く");
    }
}
class ElectricCar3 extends Car3{
    void accel(){
      System.out.println("電気で動く");
    }
}
class UseCar3{
    public static void main(String[] args){
      ElectricCar3 e = new ElectricCar3();
      e.accel();
    }
}
