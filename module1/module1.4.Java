package module1;
public enum Colour {
    //Enumeration "Colour"
    RED,
    GREEN,
    BLUE,
    NONE;
}
interface Rotate {
    public void rotate90();
    public void rotate180();
    public void rotate(double degree);
}
abstract class TwoDshape{
    private double width;
    private double height;
    protected Colour colour;

    public TwoDshape(){

    }
    public TwoDshape(Colour colour){
       this.colour=colour;
    }
    public TwoDshape(double width,double height){
      // The constructor sets the height and the  width of the TwoDshape
        this.width=width;
        this.height=height;
    }
    public abstract double getArea();
    public Colour getColour(){
      return colour;
    }
    public void setWidth(double width){
      //Setter of width
      //Catch exceptions
      if (width<=0){
        throw new IllegalArgumentException("Invalid Input");
      }
      this.width=width;
    }
    public double getWidth(){
      //Getter of width
        return width;
    }
    public void setHeight(double height){
      //Setter of Height
      //Catch Exceptions
      if (height<=0){
        throw new IllegalArgumentException("Invalid input");
      }
      this.height=height;
    }
    public double getHeight(){
      //Getter of height
        return height;
    }
    public String toString(){
      // The toString method should display the features of TwoDshape
      return "shape:"+ "TwoDshape"+" " +"Colour:"+ getColour();
    }
}
public class Triangle extends TwoDshape implements Rotate,shape{
    private double side1;
    private double side2;
    private double side3;
    private double area;
    private double rotation;
    private double heronHeight;
      
    public Triangle(double width,double height){
      
     }
    public Triangle(double side1,double side2,double side3,Colour colour){
    // All the variables are defined. To access the colour field in the superclass, the method super() is implemented.
        super(colour);
        // Catching exceptions
        try{
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        } 
          catch (Exception e) {
          System.out.println("Invalid input");
        }
        this.colour=colour;
        this.area=getArea();
        this.rotation=0.0;
        this.heronHeight=heronHeight();
  }
    public void setSide1(double side1){
      //Setter of side1
      if (side1<=0){
        throw new IllegalArgumentException("Invalid Input");
      }
      this.side1=side1;
  }
    public void setSide2(double side2){
      //Setter of side2
        if (side2<=0){
        throw new IllegalArgumentException("Invalid Input");
      }
        this.side2=side2;
    }
    public void setSide3(double side3){
      //Setter of side3
       if (side3<=0){
        throw new IllegalArgumentException("Invalid Input");
      }
      this.side3=side3;
    }
  
  protected double heronHeight(){
    //To find the heronHeight of a triangle
    heronHeight=2*area/(Math.max(Math.max(side1,side2),Math.max(side1,side3)));
    return heronHeight;
  }

@Override
  public double getArea(){
    //The area of the triangle is calculated using Heron's formula
        double s=0.5*(side1+side2+side3);
        double q=s*(s-side1)*(s-side2)*(s-side3);
        return Math.pow(q,0.5);
  }
  public void setColour(Colour colour){
    //Setter of colour
    this.colour=colour;
  }
  public Colour getColour(){
    //Getter of colour
    return colour;
  }
  
  public String toString(){
    // toString method . To compute the colour and the rotation of the object, the class triangle is instantiated.
      return "shape:"+"Triangle"+" "+"side1:"+side1+" "+"side2:"+ side2+" "+"side3: "+side3+" "+"Colour:"+ getColour()+" "+"Rotation(Degree):"+ getRotation()+" "+"heronHeight:"+ heronHeight;
       
  }
@Override
  public void rotate90(){
    rotation+=90;
      System.out.println("Rotated 90 degrees");
  }
@Override
  public void rotate180(){
    rotation+=180;
   System.out.println("Rotated 180 degrees");
  }
@Override
  public void rotate(double degree){
      rotation+=degree;
      System.out.println(degree);
  }
  
  public void setRotation(double rotation){
     this.rotation=rotation;
  }

  public double getRotation(){
    return rotation;
  }
 }
 public class Circle extends TwoDshape implements shape {
    private double radius;
    public final double PI=Math.PI;
    
    public Circle(double radius,Colour colour){
        super(colour);
        try {
            setColour(colour);
            setRadius(radius);
        } catch (Exception e) {
            System.out.println("Invalid input");
            this.colour=Colour.NONE;
            this.radius=1.0;
        }
    }
    public void setRadius(double radius){
    // Throw an excpetion 
       if(radius<=0){
         throw new IllegalArgumentException("The radius has to be a positive value");
       }
       this.radius=radius;
    }
    public void setColour(Colour colour){
        //Setter of Colour
        this.colour=colour;
    }
    public Colour getColour(){
        //Getter of colour
        return colour;
    }

@Override
       public double getArea(){
           return PI*Math.pow(radius,2);
       }
       public String toString(){
        //toString method, the class circle is instantiated to get the colour of the object
            return "shape :" + "Circle"+" "+"radius:"+" "+ radius +" "+"Colour:"+ getColour();
       }
   }




