public class Rectangle {
   private int height = 1 ;
   private int width = 1;

   public Rectangle(int h, int w) {
        setHeight(h);
        setWidth(w);
   }

   void setHeight(int h) {
       if (h > 0){
       height = h;
       }
   }

   public int getHeight(){
       return height;
   }

   void setWidth(int w) {
       if (w > 0){
       width = w;
       }
    }
    public int getWidth(){
       return width;
    }

    public int getArea(){
       return width*height;
    }
    public int getPerimeter(){
       return 2*width+2*height;
    }
}