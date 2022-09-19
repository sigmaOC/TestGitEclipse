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
		this.vue1 = new VueFirst();

		this.getContentPane().add(vue1);

		this.setVisible(true);
		this.pack();
	}

}
