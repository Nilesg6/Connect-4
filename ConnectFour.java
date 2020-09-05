import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class ConnectFour //implements InputKeyControl//, InputControl
{
		Ellipse[][] spaces;
		Ellipse[][] pieces;
		boolean p1 = true;
		Text turn;
		
		int w = 50;	// width of circle
		int g = 10; // gap between spaces
	
        public ConnectFour()
        {
			Rectangle bg = new Rectangle(0,0,7*w+7*g+g,6*w+6*g+g);
			bg.fill();
			spaces = new Ellipse[7][6];
			pieces = new Ellipse[7][6];
			
			for(int r = 0; r < spaces.length; r++)
			{
				for(int c = 0; c < spaces[0].length; c++)
				{
					spaces[r][c] = new Ellipse((r*w+r*g)+g,(c*w+c*g)+g,w,w);
					spaces[r][c].setColor(Color.WHITE);
					spaces[r][c].fill();
				}
			}
			
			Text[] t = new Text[spaces.length];
			for(int r = 0; r < t.length; r++)
			{
				t[r] = new Text((r*w+r*g)+g+30,390,r+1+" ");
				t[r].grow(20,20);
				t[r].draw();
			}
			
			turn = new Text(190,450,"Player 1's Turn");	
			turn.grow(100,50);
			turn.draw();
		}
		
		public void move(String s)
		{
			int p = Integer.parseInt(s) - 1;
	
			for(int i = pieces[0].length-1; i >= 0; i--)
			{
				if(pieces[p][i] == null)
				{
					int r = i;
					pieces[p][r] = new Ellipse((p*w+p*g)+g,(r*w+r*g)+g,w,w);
					
					if(p1 == true)
					{
						pieces[p][r].setColor(Color.GREEN);
						turn.setText("Player 2's Turn");
					}
					
					else
					{
						pieces[p][r].setColor(Color.YELLOW);
						turn.setText("Player 1's Turn");

					}
					
					p1 = !p1;
					pieces[p][r].fill();
					break;
				}
			}		
		}
		
		public void clear()
		{
			// fill();
			for(int r = 0; r < pieces.length; r++)
			{
				for(int c = 0; c < pieces[0].length; c++)
				{
					if(pieces[r][c]!=null);
					{
						pieces[r][c].undraw();
						pieces[r][c] = null;
						
					}
				}
			}
		}
		
		// private void fill()
		// {
			
			// for(int r = 0; r < pieces.length; r++)
			// {
				// for(int c = 0; c < pieces[0].length; c++)
				// {
					// if(pieces[r][c]!=null);
					// {
						// pieces[r][c] = new Ellipse((r*w+r*g)+g,(c*w+c*g)+g,w,w);
					// }
				// }
			// }
		// }
}