import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author steph
 *
 */
public class Fenetre extends JFrame {

	public VueFirst vue1;
	public JButton bouton;

	/**
	 * 
	 */
	public Fenetre() {
		super("Test GitHub Eclipse");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

	}

	public void init() {
		this.setLayout(new BorderLayout());
		this.vue1 = new VueFirst();
		this.bouton = new JButton("OK");

		this.getContentPane().add(vue1, BorderLayout.CENTER);
		this.getContentPane().add(bouton, BorderLayout.SOUTH);

		this.setVisible(true);
		this.pack();
	}

}
