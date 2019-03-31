package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о трапеции.
 * <p>
 * Трапе́ция (от др.-греч. τραπέζιον — «столик» от τράπεζα —
 * «стол») — выпуклый четырёхугольник, у которого две
 * стороны параллельны. Часто в определение трапеции
 * добавляют условие, что две другие стороны должны быть не
 * параллельны.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B0%D0%BF%D0%B5%D1%86%D0%B8%D1%8F">Трапеция</a>
 */
public class Trapezium extends Polygon{

//    static final String name = "Трапеция";
    float b;
    float c;
    float d;
    float h;

    public Trapezium(float a, float b, float c, float d, float h, int rotation) {
        
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.rotation = rotation;
    }
    
    /*  TODO (Проверка№1 ЛР№2)
        - Поле а надо инициалицизровать конструктором предка Polygon!
        - Отсутствует один интерфейс Point и его реализация
    */

    public Trapezium() {
        super();
        b = 2;
        c = 1;
        d = 1;
        h = 0.866f;
    }
    
    public String getInfo(){
        return "Трапеция: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d;        
    }
    
    public float getPerimeter(){
        return a + b + c + d;
    }
    
    public float getArea(){
        return (a+b)/2*h;        
    }
    
    public int getRotation(){
        return rotation;
    }    
    
    /*  TODO (Проверка№1 ЛР№2)
        - Метод getInstabce должен находиться в отдельном классе!
    */
    public static Shape getInstance(){
        Shape shape = new Trapezium((float)Math.random()*10, (float)Math.random()*10,
                (float)Math.random()*10, (float)Math.random()*10, (float)Math.random()*10, (int)(Math.random()*360));
        return shape;
    }
    
}
