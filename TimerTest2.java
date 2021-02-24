import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;


public class TimerTest2 extends JFrame implements ActionListener
{
	private Stickman steve = new Stickman(100,100);
	private Ball ball = new Ball(200,200,20);
	
	public TimerTest2()
	{
		setTitle("Timers Yay");
		setBounds(100,100,600,400);
		setLayout(null);
		
		add(ball);
		ball.setDx(5);
		ball.setDy(-5);
		
		Timer t1 = new Timer(25,this);
		t1.start();
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) 
	{
		new TimerTest2();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(ball.getX() + ball.getWidth() + 10>= this.getWidth())
			ball.setDx(-5);
		if(ball.getX() <= 0)
			ball.setDx(5);
		if(ball.getY() <= 0)
			ball.setDy(5);
		if(ball.getY() + ball.getHeight() + 25 >= this.getHeight())
			ball.setDy(-5);
		ball.update();
		repaint();
	}

}
