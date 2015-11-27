import acm.program.*;
import acm.graphics.*;
public class Robot extends GraphicsProgram{
	public void run(){
		Cabeza c = new Cabeza(100,50,100,0);
		PiernaRobot p = new PiernaRobot();
		Tronco t = new Tronco();
		add(c);
		add(p);
		add(t);
	}
}
