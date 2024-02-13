package car;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RentCar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private BufferedImage backgroundImage;
    private JPanel panel;
    private boolean panelVisible = false;
    private JTextField textField;
    private JTextField textField_4;
    private JTextField textField_1;
    private JTable table;
    private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RentCar frame = new RentCar();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RentCar() {
		setBackground(new Color(0, 0, 0));
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 600);
        contentPane = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };
        contentPane.setBackground(new Color(64, 0, 64));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        
        JButton btnMenu = new JButton("Menu");
        btnMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 panelVisible = !panelVisible;
                 panel.setVisible(panelVisible);
        	}
        });
        btnMenu.setHorizontalAlignment(SwingConstants.LEADING);
        btnMenu.setForeground(new Color(255, 255, 255));
        btnMenu.setFont(new Font("Forte", Font.BOLD, 14));
        btnMenu.setBackground(new Color(0, 0, 0));
        btnMenu.setBounds(10, 11, 74, 30);
        contentPane.add(btnMenu);
        panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(false);
        panel.setBackground(Color.BLACK);
        panel.setBounds(-15, 0, 194, 582);
        contentPane.add(panel);
        
        JButton newButton = new JButton("Customer");
        newButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Customer frame=new Customer();
        		frame.setVisible(true);
        	}
        });
        newButton.setForeground(Color.WHITE);
        newButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        newButton.setBackground(Color.BLACK);
        newButton.setBounds(46, 144, 111, 23);
        panel.add(newButton);
        
        JButton btnRentCar = new JButton("Cars");
        btnRentCar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Frame1 frame=new Frame1();
        		frame.setVisible(true);
        	}
        });
        btnRentCar.setForeground(Color.WHITE);
        btnRentCar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        btnRentCar.setBackground(Color.BLACK);
        btnRentCar.setBounds(46, 206, 111, 23);
        panel.add(btnRentCar);
        
        JButton btnReturnCar = new JButton("Return Car\r\n");
        btnReturnCar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		ReturnCar frame=new ReturnCar();
        		frame.setVisible(true);
        	}
        	
        });
        btnReturnCar.setForeground(Color.WHITE);
        btnReturnCar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        btnReturnCar.setBackground(Color.BLACK);
        btnReturnCar.setBounds(46, 264, 111, 23);
        panel.add(btnReturnCar);
        
        JButton btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Login2 frame=new Login2();
        		frame.setVisible(true);
        	}
        });
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        btnLogout.setBackground(Color.BLACK);
        btnLogout.setBounds(46, 482, 111, 23);
        panel.add(btnLogout);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(699, 52, 109, 20);
        contentPane.add(textField_4);
        
        textField = new JTextField();
        textField.setBounds(137, 52, 99, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_2_1 = new JLabel("Rent ID");
        lblNewLabel_2_1.setBounds(162, 30, 74, 26);
        contentPane.add(lblNewLabel_2_1);
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setFont(new Font("Forte", Font.PLAIN, 15));
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Registration");
        lblNewLabel_2_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_1.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_2_1_1.setBounds(254, 30, 91, 26);
        contentPane.add(lblNewLabel_2_1_1);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(246, 52, 99, 20);
        contentPane.add(textField_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(355, 52, 114, 20);
        contentPane.add(comboBox);
        
        JLabel lblNewLabel_2_1_1_1 = new JLabel("Customer Name");
        lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_1_1.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_2_1_1_1.setBounds(360, 30, 109, 26);
        contentPane.add(lblNewLabel_2_1_1_1);
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(479, 52, 103, 20);
        contentPane.add(dateChooser);
        
        JLabel lblNewLabel_2_1_2 = new JLabel("Rent Date");
        lblNewLabel_2_1_2.setForeground(Color.WHITE);
        lblNewLabel_2_1_2.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_2_1_2.setBounds(497, 30, 74, 26);
        contentPane.add(lblNewLabel_2_1_2);
        
        JDateChooser dateChooser_1 = new JDateChooser();
        dateChooser_1.setBounds(592, 52, 97, 20);
        contentPane.add(dateChooser_1);
        
        JLabel lblNewLabel_2_1_2_1 = new JLabel("Return Date");
        lblNewLabel_2_1_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_2_1.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_2_1_2_1.setBounds(603, 30, 86, 26);
        contentPane.add(lblNewLabel_2_1_2_1);
        
        JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Fees");
        lblNewLabel_2_1_2_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_2_1_1.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_2_1_2_1_1.setBounds(733, 30, 53, 26);
        contentPane.add(lblNewLabel_2_1_2_1_1);
        
        JButton btnNewButton = new JButton("Save");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 0, 0));
        btnNewButton.setBounds(162, 83, 74, 30);
        contentPane.add(btnNewButton);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        JButton btnEdit = new JButton("Edit");
        btnEdit.setForeground(new Color(255, 255, 255));
        btnEdit.setBackground(new Color(0, 0, 0));
        btnEdit.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnEdit.setBounds(329, 83, 74, 30);
        contentPane.add(btnEdit);
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.setForeground(new Color(255, 255, 255));
        btnDelete.setBackground(new Color(0, 0, 0));
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnDelete.setBounds(497, 83, 93, 30);
        contentPane.add(btnDelete);
        
        JButton btnEdit_1_1 = new JButton("Reset");
        btnEdit_1_1.setForeground(new Color(255, 255, 255));
        btnEdit_1_1.setBackground(new Color(0, 0, 0));
        btnEdit_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnEdit_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnEdit_1_1.setBounds(676, 83, 86, 30);
        contentPane.add(btnEdit_1_1);
        
        JLabel lblNewLabel_3 = new JLabel("Cars List");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setForeground(new Color(255, 204, 51));
        lblNewLabel_3.setFont(new Font("Forte", Font.BOLD, 20));
        lblNewLabel_3.setBounds(339, 124, 210, 29);
        contentPane.add(lblNewLabel_3);
        
        table = new JTable();
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        	},
        	new String[] {
        		"New column", "New column", "New column", "New column"
        	}
        ));
        table.setBackground(Color.WHITE);
        table.setBounds(162, 152, 597, 160);
        contentPane.add(table);
        
        JLabel lblNewLabel_3_1 = new JLabel("Cars on Rent");
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1.setForeground(new Color(255, 204, 51));
        lblNewLabel_3_1.setFont(new Font("Forte", Font.BOLD, 20));
        lblNewLabel_3_1.setBounds(341, 317, 210, 29);
        contentPane.add(lblNewLabel_3_1);
        
        table_1 = new JTable();
        table_1.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        		{null, null, null, null},
        	},
        	new String[] {
        		"New column", "New column", "New column", "New column"
        	}
        ));
        table_1.setBackground(Color.WHITE);
        table_1.setBounds(162, 357, 597, 160);
        contentPane.add(table_1);
        
        JButton btnEdit_1_1_1 = new JButton("Print");
        btnEdit_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnEdit_1_1_1.setBounds(411, 524, 86, 30);
        contentPane.add(btnEdit_1_1_1);

        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\sijos\\Downloads\\wp9045832-4k-black-car-wallpapers.jpg")); // Replace with your image path
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
