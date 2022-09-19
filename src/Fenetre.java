import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author steph
 *
 */
public class Fenetre extends JFrame {

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
		this.setVisible(true);
	}

}
