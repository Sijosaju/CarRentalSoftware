package car;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Customer extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private BufferedImage backgroundImage;
    private JPanel newPanel;
    private boolean panelVisible = false;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTable table;
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Customer frame = new Customer();
                frame.setVisible(true);
                frame.setResizable(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Customer() {
    	setAlwaysOnTop(true);
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
        setContentPane(contentPane);
        
        JButton btnMenu = new JButton("Menu");
        btnMenu.setBounds(23, 11, 74, 30);
        btnMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 panelVisible = !panelVisible;
                 newPanel.setVisible(panelVisible);
        	}
        });
        contentPane.setLayout(null);
        
        btnMenu.setHorizontalAlignment(SwingConstants.LEADING);
        btnMenu.setForeground(new Color(255, 255, 255));
        btnMenu.setFont(new Font("Forte", Font.BOLD, 14));
        btnMenu.setBackground(new Color(0, 0, 0));
        contentPane.add(btnMenu);
        
        newPanel = new JPanel();
        newPanel.setBounds(-15, 0, 194, 580);
        newPanel.setBackground(Color.BLACK);
        newPanel.setVisible(false);
        contentPane.add(newPanel);
        newPanel.setLayout(null);
       
        
        JButton newButton = new JButton("Cars");
        newButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Frame1 frame=new Frame1();
        		frame.setVisible(true);
        	}
        });
        newButton.setForeground(Color.WHITE);
        newButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        newButton.setBackground(Color.BLACK);
        newButton.setBounds(46, 144, 111, 23);
        newPanel.add(newButton);
        
        JButton btnRentCar = new JButton("Rent Car");
        btnRentCar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		RentCar frame=new RentCar();
        		frame.setVisible(true);
        	}
        });
        btnRentCar.setForeground(Color.WHITE);
        btnRentCar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        btnRentCar.setBackground(Color.BLACK);
        btnRentCar.setBounds(46, 206, 111, 23);
        newPanel.add(btnRentCar);
        
        JButton btnReturnCar = new JButton("Return Car\r\n");
        btnReturnCar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		ReturnCar frame =new ReturnCar();
        		frame.setVisible(true);
        	}
        });
        btnReturnCar.setForeground(Color.WHITE);
        btnReturnCar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        btnReturnCar.setBackground(Color.BLACK);
        btnReturnCar.setBounds(46, 264, 111, 23);
        newPanel.add(btnReturnCar);
        
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
        newPanel.add(btnLogout);
        
        JLabel lblNewLabel_1 = new JLabel("Customer ID");
        lblNewLabel_1.setBounds(148, 38, 145, 22);
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Forte", Font.PLAIN, 15));
        contentPane.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setBounds(148, 71, 130, 20);
        textField.setColumns(10);
        contentPane.add(textField);
        
        JLabel lblNewLabel_2 = new JLabel("Customer Name");
        lblNewLabel_2.setBounds(335, 36, 121, 26);
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setFont(new Font("Forte", Font.PLAIN, 15));
        contentPane.add(lblNewLabel_2);
        
        textField_1 = new JTextField();
        textField_1.setBounds(328, 71, 139, 20);
        textField_1.setColumns(10);
        contentPane.add(textField_1);
        
        JLabel lblNewLabel_2_1 = new JLabel("Address");
        lblNewLabel_2_1.setBounds(534, 36, 74, 26);
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setFont(new Font("Forte", Font.PLAIN, 15));
        contentPane.add(lblNewLabel_2_1);
        
        textField_2 = new JTextField();
        textField_2.setBounds(519, 71, 139, 20);
        textField_2.setColumns(10);
        contentPane.add(textField_2);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Phone");
        lblNewLabel_2_1_1.setBounds(745, 36, 74, 26);
        lblNewLabel_2_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_1.setFont(new Font("Forte", Font.PLAIN, 15));
        contentPane.add(lblNewLabel_2_1_1);
        
        textField_3 = new JTextField();
        textField_3.setBounds(706, 71, 139, 20);
        textField_3.setColumns(10);
        contentPane.add(textField_3);
        
        JButton btnNewButton = new JButton("Save");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 0, 0));
        btnNewButton.setBounds(172, 120, 74, 30);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnNewButton);
        
        JButton btnEdit = new JButton("Edit");
        btnEdit.setForeground(new Color(255, 255, 255));
        btnEdit.setBackground(new Color(0, 0, 0));
        btnEdit.setBounds(366, 120, 74, 30);
        btnEdit.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnEdit);
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.setForeground(new Color(255, 255, 255));
        btnDelete.setBackground(new Color(0, 0, 0));
        btnDelete.setBounds(545, 120, 93, 30);
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnDelete);
        
        JButton btnEdit_1_1 = new JButton("Reset");
        btnEdit_1_1.setForeground(new Color(255, 255, 255));
        btnEdit_1_1.setBackground(new Color(0, 0, 0));
        btnEdit_1_1.setBounds(733, 120, 86, 30);
        btnEdit_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnEdit_1_1);
        
        JLabel lblNewLabel_3 = new JLabel("Customers List");
        lblNewLabel_3.setBounds(336, 181, 210, 29);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setForeground(new Color(255, 204, 51));
        lblNewLabel_3.setFont(new Font("Forte", Font.BOLD, 20));
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
        table.setBackground(new Color(255, 255, 255));
        table.setBounds(148, 238, 597, 160);
        contentPane.add(table);

        try {
            backgroundImage = ImageIO.read(new File("C:\\Users\\sijos\\Downloads\\wp9045832-4k-black-car-wallpapers.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
