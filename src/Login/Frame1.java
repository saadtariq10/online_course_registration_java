package Login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import Login.Frame2;

public class Frame1 {

	public static void main(String[] args) {
		
		JFrame f=new JFrame("welcome to R.H 210");
		ImageIcon img=new ImageIcon("C:\\Users\\RIFFAQAT ALI\\Desktop\\login\\guifinal1.jpg");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0,0, 0));
		panel.setBounds(781, 220, 456, 533);
		f.add(panel);
		panel.setLayout(null);panel.setVisible(true);
		
		JLabel lblLogin = new JLabel("Login ");
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(Color.CYAN);
		lblLogin.setFont(new Font("Bauhaus 93", Font.BOLD, 94));
		lblLogin.setBounds(20, 11, 426, 121);
		panel.add(lblLogin);
		
		JLabel PleaseLogin = new JLabel("Please sign in with your R.H 210 account");
		PleaseLogin.setHorizontalAlignment(SwingConstants.CENTER);
		PleaseLogin.setForeground(SystemColor.activeCaption);
		PleaseLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		PleaseLogin.setBounds(60, 130, 363, 39);
		panel.add(PleaseLogin);
		
		JLabel l1 = new JLabel("Username");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setForeground(new Color(0, 255, 255));
		l1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		l1.setBounds(20, 192, 183, 39);
		panel.add(l1);
		
		JTextField t = new JTextField();
		t.setFont(new Font("Arial", Font.PLAIN, 20));
		t.setBackground(new Color(220, 220, 220));
		t.setBounds(213, 195, 210, 39);
		panel.add(t);
		//t.setColumns(10);
		
		JLabel l2 = new JLabel("Password");
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setForeground(Color.CYAN);
		l2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		l2.setBounds(20, 294, 183, 39);
		panel.add(l2);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBackground(new Color(220, 220, 220));
		passwordField.setBounds(213, 297, 210, 39);
		panel.add(passwordField);
		
		
		
		JLabel DontHaveAny = new JLabel("Don't have any account?");
		DontHaveAny.setHorizontalAlignment(SwingConstants.RIGHT);
		DontHaveAny.setForeground(SystemColor.activeCaption);
		DontHaveAny.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		DontHaveAny.setBounds(140, 457, 216, 39);
		panel.add(DontHaveAny);

		//sign up panel start from here
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(0, 0,0, 0));
		panel1.setBounds(780, 220, 456, 533);
		f.add(panel1);panel1.setLayout(null);panel1.setVisible(false);
		
		JLabel signup = new JLabel("Sign up");
		signup.setHorizontalAlignment(SwingConstants.CENTER);
		signup.setForeground(Color.CYAN);
		signup.setFont(new Font("Bauhaus 93", Font.BOLD, 94));
		signup.setBounds(20, 11, 426, 121);
		panel1.add(signup);
		
		
		JLabel Pleasesignup = new JLabel("Please sign up with your R.H 210 account");
		Pleasesignup.setHorizontalAlignment(SwingConstants.CENTER);
		Pleasesignup .setForeground(SystemColor.activeCaption);
		Pleasesignup .setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		Pleasesignup .setBounds(60, 130, 363, 39);
		panel1.add(Pleasesignup );
		
		JLabel email = new JLabel("Email");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setForeground(new Color(0, 255, 255));
		email.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		email.setBounds(20, 192, 183, 39);
		panel1.add(email);
		
		JTextField username = new JTextField();
		username.setFont(new Font("Arial", Font.PLAIN, 20));
		username.setBackground(new Color(220, 220, 220));
		username.setBounds(213, 195, 210, 39);
		panel1.add(username);
		username.setColumns(10);
		
		JLabel code = new JLabel("Password");
		code.setHorizontalAlignment(SwingConstants.CENTER);
		code.setForeground(Color.CYAN);
		code.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		code.setBounds(20, 294, 183, 39);
		panel1.add(code);
		
		JTextField password = new JTextField();
		password.setFont(new Font("Arial", Font.PLAIN, 20));
		password.setColumns(10);
		password.setBackground(new Color(220, 220, 220));
		password.setBounds(213, 297, 210, 39);
		panel1.add(password);
		
		JButton btnNewButton = new JButton("Sign in");
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(287, 397, 136, 39);
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				Connection con;
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");//registering driver
					con=DriverManager.getConnection("jdbc:ucanaccess://D:\\logindb.accdb");//creating connection with database
			System.out.println("connection successfully");
			PreparedStatement st=con.prepareStatement("Insert into logintable(un,pass)values(?,?)");
			st.setString(1, username.getText());
			st.setString(2, password.getText());
			int a =st.executeUpdate();
			if(a>0) {
				
				System.out.println("record inserted");
			}
			else {
				System.out.println("recordfail");
			}
			
				}
					catch(Exception es) {
						System.out.println("not connected");
					}

				
				
				panel1.setVisible(false);panel.setVisible(true);
			}
			});
		panel1.add(btnNewButton);
		
		JLabel lblDontHaveAny1 = new JLabel("Already have account.");
		lblDontHaveAny1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDontHaveAny1.setForeground(SystemColor.activeCaption);
		lblDontHaveAny1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblDontHaveAny1.setBounds(140, 457, 216, 39);
		panel1.add(lblDontHaveAny1);
		
		JLabel lblSiginUp1 = new JLabel("Log in");
		lblSiginUp1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSiginUp1.setForeground(new Color(255, 255, 0));
		lblSiginUp1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblSiginUp1.setBounds(349, 457, 74, 39);
		lblSiginUp1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel1.setVisible(false);panel.setVisible(true);
			}
		});
		panel1.add(lblSiginUp1);
		
		//signup panel end
		
		JLabel lblSiginUp = new JLabel("Sign up");
		lblSiginUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel1.setVisible(true);panel.setVisible(false);
			}
		});
		lblSiginUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSiginUp.setForeground(new Color(255, 255, 0));
		lblSiginUp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblSiginUp.setBounds(349, 457, 74, 39);
		panel.add(lblSiginUp);
		JButton bt = new JButton("Log in");
		bt.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 20));
		bt.setBackground(SystemColor.textHighlight);
		bt.setForeground(Color.WHITE);
		bt.setBounds(287, 397, 136, 39);
		panel.add(bt);
		bt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				Connection con = null;
                PreparedStatement pst = null;
                ResultSet rs = null;
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://D:\\logindb.accdb");

                    String query = "select * from logintable where un='" + t.getText() + "' and pass='" + passwordField.getText() + "'" ;
                    pst = con.prepareStatement(query);
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "success");
                        f.dispose();Frame2 f2=new Frame2();
        				Frame2.main(null);
                       
                    } else {
                        JOptionPane.showMessageDialog(null, "Fail");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

				
				
				//f.dispose();
			}
			});
		
//background image ka ha ye
		JLabel l=new JLabel("",img,JLabel.CENTER);
		l.setBounds(0, 0, 1280, 900);
		f.add(l);
		f.setVisible(true);f.setSize(1280, 900);
	}

}
