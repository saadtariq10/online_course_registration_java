package Login;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

import net.proteanit.sql.DbUtils;

public class Frame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f3=new JFrame("welcome to R.H 210");
		ImageIcon img=new ImageIcon("C:\\Users\\RIFFAQAT ALI\\Desktop\\login\\frame3a.jpg");
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0,0, 0));
		panel.setBounds(0, 0, 1264, 821);
		f3.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel titlepanel = new JPanel();
		titlepanel .setBackground(new Color(0, 0,0, 0));
		panel.add(titlepanel , BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Students Enrolled list");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 45));
		titlepanel .add(lblNewLabel);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(0, 0,0, 0));
		panel.add(footer, BorderLayout.SOUTH);
		footer.setLayout(new FlowLayout(FlowLayout.CENTER, 180, 00));
		
		JButton btnNewButton_1 = new JButton("Add new Course");
		btnNewButton_1.setForeground(new Color(216, 250, 8));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setBackground(new Color(44, 62, 80));
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnNewButton_1.	addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				 f3.dispose();Frame2 f2=new Frame2();
 				Frame2.main(null);
			}
		});
		footer.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Thanks for choosing us");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Disorder", Font.BOLD | Font.ITALIC, 30));
		footer.add(lblNewLabel_1);
		
		JButton btnNewButton_1_1 = new JButton("Finsh");
		btnNewButton_1_1.setForeground(new Color(216, 250, 8));
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton_1_1.setBackground(new Color(44, 62, 80));
		btnNewButton_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		btnNewButton_1_1.	addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				 f3.dispose()
				 ;
 				
			}
		});
		footer.add(btnNewButton_1_1);
		
		JPanel p1 = new JPanel();
		panel.add(p1, BorderLayout.CENTER);
		p1.setBackground(new Color(0, 0,0, 0));
		p1.setLayout(null);
		JButton b1 = new JButton("Search by Name");
		b1.setForeground(new Color(216, 250, 8));
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setBackground(new Color(44, 62, 80));
		b1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		JTextField t1 = new JTextField();
		JButton b2 = new JButton("Display List ");
		b2.setForeground(new Color(216, 250, 8));
		b2.setHorizontalAlignment(SwingConstants.CENTER);
		b2.setBackground(new Color(44, 62, 80));
		b2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		b1.setBounds(38, 98, 229, 43);
		b2.setBounds(1017, 98, 203, 43);
		t1.setBounds(293, 98, 172, 43);
	
		
		p1.add(b1);
		p1.add(t1);
		p1.add(b2);
		JTable t = new JTable();
		t.setBackground(Color.LIGHT_GRAY);
		JScrollPane scrollPane = new JScrollPane();
	
		
		scrollPane.setBounds(38, 194, 1182, 532);
		p1.add(scrollPane);
		
			
				
				scrollPane.setViewportView(t);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

                Connection con = null;
                PreparedStatement pst = null;
                ResultSet rs = null;
                
                try {
                		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	                    con = DriverManager.getConnection("jdbc:ucanaccess://D:\\userdata.accdb");
	                    String query = "select * from usertable";
	                    pst = con.prepareStatement(query);
	                    rs = pst.executeQuery();
	                    t.setModel(DbUtils.resultSetToTableModel(rs));
                }   
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
			
			}
		});

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Connection con = null;
	                PreparedStatement pst = null;
	                ResultSet rs = null;
	                Boolean data = false;
	                try {
	                		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		                    con = DriverManager.getConnection("jdbc:ucanaccess:///D:\\userdata.accdb");
		                    String query = "select * from usertable where sn=?";
		                    pst = con.prepareStatement(query);
		                    pst.setString(1,t1.getText() );
		                    rs = pst.executeQuery();
		                    if (!rs.isBeforeFirst() ) {    
		                    	JOptionPane.showMessageDialog(null, "No Record Found");
		                    	t1.setText("");
		                    }
		                    else {
	                    	t.setModel(DbUtils.resultSetToTableModel(rs));
	                    	   t1.setText("");
		                         }
		                    }
 
	                catch (Exception ex) {
	                    JOptionPane.showMessageDialog(null, ex.getMessage());
	                }
				
			}
		});
		
		
		
		
		
		JLabel l=new JLabel("",img,JLabel.CENTER);
		l.setBounds(0, 0, 1280, 860);
		f3.add(l);
		f3.setVisible(true);f3.setSize(1280, 860);
	}

}
