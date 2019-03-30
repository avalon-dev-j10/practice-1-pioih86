package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.factories.RandomShapeFactory;
import ru.avalon.java.dev.j10.labs.factories.ShapeFactory;
import ru.avalon.java.dev.j10.labs.shapes.Shape;

public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new RandomShapeFactory(); // RandomSh.. конструктор

        Shape[] shapes = new Shape[20];

        for(int i = 0; i < shapes.length; i++){
            shapes[i] = factory.getInstance();
            System.out.print(shapes[i].getInfo());
            System.out.println(" площадь: " + shapes[i].getArea());              
        }
        
        Shape maxArea = shapes[0];
        for( int i = 1; i < shapes.length; i++){
            if (maxArea.getArea() < shapes[i].getArea()){
                maxArea = shapes[i];
            }
        }
        
        System.out.println("----------------------------------------------------");
        System.out.println("Фигура с максимальной площадью: " + maxArea.getInfo()+
                " площадь равна " + maxArea.getArea());
        
    }
}
