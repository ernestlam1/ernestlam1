package module1;
class Triangle implements Rotate{
     public void rotate90(){
       n="Rotated 90 degrees";
       System.out.println(n);
    }
     public void rotate180(String p){
        p="Rotated 180 degrees";
        System.out.println(p);
    }
     public void rotate(double degree){
        System.out.println(degree);
    }
        public static void main(String[] args){
            Triangle a=new Triangle(7,8,9);
            a.setArea(7,8,9);
            System.out.println(a.getArea());
    }
    }

