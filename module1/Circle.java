package module1;
public class Circle extends TwoDshape implements shape {
    private double radius;
    public final double PI=Math.PI;
       public double area;
    
    public Circle(double radius,Colour colour){
        super(colour);
        this.colour=colour;
        this.radius=radius;
        //The constructor is used as a setter 
        this.area=(PI)*(Math.pow(radius,2));
        
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
       public void setArea(double area){
            this.area=area;
       }
@Override
       public double getArea(){
           return area;
       }
       public String toString(){
        //toString method, the class circle is instantiated to get the colour of the object
            return "shape :" + "Circle"+" "+"radius:"+" "+ this.radius +" "+"Colour:"+ this.getColour();
       }
   }


