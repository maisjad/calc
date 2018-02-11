import javax.swing.*;
public class Main {
	public static void main(String args[]){
		View v=new View();
	Modle m=new Modle();
	Controlar c=new Controlar();
	c.addmodle(m);
	v.addcontrolar(c);
	c.addview(v);
	c.init();
	
c.view.setVisible(true);
c.view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

