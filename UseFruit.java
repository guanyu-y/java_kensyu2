abstract class Fruit{
  abstract String whatColor();
}
class Apple extends Fruit{
  String whatColor(){
    return "リンゴの色は赤";
  }
}
class Orange extends Fruit{
  String whatColor(){
    return "みかんの色はオレンジ";
  }
}
class Melon extends Fruit{
  String whatColor(){
    return "メロンの色は緑";
  }
}
class UseFruit{
  public static void main(String[] args){
    Fruit [] fruits = { new Apple(), new Orange(), new Melon()};
    for(int i = 0; i < fruits.length; i++){
      System.out.println(fruits[i].whatColor());
    }
  }
}
