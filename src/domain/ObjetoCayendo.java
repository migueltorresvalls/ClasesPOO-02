package domain;

import java.awt.Color;

public abstract class ObjetoCayendo extends ObjetoJuego {

    public static final int AUMENTO_PIXELES = 10; 

    protected int yInicial; 
    protected int velocidad; 

    public ObjetoCayendo(int x, int y, int alto, int ancho, Color color, int velocidad) {
        super(x, 0, alto, ancho, color);
        this.velocidad = velocidad; 

        yInicial = y; 
        setY(y);
    }    

    public int getYInicial(){
        return yInicial;
    }

    public abstract void caer();
}
