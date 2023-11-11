package module1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)

public class Test2 {
    // Test cases will be written here
@Test
    public void testcirclegetArea(){
        Circle k= new Circle(6,Colour.RED);
        double actualvalue=Math.round(k.getArea()*100)/100;
        double expectedvalue=113.0;
        Assert.assertEquals(expectedvalue,actualvalue,0.01);
    }
@Test
    public void testtrianglegetArea(){
        Triangle h=new Triangle(3,4,5,Colour.BLUE);
        double actualvalue=h.getArea();
        double expectedvalue=6.0;
        Assert.assertEquals(expectedvalue,actualvalue,0.01);

    }
@Test
   public void testheronHeight(){
    Triangle u=new Triangle(3,4,5,Colour.GREEN);
    double actualvalue=u.heronHeight();
    double expectedvalue=2.4;
     Assert.assertEquals(expectedvalue, actualvalue,0.01);
   }
}
