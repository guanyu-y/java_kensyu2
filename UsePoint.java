class UsePoint{
  public static void main(String[] args){

    Point[] p = {new Point(3,9),
                 new ColorPoint(12,-3,"RED"),
                 new Point(56,2),
                 new ColorPoint(7,-28,"BLUE")};
    for(int i=0; i<p.length; i++){
        p[i].showCoordinate();
        System.out.println("");
    }
  }
}
