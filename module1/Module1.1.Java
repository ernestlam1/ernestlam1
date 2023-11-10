package module1;
 abstract class TwoDshape
{
   private double width,height;
   
   public TwoDshape(){
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
       if(width==height){
     return "shape : "+ "Square";}
      else{
          return "shape :"+"Rectangle";
      }
   }
   public double getHeight(){
       return height;
   }
   
}


   class Triangle extends TwoDshape{
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
   