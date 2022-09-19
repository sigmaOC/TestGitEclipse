import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

		this.bouton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("------------------");
				System.out.println("-     bouton     -");
				System.out.println("------------------");

				getContentPane().remove(bouton);
				repaint();
				pack();

			}
		});

		this.setVisible(true);
		this.pack();
	}

}
