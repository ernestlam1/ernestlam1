package module1;
class TwoDshape{
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
    public void setArea(double area){
        this.area=area;
    }
    public double getArea(){
        return area;
    }
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
      return "shape:"+ "TwoDshape"+" " +"Colour:"+this.getColour();
    }
}

public class Triangle extends TwoDshape{
    private double side1;
    private double side2;
    private double side3;
    private double area;
    public Triangle(double width,double height){
      
     }
  
  public Triangle(double side1,double side2,double side3,Colour colour){
    // All the variables are defined
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.area=Math.pow(q,0.5);
        this.heronHeight=heronHeight();
  }
  
private double heronHeight(){
    //To find the heronHeight of a triangle 
    heronHeight=2*area/(Math.max(Math.max(side1,side2),Math.max(side1,side3)));
    return heronHeight;
  }
public double getArea(){
    //Getter of area
    double s=0.5*(side1+side2+side3);
    double q=s*(s-side1)*(s-side2)*(s-side3);
    this.area=Math.pow(q,0.5);
     return area;
  }
  
  public String toString(){
      return "shape:"+"Triangle"+" "+"side1:"+side1+" "+"side2:"+ side2+" "+"side3: "+side3;
       
  }
