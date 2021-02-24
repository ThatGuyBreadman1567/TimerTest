import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;


public class TimerTest1 extends JFrame implements ActionListener
{
	private Stickman steve = new Stickman(100,100);
	private Ball ball = new Ball(200,200,20);
	
	public TimerTest1()
	{
		setTitle("Timers Yay");
		setBounds(100,100,600,400);
		setLayout(null);
		
		add(ball);
		
		Timer t1 = new Timer(25,this);
		t1.start();
		
		addKeyListener(new KeyListener()
		{
			public void keyPressed(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_LEFT)
				{
					ball.setDx(-5);
				}
				else if(e.getKeyCode() == e.VK_RIGHT)
				{
					ball.setDx(5);
				}
				else if(e.getKeyCode() == e.VK_UP)
				{
					ball.setDy(-5);
				}
				else if(e.getKeyCode() == e.VK_DOWN)
				{
					ball.setDy(5);
				}
			}
			public void keyReleased(KeyEvent e) 
			{
				if(e.getKeyCode() == e.VK_LEFT)
				{
					ball.setDx(0);
				}
				else if(e.getKeyCode() == e.VK_RIGHT)
				{
					ball.setDx(0);
				}
				else if(e.getKeyCode() == e.VK_UP)
				{
					ball.setDy(0);
				}
				else if(e.getKeyCode() == e.VK_DOWN)
				{
					ball.setDy(0);
				}
			}
			
			public void keyTyped(KeyEvent e) {
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) 
	{
		new TimerTest1();
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		ball.update();
		repaint();
	}
}
