package module1;
import java.util.ArrayList;
  // The interface shpae is implemented by class Triangle and class Circle
interface shape{
  //The parameters of the setter method in class triangle and class circle are combined
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
       // The circles and triangles above are added to the ArrayList n
       n.add(j);
       n.add(k);
       n.add(M);
       n.add(L);
       n.add(o);
       n.add(P);
       for(shape a: n){
        // Test for the getArea and toString methods
        System.out.println(a.getArea());
        System.out.println(a.toString());
       }
    }
}
