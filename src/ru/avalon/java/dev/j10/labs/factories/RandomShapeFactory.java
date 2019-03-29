package ru.avalon.java.dev.j10.labs.factories;

import ru.avalon.java.dev.j10.labs.shapes.Circle;
import ru.avalon.java.dev.j10.labs.shapes.Point;
import ru.avalon.java.dev.j10.labs.shapes.Rectangle;
import ru.avalon.java.dev.j10.labs.shapes.Shape;
import ru.avalon.java.dev.j10.labs.shapes.Triangle;
import ru.avalon.java.dev.j10.labs.shapes.Rhombus;
import ru.avalon.java.dev.j10.labs.shapes.Trapezium;

/**
 * "Фабрика" фигур, возвращающая фигуры случайной природы.
 * <p>
 * Фабрика возвращает не только фигуры случайных типов, но
 * также обеспечивает случайную природу самих фигур. Другими,
 * словаим, если фабрика возвращает две фигуры одного и того
 * же типа, их структура, с высокой вероятностью, будет
 * отличатся.
 */
public class RandomShapeFactory implements ShapeFactory {

    /*
     * TODO: Реализуйте класс 'RandomShapeFactory'
     * Подумайте о том, какой может быть реализация.
     *
     * Как можно улучшить реализацию, создав специализированные
     * фабрики, создающие конкретные подвиды фигур?
     */

    /**
     * Возвращает случайную фигуру.
     * <p>
     * Разные вызовы метода могут возвращать экземпляры
     * различных типов. Например, два последовательных вызова
     * метода могут вернуть фигуры одного и того же типа,
     * но могут вернуть и фигуры различных типов.
     * <p>
     * Структура полученных фигур, также носит случайный
     * характер. Например, если два вызова метода возвращают
     * окружность, то это будут окружности с различным
     * радиусом.
     *
     * @return новый экземпляр типа {@link Shape}.
     */
    public Shape getInstance() {
        
        Shape shape;
        int random = (int)(Math.random()*6);
//        System.out.println(random);
        switch(random){
            case 0:
                shape = Point.getInstance();
                break;
            case 1:
                shape = Circle.getInstance();
                break;
            case 2:
                shape = Rectangle.getInstance();
                break;
            case 3:
                shape = Rhombus.getInstance();
                break;
            case 4:
                shape = Trapezium.getInstance();
                break;
            default:
                shape = Triangle.getInstance();
                break;
        }
                
        return shape;
        }
            
    
}
