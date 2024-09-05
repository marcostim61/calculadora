import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.DropMode;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.Font;

public class tela3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela3 window = new tela3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela3() {
		initialize();
	}
	public void visivel() {
		tela3 window = new tela3();
		window.frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane txtpnInstruesdigiteUm = new JTextPane();
		txtpnInstruesdigiteUm.setBackground(new Color(240, 240, 240));
		txtpnInstruesdigiteUm.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtpnInstruesdigiteUm.setText("Instruções: \r\nDigite um numero\r\nA operação matematica desejada\r\nDepois digite o outro e pressione =");
		txtpnInstruesdigiteUm.setBounds(10, 11, 375, 160);
		frame.getContentPane().add(txtpnInstruesdigiteUm);
	}
}
