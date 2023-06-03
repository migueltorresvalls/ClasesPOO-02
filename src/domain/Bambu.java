package domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import ui.Juego;

public class Bambu extends ObjetoCayendo{
    
    private static final int Y = 30;

    public Bambu(){
        super(Generador.generaX(0, Juego.ANCHO-30), Y, 30, 30, Color.GREEN, 2);
    }

    @Override
    public void caer(){
        setY(y+velocidad);
    }

    @Override
    public void pintar(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, ancho, alto);

        // Para pintar rectangulo interseccion
        //g.setColor(Color.RED);
        //Rectangle rectangle = getRectanguloInterseccion();
        //g.drawRect(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
    }

    @Override
    public Rectangle getRectanguloInterseccion() {
        return new Rectangle(x, y+alto-2, ancho, 2);
    }
}
