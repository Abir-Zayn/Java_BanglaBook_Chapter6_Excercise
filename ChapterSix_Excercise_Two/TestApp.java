package ChapterSix_Excercise_Two;

class area{
    public double radius;
    public int length;
    public double width;
    public int base;
    public int height;
    public double heigh;

    public double getArea(double radius){
        this.radius = radius;
        return Math.PI*(Math.pow(radius,2));
    }

    public double getArea(int base,int height){
        this.base = base;
        this.height = height;
        return (height*base)/2;
    }

    public double getArea(int length,double width){
        this.length = length;
        this.width = width;
        return  length*width;
    }

    public double getArea(double r,double heigh){
        this.radius = r;
        this.heigh = heigh;
        return (2*Math.PI*radius*height)+2*Math.PI * (radius*radius);

    }

}


public class TestApp {
    public static void main(String[] args) {
        area Area=new area();
        System.out.println("Area of Circle: "+Area.getArea(12));
        System.out.println("Area of Triangle: "+Area.getArea(12,10));
        System.out.println("Area of Rectangle: "+Area.getArea(10,12.1));
        System.out.println("Area of Cylinder: "+Area.getArea(10.34,12.34));
    }
}
