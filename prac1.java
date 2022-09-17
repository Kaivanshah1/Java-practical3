/*Create an abstract class GeometricObject as the superclass for Circle and Rectangle. GeometricObject models common features of geometric objects. Both Circle and Rectangle contain the getArea() and getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. Since you can compute areas and perimeters for all geometric objects, so define the getArea() and getPerimeter() methods in the GeometricObject class. Give implementation in the specific type of geometric object. Create TestGeometricObject class to display area and perimeter of Rectangle and Triangle, compare area of both and display results.
Design of all classes are given in the following UML diagram.
*/


abstract public class GeometricObject { 
public int Radius;
public String color; 
public boolean filled; 
public int length; 
public int width;
public GeometricObject(String color, boolean filled) { 
this.color = color;
this.filled = filled;
}
public void getcolor(String color,boolean filled){ 
this.color = color;
this.filled = filled;
}
public String string()
{
return color;
}
public boolean filled()
{
return filled;
}

public void getradius(int r){ Radius = r;
}
public double Area(){ return 0;
}
public double perimeter() { return 0;
}
}
class circle extends GeometricObject{	
 
{

radius) {
 
public circle(String color, boolean filled,int super(color, filled);
Radius = radius;
 
}
public double Area() {
return (3.14 * (Radius * Radius));
}
public double perimeter(){ return (3.14 * (2 * Radius));
}


public static void main(String[] args)
{
circle obj = new circle("red",true,4); ractangle obj1 = new ractangle("blue",true,7,8); double area = obj.Area();
double perimeter = obj.perimeter();

double area1 = obj1.Area();
double perimeter1 = obj1.perimeter(); System.out.println( " availability : "+
obj.filled() + "the color is : " + obj.string()); System.out.println("Area of circle is : " + area
 
);

perimeter);
 

System.out.println("perimeter of circle : " +
 

System.out.println( " availability : "+ obj.filled() + "the color is : " + obj1.string());
System.out.println("Area of ractangle is : "
 
+ area1 );

" + perimeter1);
}
 

System.out.println("perimeter of ractangle :
 
}
public ractangle(String color,boolean filled,int length,int width)
{
super(color,filled); this.color = color; this.filled = filled; this.length = length; this.width = width;
}
public double Area(){
 
	return (length*width);
}
public double perimeter() { return (2*(length+width));
}
}
