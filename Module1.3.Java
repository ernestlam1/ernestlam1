package module1;
// The interface shape is implemented by class Triangle and class Circle
interface Rotate{
    public void rotate90();
    public void rotate180();
    public void rotate(double degree);
}
abstract class TwoDshape{
    private double width;
    private double height;
    private double area;
    public TwoDshape(){

    }
    public TwoDshape(double width,double height){
      // The constructor sets the height and the  width of the TwoDshape
        this.width=width;
        this.height=height;
    }
    public abstract void setArea(double area);
    public abstract double getArea();

    public void setWidth(double width){
      //Setter of width
      this.width=width;
    }
    public double getWidth(){
      //Getter of width
        return width;
    }
    public void setHeight(double height){
      //Setter of height
      this.height=height;
    }
    public double getHeight(){
      //Getter of height
        return height;
    }
    public String toString(){
      // The toString method should display the features of TwoDshape
      return "shape:"+ "TwoDshape";
    }
 }
 
public class Triangle extends TwoDshape implements Rotate {
    private double side1;
    private double side2;
    private double side3;
    private double area;
    public Triangle(double width,double height){
      
     }
  
  public Triangle(double side1,double side2,double side3){
    // All the variables are defined
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        //The area of the triangle is calculated. Heron's formula is used to find the area and the heronHeight of the triangle. 
        this.heronHeight=heronHeight();
  }
  
private double heronHeight(){
    //To find the heronHeight of a triangle 
    heronHeight=2*area/(Math.max(Math.max(side1,side2),Math.max(side1,side3)));
    return heronHeight;
  }

@Override
  public double getArea(){
    //Getter of area
    double s=0.5*(side1+side2+side3);
        double q=s*(s-side1)*(s-side2)*(s-side3);
        return Math.pow(q,0.5);
  }
  
  public String toString(){
      return "shape:"+"Triangle"+" "+"side1:"+side1+" "+"side2:"+ side2+" "+"side3: "+side3+" "+"heronHeight:"+heronHeight;
       
  }
  public class Circle extends TwoDshape implements shape {
    private double radius;
    public final double PI=Math.PI;
    private double area;
    
    public Circle(double radius){
        this.radius=radius;
        //The area of the circle is calculated
  
    }
@Override
       public double getArea(){
           return area;
       }
       public String toString(){
        //toString method, the class circle is instantiated to get the colour of the object
            return "shape :" + "Circle"+" "+"radius:"+" "+ radius;
       }
   }
   