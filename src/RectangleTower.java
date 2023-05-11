public class RectangleTower extends Tower {

    public RectangleTower(double height, double width) {
        super(height, width);
    }
    public  double getPerimeter(){
       return getHeight()*2+getWidth()*2;
    }
    public  double getArea(){
       return getHeight()*getWidth();
    }

    public void print(){
       if(getWidth()==getHeight()||Math.abs(getHeight()-getWidth())>5)
           System.out.println("Area: "+getArea());
       else
           System.out.println("Perimeter: "+getPerimeter());
    }
}
