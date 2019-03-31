package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{
    
//    static final String name = "Круг";
    float rad;
    
    /*  TODO (Проверка№1 ЛР№2)
        - Отсутствует один интерфейс Point и его реализация
    */

    public Circle(float rad) {
        this.rad = rad;
    }

    public Circle() {
        rad = 1;
    }
    
    public String getInfo(){
        return "Круг, радиус: " + rad;        
    }
    
    public float getLength(){
        return 2*PI*rad; 
    }
    
    public float getArea(){
        return 2*PI*rad*rad;
    }
    
    /*  TODO (Проверка№1 ЛР№2)
        - Метод getInstabce должен находиться в отдельном классе!
    */    
    public static Shape getInstance(){
        Shape shape = new Circle((float)Math.random()*2);
        return shape;
    }
}
