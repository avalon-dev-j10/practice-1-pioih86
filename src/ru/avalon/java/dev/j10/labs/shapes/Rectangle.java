package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle extends Polygon {

//    static final String name = "Прямоугольник";
    float b;    //вторая сторона прямоугольника
    
    public Rectangle(float a, float b, int rotation) {
        this.a = a;
        this.b = b;
        this.rotation = rotation;
    }

    public Rectangle() {
        super();
        b = 1;
    }
    
    public String getInfo(){
        return "Прямоугольник: a = " + a + ", b = " + b;        
    }
    
    public float getArea(){
        return a*b;
    }
    
    public float getPerimeter(){
        return 2*(a+b);
    }
    
    public int getRotation(){
        return rotation;
    }
    
    public static Shape getInstance(){
        Shape shape = new Rectangle((float)Math.random()*10, (float)Math.random()*10,
                (int)(Math.random()*360));
        return shape;
    }
    
}
