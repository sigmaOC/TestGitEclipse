import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author steph
 *
 */
public class VueFirst extends JPanel {

	/**
	 * 
	 */
	public VueFirst() {
		super();
		this.setPreferredSize(new Dimension(250, 250));
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.lightGray);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());

		int diam = 30;
		int espace = 10;
		int deltaX = (this.getWidth() - 5 * diam - 4 * espace) / 2;
		int deltaY = (this.getHeight() - diam) / 2;

		for (int i = 0; i < 5; i++) {
			g.setColor(Color.black);
			g.drawOval(deltaX + (espace + diam) * i, deltaY, diam, diam);

			g.setColor(Color.yellow);
			g.fillOval(deltaX + (espace + diam) * i, deltaY, diam, diam);

			g.setColor(Color.red);
			g.fillOval(deltaX + (espace + diam) * i + 5, deltaY + 5, diam - 10, diam - 10);

		}

	}

}
