import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Tela {

	private JFrame frmCalculadora;
	private JTextField txtField;
	private JButton btnSub;
	private JButton btnMult;
	private JButton btnSoma;
	private JButton btnVirg;
	private JButton btn3;
	private JButton btn6;
	private JButton btn9;
	private JButton btnC;
	private JButton btn0;
	private JButton btn2;
	private JButton btn5;
	private JButton btn8;
	private JButton btnIgual;
	private JButton btn1;
	private JButton btn4;
	private JButton btn7;
	private JButton btnPorc;

	double numero1, numero2, resultado;
	String operacao, operac;
	private JTextField txtCalc;
	private JLabel lblNewLabel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela window = new Tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela() {
		initialize();
	}

	public void visivel() {
		Tela window = new Tela();
		window.frmCalculadora.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setForeground(new Color(128, 128, 128));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 264, 419);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		frmCalculadora.setResizable(false);
		txtField = new JTextField();
		txtField.setToolTipText("tip txt");
		txtField.setForeground(new Color(128, 128, 128));
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial", Font.BOLD, 18));
		txtField.setBounds(10, 38, 230, 39);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnApg = new JButton("<=");
		btnApg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2=Double.parseDouble(txtField.getText());
				if(operacao.equals("+")) {
					resultado=numero1+numero2;
					txtField.setText(String.valueOf(resultado));
					txtCalc.setText(txtCalc.getText() + "=");
				}else if(operacao.equals("-")) {
					resultado=numero1-numero2;
					txtField.setText(String.valueOf(resultado));
					txtCalc.setText(txtCalc.getText() + "=");
				}else if(operacao.equals("x")) {
					resultado=numero1*numero2;
					txtField.setText(String.valueOf(resultado));
					txtCalc.setText(txtCalc.getText() + "=");
				}else if(operacao.equals("÷")) {
					resultado=numero1/numero2;
					txtField.setText(String.valueOf(resultado));
					txtCalc.setText(txtCalc.getText() + "=");
				}
				
			}
		});
		btnIgual.setForeground(Color.GRAY);
		btnIgual.setFont(new Font("Arial", Font.BOLD, 12));
		btnIgual.setBounds(130, 89, 110, 48);
		frmCalculadora.getContentPane().add(btnIgual);
		btnApg.setForeground(new Color(128, 128, 128));
		btnApg.setFont(new Font("Arial", Font.BOLD, 14));
		btnApg.setBounds(10, 88, 50, 48);
		frmCalculadora.getContentPane().add(btnApg);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "-";
				txtCalc.setText(txtCalc.getText()+"-");
			}
		});
		btnSub.setForeground(Color.GRAY);
		btnSub.setFont(new Font("Arial", Font.BOLD, 18));
		btnSub.setBounds(190, 265, 50, 48);
		frmCalculadora.getContentPane().add(btnSub);
		
		JButton btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "÷";
				txtCalc.setText(txtCalc.getText()+"+");
			}
		});
		btnDiv.setForeground(Color.GRAY);
		btnDiv.setFont(new Font("Arial", Font.BOLD, 18));
		btnDiv.setBounds(190, 147, 50, 48);
		frmCalculadora.getContentPane().add(btnDiv);
		
		btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "x";
				txtCalc.setText(txtCalc.getText()+"x");
			}
		});
		btnMult.setForeground(Color.GRAY);
		btnMult.setFont(new Font("Arial", Font.BOLD, 18));
		btnMult.setBounds(190, 206, 50, 48);
		frmCalculadora.getContentPane().add(btnMult);
		
		btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1=Double.parseDouble(txtField.getText());
				txtField.setText("");
				operacao = "+";
				txtCalc.setText(txtCalc.getText()+"+");
			}
		});
		btnSoma.setForeground(Color.GRAY);
		btnSoma.setFont(new Font("Arial", Font.BOLD, 18));
		btnSoma.setBounds(190, 324, 50, 48);
		frmCalculadora.getContentPane().add(btnSoma);
		
		btnVirg = new JButton(".");
		btnVirg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtField.setText(txtField.getText()+btnVirg.getText());
				txtCalc.setText(txtCalc.getText()+btnVirg.getText());
			}
		});
		btnVirg.setForeground(Color.GRAY);
		btnVirg.setFont(new Font("Arial", Font.BOLD, 18));
		btnVirg.setBounds(130, 324, 50, 48);
		frmCalculadora.getContentPane().add(btnVirg);
		
		btnPorc = new JButton("%");
		btnPorc.setForeground(Color.GRAY);
		btnPorc.setFont(new Font("Arial", Font.BOLD, 18));
		btnPorc.setBounds(10, 324, 50, 48);
		frmCalculadora.getContentPane().add(btnPorc);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
				txtCalc.setText("");
			}
		});
		btnC.setForeground(Color.GRAY);
		btnC.setFont(new Font("Arial", Font.BOLD, 18));
		btnC.setBounds(70, 88, 50, 48);
		frmCalculadora.getContentPane().add(btnC);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			txtField.setText(txtField.getText()+btn0.getText());
			}
		});
		btn0.setForeground(Color.GRAY);
		btn0.setFont(new Font("Arial", Font.BOLD, 18));
		btn0.setBounds(70, 324, 50, 48);
		frmCalculadora.getContentPane().add(btn0);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn1.getText());
				txtCalc.setText(txtCalc.getText()+btn1.getText());
			}
		});
		btn1.setForeground(Color.GRAY);
		btn1.setFont(new Font("Arial", Font.BOLD, 18));
		btn1.setBounds(10, 265, 50, 48);
		frmCalculadora.getContentPane().add(btn1);
		
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn2.getText());
				txtCalc.setText(txtCalc.getText()+btn2.getText());
			}
		});
		btn2.setForeground(Color.GRAY);
		btn2.setFont(new Font("Arial", Font.BOLD, 18));
		btn2.setBounds(70, 265, 50, 48);
		frmCalculadora.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn3.getText());
				txtCalc.setText(txtCalc.getText()+btn3.getText());
			}
			
		});
		btn3.setForeground(Color.GRAY);
		btn3.setFont(new Font("Arial", Font.BOLD, 18));
		btn3.setBounds(130, 265, 50, 48);
		frmCalculadora.getContentPane().add(btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn4.getText());
				txtCalc.setText(txtCalc.getText()+btn4.getText());
			}
		});
		btn4.setForeground(Color.GRAY);
		btn4.setFont(new Font("Arial", Font.BOLD, 18));
		btn4.setBounds(10, 206, 50, 48);
		frmCalculadora.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn5.getText());
				txtCalc.setText(txtCalc.getText()+btn5.getText());
			}
		});
		btn5.setForeground(Color.GRAY);
		btn5.setFont(new Font("Arial", Font.BOLD, 18));
		btn5.setBounds(70, 206, 50, 48);
		frmCalculadora.getContentPane().add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn6.getText());
				txtCalc.setText(txtCalc.getText()+btn6.getText());
			}
		});
		btn6.setForeground(Color.GRAY);
		btn6.setFont(new Font("Arial", Font.BOLD, 18));
		btn6.setBounds(130, 206, 50, 48);
		frmCalculadora.getContentPane().add(btn6);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn7.getText());
				txtCalc.setText(txtCalc.getText()+btn7.getText());
			}
		});
		btn7.setForeground(Color.GRAY);
		btn7.setFont(new Font("Arial", Font.BOLD, 18));
		btn7.setBounds(10, 147, 50, 48);
		frmCalculadora.getContentPane().add(btn7);
				
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn8.getText());
				txtCalc.setText(txtCalc.getText()+btn8.getText());
			}
		});
		btn8.setForeground(Color.GRAY);
		btn8.setFont(new Font("Arial", Font.BOLD, 18));
		btn8.setBounds(70, 147, 50, 48);
		frmCalculadora.getContentPane().add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn9.getText());
				txtCalc.setText(txtCalc.getText()+btn9.getText());
			}
		});
		btn9.setForeground(Color.GRAY);
		btn9.setFont(new Font("Arial", Font.BOLD, 18));
		btn9.setBounds(130, 147, 50, 48);
		frmCalculadora.getContentPane().add(btn9);
		
		
		txtCalc = new JTextField();
		txtCalc.setBackground(new Color(240, 240, 240));				
		txtCalc.setToolTipText("tip txt");
		txtCalc.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCalc.setForeground(new Color(192, 192, 192));
		txtCalc.setFont(new Font("Arial", Font.BOLD, 18));
		txtCalc.setColumns(10);
		txtCalc.setBounds(10, 11, 230, 22);
		frmCalculadora.getContentPane().add(txtCalc);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\Imagens\\stable-diffusion-imagem.jpg"));
		lblNewLabel.setBounds(0, 0, 248, 380);
		frmCalculadora.getContentPane().add(lblNewLabel);
		
	}
}
