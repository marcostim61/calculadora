import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tela2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela2 window = new tela2();
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
	public tela2() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela tel = new Tela();
				tel.visivel();
				frame.dispose();
			}
		});
		btnIniciar.setBounds(61, 38, 89, 23);
		frame.getContentPane().add(btnIniciar);
		
		JButton btnInstrues = new JButton("Instruções");
		btnInstrues.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela3 tel = new tela3();
				tel.visivel();
				frame.dispose();
			}
		});
		btnInstrues.setBounds(61, 93, 89, 23);
		frame.getContentPane().add(btnInstrues);
		
		JButton btnFeedback = new JButton("Feedback");
		btnFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela4 tel = new tela4();
				tel.visivel();
				frame.dispose();
			}
			
		});
		btnFeedback.setBounds(61, 149, 89, 23);
		frame.getContentPane().add(btnFeedback);
	}
}
