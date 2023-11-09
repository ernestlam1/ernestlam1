package module1;
import java.util.ArrayList;
  // The interface shpae is implemented by class Triangle and class Circle
interface shape{
  //The parameters of class triangle and class circle are the same for the setArea method
  void setArea(double area);
  double getArea();
  String toString();
}

public class Test1  {
    public static void main(String[] args){
       ArrayList<shape> n=new ArrayList<>();
       Circle j=new Circle(5,Colour.BLUE);
       Circle k=new Circle(7.9,Colour.RED);
       Circle M=new Circle(3,Colour.GREEN);
       Triangle o= new Triangle(3,4,5,Colour.GREEN);
       Triangle L= new Triangle(4,8,10,Colour.NONE);
       Triangle P=new Triangle(6,13,18,Colour.RED);
       n.add(j);
       n.add(o);
       n.add(k);
       n.add(L);
       n.add(M);
       n.add(P);
       for(shape a: n){
        // Test for the getArea and toString methods
        System.out.println(a.getArea());
        System.out.println(a.toString());
       }
    }
}
