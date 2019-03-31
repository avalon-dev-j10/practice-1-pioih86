package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Абстрактное представление о многоугольнике.
 * <p>
 * Многоуго́льник — это геометрическая фигура, обычно
 * определяемая как часть плоскости, ограниченная замкнутой
 * ломаной.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9C%D0%BD%D0%BE%D0%B3%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Многоугольник</a>
 */
public abstract class Polygon implements Shape {

    /*
     * TODO: Закончить определение интерфейса 'Polygon'
     *
     * 1. Включите интерфейс в общую систему типов.
     *
     * 2. При необходимости, дополните структуру интерфеса.
     */
    int rotation;
    float a;
    
    /*  TODO (Проверка№1 ЛР№2)
        - Не реализована инкапсуляция полей!
    */

    public Polygon() {
        a = 1;
        rotation = 0;
    }

    public Polygon(int rotation) {
        this.rotation = rotation;
    }
   
    public abstract float   getArea();        //Переопределение родительского метода getArea() без default
    public abstract int     getRotation();      //Переопределение родительского метода getRotation() без default
    public abstract float   getPerimeter();
}
