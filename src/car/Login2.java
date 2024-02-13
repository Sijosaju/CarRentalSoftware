package car;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login2 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField t1;
    private JPasswordField p;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Login2 frame = new Login2();
                frame.setVisible(true);
                frame.setResizable(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Login2() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 600);
        contentPane = new JPanel();
        contentPane.setBackground(UIManager.getColor("Button.focus"));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(UIManager.getColor("Button.focus"));
        panel.setBounds(0, 0, 424, 565);
        contentPane.add(panel);

        // Load and display the image in the left panel
        try {
            BufferedImage img = ImageIO.read(new File("C:\\Users\\sijos\\Downloads\\pxfuel (1).jpg"));
            Image resizedImg = img.getScaledInstance(panel.getWidth(), panel.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(resizedImg);
            JLabel label = new JLabel(icon);
            panel.setLayout(new BorderLayout());
            panel.add(label, BorderLayout.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
        }

        JPanel rightPanel = new JPanel(); // Create the right panel
        rightPanel.setForeground(new Color(0, 0, 128));
        rightPanel.setBackground(Color.BLACK); // Set background color to black
        rightPanel.setBounds(424, 0, 424, 565); // Position it on the right side
        contentPane.add(rightPanel); // Add the right panel to the contentPane
        rightPanel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 24));
        lblNewLabel.setForeground(new Color(255, 255, 0));
        lblNewLabel.setBounds(22, 111, 129, 46);
        rightPanel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("username");
        lblNewLabel_1.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
        lblNewLabel_1.setForeground(new Color(255, 255, 0));
        lblNewLabel_1.setBounds(22, 192, 89, 25);
        rightPanel.add(lblNewLabel_1);
        
        t1 = new JTextField();
        t1.setBounds(140, 184, 163, 33);
        rightPanel.add(t1);
        t1.setColumns(10);
        
        JLabel lblPassword = new JLabel("password");
        lblPassword.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 20));
        lblPassword.setForeground(new Color(255, 255, 0));
        lblPassword.setBounds(22, 276, 89, 33);
        rightPanel.add(lblPassword);
        
        p = new JPasswordField();
        p.setBounds(140, 276, 163, 33);
        rightPanel.add(p);
        
        JButton b1 = new JButton("Login");
        b1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		String username=t1.getText();
	    		char[] passwordChars = p.getPassword();
	            String password = new String(passwordChars);
	    		if(username.equals("admin")&&password.equals("admin"))
	    		{
	    			dispose();
	    			Frame1 frame=new Frame1();
	    			frame.setVisible(true);
	    	    }
	    		else
	    		{
	    			JOptionPane.showMessageDialog(Login2.this,"Incorrect password or username");	
	    		}
        	}
        });
        
        b1.setFont(new Font("Tahoma", Font.BOLD, 11));
        b1.setBackground(new Color(0, 128, 0));
        b1.setBounds(132, 364, 89, 33);
        rightPanel.add(b1);
        
        JButton b2 = new JButton("Clear");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 t1.setText("");
	    		 p.setText("");
			}
		});
        b2.setFont(new Font("Tahoma", Font.BOLD, 11));
        b2.setBackground(new Color(0, 128, 0));
        b2.setBounds(221, 364, 89, 33);
        rightPanel.add(b2);
    }
}
