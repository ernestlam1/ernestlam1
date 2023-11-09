package module1;
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
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.colour=colour;
        this.rotation=0.0;
        //The constructor is used to set the area of a Triangle using heron's formula
        double s=0.5*(side1+side2+side3);
        double q=s*(s-side1)*(s-side2)*(s-side3);
        this.area=Math.pow(q,0.5);
        this.heronHeight=heronHeight();
  }
  
  double heronHeight(){
    //To find the heronHeight of a triangle
    heronHeight=2*area/(Math.max(Math.max(side1,side2),Math.max(side1,side3)));
    return heronHeight;
  }
@Override
  public void setArea(double area){
    //Setter of area using heron's formula
     this.area=area;
}
@Override
  public double getArea(){
    //Getter of area
     return area;
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
      return "shape:"+"Triangle"+" "+"side1:"+this.side1+" "+"side2:"+ this.side2+" "+"side3: "+this.side3+" "+"Colour:"+this.getColour()+" "+"Rotation(Degree):"+this.getRotation();
       
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
      public static void main(String[] args){
         Triangle a= new Triangle(7,8,9,Colour.BLUE);
         Circle f=new Circle(8,Colour.RED);
         a.rotate(90);
         a.setRotation(45);
         System.out.println(a.getArea());
         System.out.println(a.toString());
         System.out.println(f.toString());
         System.out.println((a.getRotation()));
         a.rotate(66);
 }

 }
