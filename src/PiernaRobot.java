import acm.program.*;
import acm.graphics.*;

public class PiernaRobot extends Tronco  {
	
	private static int ANCHO_PIERNA = 50 ;
	private static int LARGO_PIERNA = 150 ;
	
	private static int ANCHO_PIE = 75 ;
	private static int ALTO_PIE = 25 ;
	
	public void run(){
		piernas();
		pies();
	}
	
	public void piernas(){

		GRect piernaIzquierda = new GRect(ANCHO_PIERNA,LARGO_PIERNA);
		GRect piernaDerecha = new GRect(ANCHO_PIERNA,LARGO_PIERNA);
		
		
		add(piernaIzquierda,100,0);
		add(piernaDerecha,155,0);
	}
	
	public void pies(){
		GRect pieIzquierdo = new GRect(ANCHO_PIE,ALTO_PIE);
		GRect pieDerecho = new GRect(ANCHO_PIE,ALTO_PIE);
		
		add(pieIzquierdo, 155 ,150);
		add(pieDerecho,75,150);
	}
	
	public void legs(){
		piernas();
		pies();
	}
	

}
