package module1;
 abstract class TwoDshape
{
   private double width,height;
   Colour m;
   public TwoDshape(){
    this.m=Colour.Red;
   }
   public TwoDshape(double width,double height){
       this.width=width;
       this.height=height;
   }
   abstract double getArea();
   
   public void setHeight(double height){
       this.height=height;
       }   
   public String toString(){
       
      }
   }
   public double getHeight(){
       return height;
   }
}
interface rotate{
  void rotate90();
  void rotate180();
  void rotate(double degree);
}

   class Triangle extends TwoDshape {
       private double side1,side2,side3;
       public double area,w,h;
       public Triangle(double w,double h){
        this.w=w;
        this.h=h;
     }
     public Triangle(double side1,double side2,double side3){
           this.side1=side1;
           this.side2=side2;
           this.side3=side3;
     }
     public void setArea(double side1,double side2,double side3){
        double s=0.5*(side1+side2+side3);
        double q=s*(s-side1)*(s-side2)*(s-side3);
        this.area=Math.pow(q,0.5);
  }
     public double getArea(){
        return area;
     }
     public String toString(){
          return "shape:"+"Triangle";
          
     }
     
     
     private double heronHeight(){
        double h=2*area/(Math.max(Math.max(side1,side2),Math.max(side1,side3)));
         return h;
   }
}
   class Circle extends TwoDshape {
       private double radius;
       public final double PI=Math.PI;
       public double area;
       public Circle(double radius){
           this.radius=radius;
           
       }
       public double getArea(){
           return area;
    
       }
       public void setArea(double radius){
         this.area=(PI)*(Math.pow(radius,2));
       }
       public String toString(){
           return "shape :" + "Circle";
       }
   }
