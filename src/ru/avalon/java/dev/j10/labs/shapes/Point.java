package ru.avalon.java.dev.j10.labs.shapes;

import ru.avalon.java.dev.j10.labs.shapes.Shape;

/**
 * Абстрактное представление о точке.
 * <p>
 * То́чка — абстрактный объект в пространстве, не имеющий
 * никаких измеримых характеристик (нульмерный объект).
 * Точка является одним из фундаментальных понятий в
 * математике.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D0%BE%D1%87%D0%BA%D0%B0_(%D0%B3%D0%B5%D0%BE%D0%BC%D0%B5%D1%82%D1%80%D0%B8%D1%8F)">Точка</a>
 */
public class Point implements Shape{
    
//    static final String name = "Точка";
    float x;
    float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = 0;
        y = 0;
    }
    
    public String getInfo(){
        return "Точка: х = " + x + " ,y = " + y;        
    }

    float getX(){
        return x;
    }

    float getY(){
        return y;
    }
    
    public static Shape getInstance(){
        Shape shape = new Point((float)Math.random(), (float)Math.random());
        return shape;        
    }
}
