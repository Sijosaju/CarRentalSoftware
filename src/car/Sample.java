package car;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class Sample extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample frame = new Sample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sample() {
		setBackground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 626);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel newPanel = new JPanel();
		newPanel.setLayout(null);
		newPanel.setBackground(Color.BLACK);
		newPanel.setBounds(10, 11, 194, 582);
		contentPane.add(newPanel);
		
		JButton newButton = new JButton("Customer");
		newButton.setForeground(Color.WHITE);
		newButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		newButton.setBackground(Color.BLACK);
		newButton.setBounds(46, 144, 111, 23);
		newPanel.add(newButton);
		
		JButton btnRentCar = new JButton("Rent Car");
		btnRentCar.setForeground(Color.WHITE);
		btnRentCar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		btnRentCar.setBackground(Color.BLACK);
		btnRentCar.setBounds(46, 206, 111, 23);
		newPanel.add(btnRentCar);
		
		JButton btnReturnCar = new JButton("Return Car\r\n");
		btnReturnCar.setForeground(Color.WHITE);
		btnReturnCar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		btnReturnCar.setBackground(Color.BLACK);
		btnReturnCar.setBounds(46, 264, 111, 23);
		newPanel.add(btnReturnCar);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
		btnLogout.setBackground(Color.BLACK);
		btnLogout.setBounds(46, 482, 111, 23);
		newPanel.add(btnLogout);
		
		JLabel lblNewLabel_1 = new JLabel("\tRegistration Number");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Forte", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(155, 44, 145, 22);
		contentPane.add(lblNewLabel_1);
	}
}
