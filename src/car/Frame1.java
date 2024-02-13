package car;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class Frame1 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private BufferedImage backgroundImage;
    private JButton btnMenu;
    private JPanel newPanel;
    private boolean panelVisible = false;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JLabel lblNewLabel_2_2;
    private JTextField textField_4;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Frame1 frame = new Frame1();
                frame.setVisible(true);
                frame.setResizable(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Frame1() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\sijos\\Downloads\\wp9045832-4k-black-car-wallpapers.jpg"));
    	setBackground(new Color(0, 0, 0));
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
        contentPane.setBackground(new Color(0, 0, 0));
        setContentPane(contentPane);

        try {
            backgroundImage = ImageIO.read(new File("C:\\\\Users\\\\sijos\\\\Downloads\\\\wp9045832-4k-black-car-wallpapers.jpg")); // Replace with your image path
        } catch (Exception e) {
            e.printStackTrace();
        }
        contentPane.setLayout(null);

        btnMenu = new JButton("Menu");
        btnMenu.setBounds(10, 10, 74, 30);
        btnMenu.setHorizontalAlignment(SwingConstants.LEADING);
        btnMenu.setFont(new Font("Forte", Font.BOLD, 14));
        btnMenu.setForeground(new Color(255, 255, 255));
        btnMenu.setBackground(new Color(0, 0, 0));
        contentPane.add(btnMenu);

        newPanel = new JPanel();
        newPanel.setBounds(-15, 0, 194, 580);
        newPanel.setBackground(Color.BLACK);
        newPanel.setVisible(false);
        contentPane.add(newPanel);
        newPanel.setLayout(null);
        
        JButton newButton = new JButton("Customer");
        newButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Customer frame=new Customer();
        		frame.setVisible(true);
        	}
        });
        newButton.setForeground(new Color(255, 255, 255));
        newButton.setBackground(new Color(0, 0, 0));
        newButton.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 15));
        newButton.setBounds(39, 114, 111, 23);
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
        btnRentCar.setBounds(39, 181, 111, 23);
        newPanel.add(btnRentCar);
        
        JButton btnReturnCar = new JButton("Return Car");
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
        btnReturnCar.setBounds(39, 251, 111, 23);
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
        btnLogout.setBounds(39, 506, 111, 23);
        newPanel.add(btnLogout);
        


        JLabel lblNewLabel = new JLabel("Manage Cars");
        lblNewLabel.setBounds(363, 9, 210, 29);
        lblNewLabel.setForeground(new Color(255, 204, 51));
        lblNewLabel.setFont(new Font("Forte", Font.BOLD, 24));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("\tRegistration Number");
        lblNewLabel_1.setBounds(148, 53, 145, 22);
        lblNewLabel_1.setFont(new Font("Forte", Font.PLAIN, 15));
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        contentPane.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setBounds(148, 76, 130, 20);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Brand");
        lblNewLabel_2.setBounds(349, 51, 74, 26);
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setFont(new Font("Forte", Font.PLAIN, 15));
        contentPane.add(lblNewLabel_2);
        
        textField_1 = new JTextField();
        textField_1.setBounds(298, 76, 139, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(455, 76, 139, 20);
        textField_2.setColumns(10);
        contentPane.add(textField_2);
        
        JLabel lblNewLabel_2_1 = new JLabel("Model");
        lblNewLabel_2_1.setBounds(492, 51, 74, 26);
        lblNewLabel_2_1.setForeground(Color.WHITE);
        lblNewLabel_2_1.setFont(new Font("Forte", Font.PLAIN, 15));
        contentPane.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Status");
        lblNewLabel_2_1_1.setBounds(625, 51, 57, 26);
        lblNewLabel_2_1_1.setForeground(Color.WHITE);
        lblNewLabel_2_1_1.setFont(new Font("Forte", Font.PLAIN, 15));
        contentPane.add(lblNewLabel_2_1_1);
        
        lblNewLabel_2_2 = new JLabel("Price");
        lblNewLabel_2_2.setBounds(751, 51, 74, 26);
        lblNewLabel_2_2.setForeground(Color.WHITE);
        lblNewLabel_2_2.setFont(new Font("Forte", Font.PLAIN, 15));
        contentPane.add(lblNewLabel_2_2);
        
        textField_4 = new JTextField();
        textField_4.setBounds(707, 76, 139, 20);
        textField_4.setColumns(10);
        contentPane.add(textField_4);
        
        JButton btnNewButton = new JButton("Save");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 0, 0));
        btnNewButton.setBounds(204, 117, 74, 30);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnNewButton);
        
        JButton btnEdit = new JButton("Edit");
        btnEdit.setBackground(new Color(0, 0, 0));
        btnEdit.setForeground(new Color(255, 255, 255));
        btnEdit.setBounds(363, 117, 74, 30);
        btnEdit.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnEdit);
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.setForeground(new Color(255, 255, 255));
        btnDelete.setBackground(new Color(0, 0, 0));
        btnDelete.setBounds(511, 117, 90, 30);
        btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnDelete);
        
        JButton btnReset = new JButton("Reset");
        btnReset.setForeground(new Color(255, 255, 255));
        btnReset.setBackground(new Color(0, 0, 0));
        btnReset.setBounds(666, 117, 90, 30);
        btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnReset);
        
        JLabel lblNewLabel_3 = new JLabel("Cars List");
        lblNewLabel_3.setBounds(349, 182, 210, 29);
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setForeground(new Color(255, 204, 51));
        lblNewLabel_3.setFont(new Font("Forte", Font.BOLD, 20));
        contentPane.add(lblNewLabel_3);
        
        table = new JTable();
        table.setBounds(131, 233, 689, 160);
        table.setBackground(SystemColor.control);
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{
                        {"", "", "", null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, ""},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                },
                new String[]{"Customer ID", "Customer Name", "Address", "Price"}
        );
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
        		"Customer ID", "Customer Name", "Address", "Price"
        	}
        ));
        table.getColumnModel().getColumn(1).setPreferredWidth(101);
        table.getColumnModel().getColumn(2).setPreferredWidth(183);
        table.setFont(new Font("Tahoma", Font.BOLD, 18));
        table.setForeground(new Color(0, 0, 0));
        contentPane.add(table);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(614, 76, 70, 20);
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Available", "Booked"}));
        contentPane.add(comboBox);

        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelVisible = !panelVisible;
                newPanel.setVisible(panelVisible);
                newButton.setVisible(panelVisible);
            }
        });
    }
}
