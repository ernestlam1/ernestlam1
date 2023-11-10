package module1;
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
    public abstract void setArea(double area);
    public abstract double getArea();
    public Colour getColour(){
      return colour;
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
      return "shape:"+ "TwoDshape"+" " +"Colour:"+ getColour();
    }
}

