import acm.program.*;
import acm.graphics.*;

public class Cabeza extends GCompound{
	public Cabeza(int ancho, int alto, double posX, double posY){
		GRect cabeza = new GRect(ancho,alto);
		GRect boca = new GRect(ancho/2, alto/4);
		GRect cuello = new GRect(ancho/2, alto/8);
		GOval ojo1 = new GOval(ancho/4, ancho/4);
		GOval ojo2 = new GOval(ancho/4, ancho/4);
		
		add(cabeza,posX,posY);
		add(boca,posX + (ancho/4),posY + ((alto/4) * 3));
		add(ojo1,posX + (ancho/4),posY + (alto/4));
		add(ojo2,posX + (ancho/2),posY + (alto/4));
		add(cuello,posX + (ancho/4), posY + (alto));
	}
}
