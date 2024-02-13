package car;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReturnCar extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private BufferedImage backgroundImage;
    private JPanel panel;
    private boolean panelVisible = false;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTable table;
    private JTable table_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ReturnCar frame = new ReturnCar();
                    frame.setVisible(true);
                    frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ReturnCar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 600);
        contentPane = new JPanel() {
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
                Customer frame = new Customer();
                frame.setVisible(true);
            }
        });
        newButton.setForeground(Color.WHITE);
        newButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        newButton.setBackground(Color.BLACK);
        newButton.setBounds(46, 144, 111, 23);
        panel.add(newButton);

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
        panel.add(btnRentCar);

        JButton btnReturnCar = new JButton("Cars");
        btnReturnCar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            	Frame1 frame=new Frame1();
            	frame.setVisible(true);
            	
                // Action for returning a car
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
                Login2 frame = new Login2();
                frame.setVisible(true);
            }
        });
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        btnLogout.setBackground(Color.BLACK);
        btnLogout.setBounds(46, 482, 111, 23);
        panel.add(btnLogout);
        
        textField = new JTextField();
        textField.setBounds(134, 78, 99, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Registration");
        lblNewLabel_2_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_1.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_2_1_1.setBounds(134, 103, 91, 26);
        contentPane.add(lblNewLabel_2_1_1);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(134, 134, 99, 20);
        contentPane.add(textField_1);
        
        JLabel lblNewLabel_2 = new JLabel("Customer Name");
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_2.setBounds(134, 162, 121, 26);
        contentPane.add(lblNewLabel_2);
        
        textField_2 = new JTextField();
        textField_2.setBounds(134, 196, 99, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Customer ID");
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(134, 45, 145, 22);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2_1_2_1 = new JLabel("Return Date");
        lblNewLabel_2_1_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_2_1.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_2_1_2_1.setBounds(134, 227, 86, 26);
        contentPane.add(lblNewLabel_2_1_2_1);
        
        JDateChooser dateChooser_1 = new JDateChooser();
        dateChooser_1.setBounds(136, 264, 97, 20);
        contentPane.add(dateChooser_1);
        
        JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Delay");
        lblNewLabel_2_1_2_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_2_1_1.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_2_1_2_1_1.setBounds(134, 295, 86, 26);
        contentPane.add(lblNewLabel_2_1_2_1_1);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(134, 332, 99, 20);
        contentPane.add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(134, 400, 99, 20);
        contentPane.add(textField_4);
        
        JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("Fine");
        lblNewLabel_2_1_2_1_1_1.setBounds(134, 363, 86, 26);
        contentPane.add(lblNewLabel_2_1_2_1_1_1);
        lblNewLabel_2_1_2_1_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_2_1_1_1.setFont(new Font("Forte", Font.PLAIN, 15));
        
        JLabel lblNewLabel_3_1 = new JLabel("Cars on Rent");
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1.setForeground(new Color(255, 204, 51));
        lblNewLabel_3_1.setFont(new Font("Forte", Font.BOLD, 20));
        lblNewLabel_3_1.setBounds(454, 38, 210, 29);
        contentPane.add(lblNewLabel_3_1);
        
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
        table.setBounds(265, 81, 597, 160);
        contentPane.add(table);
        
        JLabel lblNewLabel_3_1_1 = new JLabel("Returned Cars");
        lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1_1.setForeground(new Color(255, 204, 51));
        lblNewLabel_3_1_1.setFont(new Font("Forte", Font.BOLD, 20));
        lblNewLabel_3_1_1.setBounds(454, 255, 210, 29);
        contentPane.add(lblNewLabel_3_1_1);
        
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
        table_1.setBounds(265, 295, 597, 160);
        contentPane.add(table_1);
        
        JButton btnEdit_1_1_1 = new JButton("Print");
        btnEdit_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnEdit_1_1_1.setBounds(524, 482, 86, 30);
        contentPane.add(btnEdit_1_1_1);
        
        JButton btnNewButton = new JButton("Return");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnNewButton.setBounds(136, 455, 74, 23);
        contentPane.add(btnNewButton);

        try {
            backgroundImage = ImageIO.read(new File("C:\\\\Users\\\\sijos\\\\Downloads\\\\wp9045832-4k-black-car-wallpapers.jpg")); // Replace with your image path
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
