package Login;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.*;
import Login.Frame3;

public class Frame2 {

	public static void main(String[] args) {
		JFrame f2=new JFrame("welcome to R.H 210");
		ImageIcon img=new ImageIcon("C:\\Users\\RIFFAQAT ALI\\Desktop\\login\\frame2b.jpg");
		
		//panel of frame
		JPanel largepanel = new JPanel();
		largepanel.setBounds(0, 0, 1280, 909);
		largepanel.setBackground(new Color(0, 0,0, 0));// for transparent background
		f2.add(largepanel);
		largepanel.setLayout(null);
	
		JLabel title = new JLabel("Learn With Fun");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 99));
		title.setForeground(Color.YELLOW);
		title.setBounds(296, 11, 867, 123);
		largepanel.add(title);
	
		//panel of box layout 
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 159, 1248, 714);
		panel_1.setBackground(new Color(0, 0,0, 0));
		largepanel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));//use of box layout
		
		//panel of collecting info of student
		//start
		JPanel infopanel = new JPanel();
		infopanel .setBackground(new Color(0, 0,0, 0));//transparent
		panel_1.add(infopanel );
		infopanel .setLayout(null);
		
		JLabel name = new JLabel("Name");
		name.setBounds(75, 52, 97, 35);
		name.setHorizontalAlignment(SwingConstants.CENTER);//make the text in center
		name.setFont(new Font("Times New Roman", Font.BOLD, 30));
		name.setForeground(new Color(255, 255, 255));
		infopanel .add(name);
		
		JTextField uname = new JTextField();
		uname.setFont(new Font("Tahoma", Font.PLAIN, 17));
		uname.setBounds(281, 52, 187, 35);
		infopanel .add(uname);
		
		JLabel son = new JLabel("Son of");
		son.setBounds(75, 135, 97, 35);
		son.setHorizontalAlignment(SwingConstants.CENTER);
		son.setForeground(Color.WHITE);
		son.setFont(new Font("Times New Roman", Font.BOLD, 30));
		infopanel .add(son);
		
		JTextField sonof = new JTextField();
		sonof.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sonof.setBounds(281, 208, 187, 35);
		infopanel .add(sonof);
		
		JLabel cnic = new JLabel("CNIC");
		cnic.setBounds(75, 208, 97, 35);
		cnic.setHorizontalAlignment(SwingConstants.CENTER);
		cnic.setForeground(Color.WHITE);
		cnic.setFont(new Font("Times New Roman", Font.BOLD, 30));
		infopanel .add(cnic);
		
		JTextField	textFieldcinc = new JTextField();
		textFieldcinc.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textFieldcinc.setBounds(281, 135, 187, 35);
		infopanel .add(textFieldcinc);
		
		
		JLabel citi = new JLabel("City");
		citi.setHorizontalAlignment(SwingConstants.CENTER);
		citi.setForeground(Color.WHITE);
		citi.setFont(new Font("Times New Roman", Font.BOLD, 30));
		citi.setBounds(75, 285, 97, 35);
		infopanel .add(citi);
		
		String citynames[] ={"ISLAMABAD", "RAWALPINDI", "LAHORE", "KARACHI", "MULTAN", "KOHAT", "BANU", "HANGU", "QUETTA", "FAISALABAD"};
		JComboBox location = new JComboBox(citynames);
		location.setFont(new Font("Tahoma", Font.PLAIN, 17));
		location.setBounds(281, 285, 187, 35);
		infopanel .add(location);
		
		
		JLabel gender = new JLabel("Gender");
		gender.setHorizontalAlignment(SwingConstants.CENTER);
		gender.setForeground(Color.WHITE);
		gender.setFont(new Font("Times New Roman", Font.BOLD, 30));
		gender.setBounds(75, 366, 97, 35);
		infopanel .add(gender);
		
		String gend[] ={"select","Male","Female","Other"};
		JComboBox g = new JComboBox(gend);
		g.setFont(new Font("Tahoma", Font.PLAIN, 17));
		g.setBounds(281, 372, 187, 35);
		infopanel .add(g);
	
		
		JLabel cont = new JLabel("Contact");
		cont.setHorizontalAlignment(SwingConstants.CENTER);
		cont.setForeground(Color.WHITE);
		cont.setFont(new Font("Times New Roman", Font.BOLD, 30));
		cont.setBounds(33, 453, 187, 35);
		infopanel .add(cont);
		
		JTextField phone = new JTextField();
		phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
		phone.setBounds(281, 453, 187, 35);
		infopanel .add(phone);
		
		JLabel qualification = new JLabel("Qualification");
		qualification.setHorizontalAlignment(SwingConstants.LEFT);
		qualification.setForeground(Color.WHITE);
		qualification.setFont(new Font("Times New Roman", Font.BOLD, 30));
		qualification.setBounds(57, 534, 187, 35);
		infopanel .add(qualification);
		
		String qualific[] ={"O-LEVEL", "MATRIC", "F.SC", "ICS", "BS", "MA"};
		JComboBox degree = new JComboBox(qualific);
		degree.setFont(new Font("Tahoma", Font.PLAIN, 17));
		degree.setBounds(281, 534, 187, 35);
		infopanel .add(degree);
		
		JLabel addr = new JLabel("Address");
		addr.setHorizontalAlignment(SwingConstants.CENTER);
		addr.setForeground(Color.WHITE);
		addr.setFont(new Font("Times New Roman", Font.BOLD, 30));
		addr.setBounds(57, 618, 147, 35);
		infopanel .add(addr);
		
		JTextArea place = new JTextArea();
		place.setFont(new Font("Tahoma", Font.PLAIN, 13));
		place.setBounds(266, 614, 202, 89);
		infopanel .add(place);
		//end of info panel
		
		//course info panel
		//start
		JPanel coursepanel = new JPanel();
		coursepanel .setBackground(new Color(0, 0,0, 0));//transparent
		panel_1.add(coursepanel );
		coursepanel .setLayout(null);
		
		JLabel registration = new JLabel("Registration No");
		registration.setHorizontalAlignment(SwingConstants.CENTER);
		registration.setForeground(Color.WHITE);
		registration.setFont(new Font("Times New Roman", Font.BOLD, 30));
		registration.setBounds(62, 60, 235, 35);
		coursepanel .add(registration);
		
		JTextField	txtRhru = new JTextField();
		txtRhru.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtRhru.setText("R-H1432108-RU2022");
		txtRhru.setEditable(false);// user cannot change it
		txtRhru.setBounds(324, 60, 162, 35);
		coursepanel .add(txtRhru);
		
		JLabel batch = new JLabel("Batch No");
		batch.setHorizontalAlignment(SwingConstants.CENTER);
		batch.setForeground(Color.WHITE);
		batch.setFont(new Font("Times New Roman", Font.BOLD, 30));
		batch.setBounds(62, 138, 218, 35);
		coursepanel .add(batch);
		
		
		String bn[] ={"Batch_10/june", "Batch_11/july", "Batch_12/august"};
		JComboBox btch = new JComboBox(bn);
		btch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btch.setBounds(324, 138, 162, 35);
		coursepanel .add(btch);
		
		
		JLabel SHIFT = new JLabel("Course");
		SHIFT.setHorizontalAlignment(SwingConstants.CENTER);
		SHIFT.setForeground(Color.WHITE);
		SHIFT.setFont(new Font("Times New Roman", Font.BOLD, 30));
		SHIFT.setBounds(62, 214, 218, 35);
		coursepanel .add(SHIFT);
		
		String Shft[] ={"Autocad","Freelancing","Graphics desgning","Wordpress","Web desgning","Youtube SEO","Hacking","Ecommerence","Cyber Security"};
		JComboBox timing = new JComboBox(Shft);
		timing.setFont(new Font("Tahoma", Font.PLAIN, 17));
		timing.setBounds(324, 214, 162, 35);
		coursepanel .add(timing);
		
		JLabel coursetype = new JLabel("Course Type");
		coursetype.setHorizontalAlignment(SwingConstants.CENTER);
		coursetype.setForeground(Color.WHITE);
		coursetype.setFont(new Font("Times New Roman", Font.BOLD, 30));
		coursetype.setBounds(62, 287, 218, 35);
		coursepanel .add(coursetype);
		
		String U[] ={"Long course", "Short course"};
		JComboBox ctyp = new JComboBox(U);
		ctyp.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ctyp.setBounds(324, 287, 162, 35);
		coursepanel .add(ctyp);
		
		JLabel med = new JLabel("Medium");
		med.setHorizontalAlignment(SwingConstants.CENTER);
		med.setForeground(Color.WHITE);
		med.setFont(new Font("Times New Roman", Font.BOLD, 30));
		med.setBounds(62, 374, 218, 35);
		coursepanel .add(med);
		
		
		String RH[] ={"Live Classes", "Videos"};
		JComboBox way = new JComboBox(RH);
		way.setFont(new Font("Tahoma", Font.PLAIN, 17));
		way.setBounds(324, 374, 162, 35);
		coursepanel .add(way);
		
		JLabel language = new JLabel("Course language");
		language.setHorizontalAlignment(SwingConstants.CENTER);
		language.setForeground(Color.WHITE);
		language.setFont(new Font("Times New Roman", Font.BOLD, 30));
		language.setBounds(62, 471, 235, 35);
		coursepanel .add(language);
		
		String lang[] ={"English", "Urdu", "German", "Arabic", "Spanish","chinese","Latin","Turkish","Greek"};
		JComboBox lnguge = new JComboBox(lang);
		lnguge.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lnguge.setBounds(324, 471, 162, 35);
		coursepanel .add(lnguge);
		
		
		JCheckBox agree = new JCheckBox("I agree to the terms and policy.");
		agree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		agree.setBackground(SystemColor.activeCaption);
		agree.setBounds(93, 556, 393, 48);
		coursepanel .add(agree);
		
		
		
		JButton submit = new JButton("Submit");
		submit.setFont(new Font("SansSerif", Font.BOLD, 20));
		submit.setBackground(SystemColor.textHighlight);
		submit.setForeground(Color.BLACK);
		submit.setBounds(358, 619, 128, 48);
		coursepanel .add(submit);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ea) {
				Connection con;
				try {
					Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
					con=DriverManager.getConnection("jdbc:ucanaccess://D:\\userdata.accdb");
					System.out.println("connection made");
					PreparedStatement stmt=con.prepareStatement("insert into usertable(sn,sf,id,city,gendre,contact,education,address,batchno,shift,courseperiod,medium,courselang)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
					String value1=uname.getText();
					stmt.setString(1, value1);
					String value2=textFieldcinc.getText();
					stmt.setString(2, value2);
					String value3=sonof.getText();
					stmt.setString(3, value3);
			String value4=location.getSelectedItem().toString();
			stmt.setString(4, value4);
			String value5=g.getSelectedItem().toString();
			stmt.setString(5, value5);
			String value6=phone.getText();
			stmt.setString(6, value6);
			String value7=degree.getSelectedItem().toString();
			stmt.setString(7, value7);
			String value8=place.getText();
			stmt.setString(8, value8);
			String value9=btch.getSelectedItem().toString();
			stmt.setString(9, value9);
			String value10=timing.getSelectedItem().toString();
			stmt.setString(10, value10);
			String value11=ctyp.getSelectedItem().toString();
			stmt.setString(11, value11);
			String value12=way.getSelectedItem().toString();
			stmt.setString(12, value12);
			String value13=lnguge.getSelectedItem().toString();
			stmt.setString(13, value13);
					
					int a=stmt.executeUpdate();
					if(a>0) {
						 JOptionPane.showMessageDialog(null, "Submitted");
						Frame3 f3=new Frame3();
        				Frame3.main(null);
        				f2.dispose();
        				System.out.println("recored inserted");
        				}
					
					else
						System.out.println("reocred failed");
					}
				catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		
		
		
		//background image
		JLabel l=new JLabel("",img,JLabel.CENTER);
		l.setBounds(0, 0, 1280, 909);
		//frame
		f2.add(l);
		f2.setVisible(true);f2.setSize(1280, 940);
	}

}
