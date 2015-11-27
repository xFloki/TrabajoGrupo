import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Tronco extends Cabeza{
	
	private static final int ANCHO_PANTALLA = 800;
	private static final int ALTO_PANTALLA = 600;
	private static final int ANCHO_BRAZOIZQ = 40;
	private static final int ALTO_BRAZOIZQ = 160;
	private static final int ANCHO_BRAZODRCHO = 40;
	private static final int ALTO_BRAZODRCHO = 160;
	private static final int ALTO_CUERPO = 100;
	private static final int ANCHO_CUERPO = 120;

	public void run(){
		setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
		
		tronco();
	}
		
		
		public void tronco(){
			
		
		


		GRect brazoIzquierdo = new GRect(ANCHO_BRAZOIZQ,ALTO_BRAZOIZQ);
		add(brazoIzquierdo,ANCHO_PANTALLA / 2 - 40, ALTO_PANTALLA /2);
		
		GRect cuerpo = new GRect(ALTO_CUERPO,ANCHO_CUERPO);
		add(cuerpo,ANCHO_PANTALLA / 2 , ALTO_PANTALLA /2);
		
		GRect brazoDerecho = new GRect(ANCHO_BRAZODRCHO,ALTO_BRAZODRCHO);
		add(brazoDerecho,ANCHO_PANTALLA / 2 + 100, ALTO_PANTALLA /2);
		}
	}