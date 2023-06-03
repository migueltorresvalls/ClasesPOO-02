package domain;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import ui.Juego;

public class Tarta extends ObjetoCayendo{

    private boolean rebote = false; 

    public Tarta(){
        super(Generador.generaX(0, Juego.ANCHO-30), Generador.generaX(0, Juego.ALTO/3), 30, 30, Color.CYAN, Generador.generaVelocidad());
    }

    public void setY(int y){
        this.y = y; 
    }

    @Override
    public void caer(){
        if (rebote){
            if (y > yInicial+50){
                setY(y-velocidad);
            } else {
                rebote = false; 
                yInicial += 50;
            }
        } else {
            setY(y+velocidad);
        }
    }

    public void setRebote(boolean rebote){
        this.rebote = rebote; 
    }

    /*
    public void detectarColision(Bandeja bandeja){
        if (getRectanguloInterseccion().intersects(bandeja.getRectanguloInterseccion())){
            rebote = true; 
        }
    }
     */

    @Override
    public void pintar(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, ancho, alto);

        //g.setColor(Color.RED);
        //Rectangle rectangle = getRectanguloInterseccion();
        //g.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    @Override
    public Rectangle getRectanguloInterseccion() {
        return new Rectangle(x, y+alto-2, ancho, 2);
    }
}
