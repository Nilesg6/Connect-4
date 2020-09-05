import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class starter implements InputKeyControl,InputControl
{
		static ConnectFour c4;
		
        public static void main(String args[])
        {
			KeyController kC = new KeyController(Canvas.getInstance(),new starter());
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());

			c4 = new ConnectFour();
			// Ellipse j = new Ellipse(500,500,100,100);
			// j.fill();
			// j.undraw();
			// c4.clear();
		
			// c4.move("4");
		}
	
		public void keyPress(String s)
		{
			// System.out.println(s);
			// if((1<=p)&&(p<=7))
			// {
			// if(s.equals("c"))
			// {
				// c4.clear();
			// }
			// else
				c4.move(s);
			// }	
		}
		
		public void onMouseClick(double x, double y){
			// and/or here
			
			c4.clear();
	
		}
		
		
		
		
}



