class Square{
  static int SIDES_NUM = 4;
  int height;
  int width;
  int area(){
    return height*width;
  }
  static void setData(int h, int w){
    height = h;
    width = w;
  }
  void setData(int same){
    height = same;
    width = same;
  }
}
