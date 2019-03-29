package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о ромбе.
 * <p>
 * Ромб (др.-греч. ῥόμβος, лат. rombus, в буквальном
 * переводе: «бубен») — это параллелограмм, у которого все
 * стороны равны
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%BC%D0%B1">Ромб</a>
 */
public class Rhombus extends Polygon{

    int angle;

    public Rhombus(float a, int angle, int rotation) {
        this.angle = angle % 360;
        this.a = a;
        this.rotation = rotation;
    }

    public Rhombus() {
        super();
        this.angle = 90;
    }
    
    public String getInfo(){
        return "Ромб, a = " + a + ", угол = " + angle;        
    }
    
    public float getPerimeter(){
        return a*4;
    }
    
    public int getRotation(){
        return rotation;
    }
    
    public float getArea(){
        double area = a*a*(Math.sin((double)angle));
        return (float)area;
    }  
    
    public static Shape getInstance(){
        Shape shape = new Rhombus((float)Math.random()*10, (int)(Math.random()*90), (int)(Math.random()*360));
        return shape;
    }
}
