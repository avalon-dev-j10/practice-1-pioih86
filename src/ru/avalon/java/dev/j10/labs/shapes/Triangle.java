package ru.avalon.java.dev.j10.labs.shapes;

import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle extends Polygon {

//    static final String name = "Треугольник";
    float b;
    float c;

    public Triangle(float a, float b, float c, int rotation) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.rotation = rotation;
    }

    public Triangle() {
        super();
        b = 1;
        c = 1;
    }
    
    public String getInfo(){
        return "Треугольник: a = " + a + ", b = " + b + ", c = " + c;        
    }
    
    public float getPerimeter(){
        return a + b + c;
    }
    
    public int getRotation(){
        return rotation;
    }
    
    public float getArea(){
        float p = (a + b + c)/2;
        return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    public static Shape getInstance(){
        float a, b, c;
        Shape shape = null;
        while ( true ){
            a = (float)Math.random()*10;
            b = (float)Math.random()*10;
            c = (float)Math.random()*10;
            if ( a + b > c && a + c > b && b + c > a ){ 
                shape = new Triangle(a, b, c, (int)(Math.random()*360));
                break;
            }
        }
        
        
//        Shape shape = new Triangle((float)Math.random()*10, (float)Math.random()*10,
//                (float)Math.random()*10, (int)(Math.random()*360));
        return shape;
    }
}
