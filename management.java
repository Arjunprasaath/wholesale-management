import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class management {
	static int order_id; 
	private JFrame frame;
	private JTextField textfield1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textFieldenterid;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private final JLabel label = new JLabel("Benz Cycle:");
	private JTextField textField8;
	private JTextField textField;
	private JTextField txtfieldstockbenz;
	private JTextField txtfieldstockpolo;
	private JTextField txtfieldbenzno;
	private JTextField txtfieldpolono;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {		
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
					Statement stmt2 =con.createStatement();
					ResultSet rs4=stmt2.executeQuery("select max(order_id) from table1");
					rs4.next();
					if(rs4.getInt(1) == 0)
				        order_id = 1000;
					else
					order_id = rs4.getInt(1)+1;
					management window = new management();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	ResultSet rs= null; 
	public management() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 368);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		frame.getContentPane().add(panel1, "name_605867743413600");
		panel1.setLayout(null);
		panel1.setVisible(true);
		
		
		JPanel panel2 = new JPanel();
		frame.getContentPane().add(panel2, "name_605870945221100");
		panel2.setLayout(null); 
		panel2.setVisible(false);
		
		
		JPanel panel3 = new JPanel();
		frame.getContentPane().add(panel3, "name_605873491428900");
		panel3.setLayout(null);
		panel3.setVisible(false);
		  
		JPanel panel4 = new JPanel();
		frame.getContentPane().add(panel4, "name_605875379809300");
		panel4.setLayout(null);
		panel4.setVisible(false);
		 
	
		JPanel panel5 = new JPanel();
		frame.getContentPane().add(panel5, "name_605877265150900");
		panel5.setLayout(null);
		panel5.setVisible(false);

		JPanel panel6 = new JPanel();
		frame.getContentPane().add(panel6, "name_605883812466800");
		panel6.setLayout(null);
		panel6.setVisible(false);
		
		JPanel panel7 = new JPanel();
		frame.getContentPane().add(panel7, "name_605895003594800");
		panel7.setLayout(null);
		panel7.setVisible(false);
		
		JPanel panel8 = new JPanel();
		frame.getContentPane().add(panel8, "name_638696327794500");
		panel8.setLayout(null);
		panel8.setVisible(false);

			
		JButton btnexiscust = new JButton("EXISTING CUSTOMER");
		btnexiscust.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel4.setVisible(true);
			    panel1.setVisible(false);    
			}
		});
		btnexiscust.setBounds(159,77,144,55);
		panel1.add(btnexiscust);
		
		JButton btnitems = new JButton("VIEW PRODUCTS");
		btnitems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.setVisible(true);
				panel1.setVisible(false);
			}
		});
		btnitems.setBounds(159, 159, 134, 55);
		panel1.add(btnitems);
		
		JButton btnoffers = new JButton("OFFERS AVAILABLE");
		btnoffers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel7.setVisible(true);
				panel1.setVisible(false);
				String s=""; String ss=""; 
				
				
				JLabel lblNewoffers = new JLabel("Offers:");
		        lblNewoffers.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewoffers.setBounds(10, 23, 150, 38);
				panel7.add(lblNewoffers);
		
				JLabel lbloffbenz = new JLabel("Benz cycle:");
				lbloffbenz.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lbloffbenz.setBounds(53, 72, 107, 57);
				panel7.add(lbloffbenz);
		
				JLabel lbloffpolo = new JLabel("Polo cycle:");
				lbloffpolo.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lbloffpolo.setBounds(53, 182, 107, 57);
				panel7.add(lbloffpolo);
		
				JLabel lblNewLabel_3 = new JLabel("20%");
				lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lblNewLabel_3.setBounds(137, 81, 47, 38);
				panel7.add(lblNewLabel_3);
		
				JLabel lblNewLabel_4 = new JLabel("15%");
				lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
				lblNewLabel_4.setBounds(137, 191, 47, 37);
				panel7.add(lblNewLabel_4);
		
				JLabel label_1 = new JLabel("1500$");
				label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
				label_1.setBounds(194, 81, 52, 38);
				panel7.add(label_1);
		
				JLabel label_2 = new JLabel("1000$");
				label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
				label_2.setBounds(194, 197, 52, 27);
				panel7.add(label_2);
		
				JButton btnofftomain = new JButton("To main");
				btnofftomain.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						panel7.remove(txtfieldstockbenz);
						panel7.remove(txtfieldbenzno);
						panel7.remove(txtfieldpolono);
						panel7.remove(txtfieldstockpolo);
						panel7.setVisible(false);
						panel1.setVisible(true);
					}
				});
				btnofftomain.setBounds(159, 262, 107, 38);
				panel7.add(btnofftomain);
		
		
				txtfieldstockbenz = new JTextField();
				txtfieldstockbenz.setBounds(274, 92, 96, 20);
				panel7.add(txtfieldstockbenz);
				txtfieldstockbenz.setColumns(10);
				txtfieldstockbenz.setEditable(false);
		
				txtfieldstockpolo = new JTextField();
				txtfieldstockpolo.setColumns(10);
				txtfieldstockpolo.setBounds(274, 202, 96, 20);
				panel7.add(txtfieldstockpolo);
				txtfieldstockpolo.setEditable(false);
		
				txtfieldbenzno = new JTextField();
				txtfieldbenzno.setBounds(392, 92, 23, 20);
				panel7.add(txtfieldbenzno);
				txtfieldbenzno.setColumns(10);
				txtfieldbenzno.setEditable(false);
		
				txtfieldpolono = new JTextField();
				txtfieldpolono.setBounds(392, 202, 23, 20);
				panel7.add(txtfieldpolono);
				txtfieldpolono.setColumns(10);
				txtfieldpolono.setEditable(false);
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
					Statement stmt2 =con.createStatement();
					ResultSet rs2=stmt2.executeQuery("select stock ,no_of_cy from table2");	
					
					rs2.next();
					s=rs2.getString(1);
					ss=rs2.getString(2);
					txtfieldstockbenz.setText(s);
					txtfieldbenzno.setText(ss);
					rs2.next();
					s=rs2.getString(1);
					ss=rs2.getString(2);
					txtfieldstockpolo.setText(s);
					txtfieldpolono.setText(ss);					
				}catch(Exception d) {
					JOptionPane.showMessageDialog(null, d);
				}
		
			}
		});
		btnoffers.setBounds(159, 246, 134, 55);
		panel1.add(btnoffers);
		
		JButton btnreview = new JButton("Review");
		btnreview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel8.setVisible(true);
				panel1.setVisible(false);
			}
		});
		btnreview.setBounds(10, 271, 80, 30);
		panel1.add(btnreview);
		
		JButton btnexit = new JButton("exit");
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
			}
		});
		btnexit.setBounds(375, 271, 73, 30);
		panel1.add(btnexit);
		
		JLabel lblNewLabel = new JLabel("WHOLESALE MANAGEMENT");
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 17));
		lblNewLabel.setBounds(44, 11, 366, 43);
		panel1.add(lblNewLabel);
		
		JLabel lblname = new JLabel("Name:");
		lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblname.setBounds(32, 49, 90, 26);
		panel2.add(lblname);
		
		JLabel lblphoneno = new JLabel("Phone number:");
		lblphoneno.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblphoneno.setBounds(32, 111, 130, 26);
		panel2.add(lblphoneno);
		
		JLabel lblemail = new JLabel("Email:");
		lblemail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblemail.setBounds(32, 175, 90, 26);
		panel2.add(lblemail);
		
		textfield1 = new JTextField();
		textfield1.setBounds(172, 54, 224, 21);
		panel2.add(textfield1);
		textfield1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(172, 116, 224, 21);
		panel2.add(textField2);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(172, 180, 224, 21);
		panel2.add(textField3);
		
		
		JCheckBox chckbxBenzCycle = new JCheckBox("Benz Cycle");
		chckbxBenzCycle.setBounds(92, 230, 97, 23);
		panel2.add(chckbxBenzCycle);
		
		JCheckBox chckbxPoloCycle = new JCheckBox("Polo Cycle");
		chckbxPoloCycle.setBounds(263, 230, 97, 23);
		panel2.add(chckbxPoloCycle);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnsubmit.setBounds(171, 282, 130, 36);
		panel2.add(btnsubmit);
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String name= textfield1.getText();
					String number= textField2.getText();
					String email= textField3.getText();
					String cycle;
					if(chckbxBenzCycle.isSelected()){
						cycle="benz";
					}else {
						cycle="polo";
					}
					
			 	try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
					Statement stmt = con.createStatement();
					if((name.matches("^[a-zA-Z]*$"))&&(email.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$"))&&(number.matches("^[0-9]*$"))){
						
                        stmt.executeUpdate("insert into table1 values('"+name+"',"+number+",'"+email+"','"+cycle+"',"+order_id+")");
							panel2.setVisible(false);
							panel3.setVisible(true);
						}
                        else{
                          JOptionPane.showMessageDialog(frame,"INPUT NOT VALID");}
					
					
				}catch(Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
				JLabel lblYourOrderId = new JLabel("Your order id is:");
				
				String a=Integer.toString(order_id);
				lblYourOrderId.setFont(new Font("Tahoma", Font.BOLD, 18));
				lblYourOrderId.setBounds(42, 77, 225, 88);
				panel3.add(lblYourOrderId);
				
				
		
				textField4 = new JTextField();
				textField4.setText(a);
				order_id = order_id+1;
				
				textField4.setBounds(246, 106, 104, 36);
				panel3.add(textField4);
				textField4.setColumns(10);
		
				JButton btndone = new JButton("Done");
				btndone.setBounds(178, 221, 89, 36);
				panel3.add(btndone);
				btndone.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){ 
					String z=""; String g="";
				  while(true){ 
				    panel1.setVisible(true);
				    panel3.setVisible(false);
				    textfield1.setText("");
				    textField2.setText("");
					textField3.setText("");
					
				   break;
				  }
					try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
					Statement stmt3 =con.createStatement();
					ResultSet rs3=stmt3.executeQuery("select no_of_cy from table2");	
					rs3.next();
					z=rs3.getString(1);
					rs3.next();
					g=rs3.getString(1);
					
		
					if(z.equals("0")){
						Statement stt=con.createStatement();
						stt.executeUpdate("update table2 set stock='out_of_stock' where cycles='benz'");
					}
					if(g.equals("0")){
						Statement stt=con.createStatement();
						stt.executeUpdate("update table2 set stock='out_of_stock' where cycles='polo'");
					}
				}
				catch(Exception d) {
					JOptionPane.showMessageDialog(null, d);
				}
				}});
				
				
			}
		});
		JLabel lblenterid = new JLabel("Enter your order id:");
		lblenterid.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblenterid.setBounds(51, 63, 258, 39);
		panel4.add(lblenterid);
		
		textFieldenterid = new JTextField();
		textFieldenterid.setBounds(103, 113, 232, 39);
		panel4.add(textFieldenterid);
		textFieldenterid.setColumns(10);
		
		JButton btnproceed = new JButton("Proceed");
		btnproceed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnproceed.setBounds(148, 229, 131, 50);
		panel4.add(btnproceed);
		btnproceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textFieldenterid.getText();
				String b="";String ba="";String bb="";String bc="";
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
					Statement stmt1 =con.createStatement();
					ResultSet rs=stmt1.executeQuery("select * from table1 where order_id='"+id+"'");	
					
					while(rs.next()){
					 b=rs.getString(1);
					 ba=rs.getString(2);
					 bb=rs.getString(3);
					 bc=rs.getString(4);
					 
					}					
				}catch(Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
				panel4.setVisible(false);
				panel5.setVisible(true);
				JLabel lblNamedis = new JLabel("Name:");
				lblNamedis.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblNamedis.setBounds(37, 51, 90, 29);
				panel5.add(lblNamedis);
		
				JLabel lblphondis = new JLabel("Phone Number:");
				lblphondis.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblphondis.setBounds(37, 117, 90, 29);
				panel5.add(lblphondis);
		
				JLabel lblemaildis = new JLabel("Email:");
				lblemaildis.setFont(new Font("Tahoma", Font.PLAIN, 13));
				lblemaildis.setBounds(37, 180, 90, 29);
				panel5.add(lblemaildis);
		
				textField5 = new JTextField();
				textField5.setBounds(194, 56, 109, 20);
				textField5.setText(b);
				panel5.add(textField5);
				textField5.setColumns(10);
				textField5.setEditable(false);
		
				textField6 = new JTextField();
				textField6.setText(ba);
				textField6.setColumns(10);
				textField6.setBounds(194, 122, 109, 20);
				panel5.add(textField6);
				textField6.setEditable(false);
		
				textField7 = new JTextField();
				textField7.setText(bb);
				textField7.setColumns(10);
				textField7.setBounds(194, 185, 109, 20);
				panel5.add(textField7);
				textField7.setEditable(false);
		
				JLabel lblYouHavePurchased = new JLabel("You have purchased:");
				lblYouHavePurchased.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblYouHavePurchased.setBounds(37, 220, 147, 34);
				panel5.add(lblYouHavePurchased);
		
				textField8 = new JTextField();
				textField8.setColumns(10);
				textField8.setText(bc);
				textField8.setBounds(194, 229, 109, 20);
				panel5.add(textField8);
				textField8.setEditable(false);
				
				JButton btnexixtingtomain = new JButton("To main");
				btnexixtingtomain.setBounds(170, 289, 109, 29);
				panel5.add(btnexixtingtomain);
				btnexixtingtomain.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){ 
				  while(true){ 
				   panel1.setVisible(true);
				   panel5.setVisible(false);
				 
				   break;
				  }
				}}
		);
		
		
		
		 }});		
		
		
		JLabel lblCyclesList = new JLabel("Cycle's List");
		lblCyclesList.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCyclesList.setBounds(31, 32, 159, 29);
		panel6.add(lblCyclesList);
		
		JLabel lblBenzCycle = new JLabel("Benz Cycle:");
		lblBenzCycle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBenzCycle.setBounds(31, 95, 137, 41);
		panel6.add(lblBenzCycle);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\arjun\\Downloads\\cycle1.jpg"));
		lblNewLabel_1.setBounds(148, 57, 189, 98);
		panel6.add(lblNewLabel_1);
		
		JLabel lblPolosCycle = new JLabel("Polo's Cycle");
		lblPolosCycle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPolosCycle.setBounds(31, 210, 137, 41);
		panel6.add(lblPolosCycle);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\arjun\\Downloads\\product2.jpg"));
		lblNewLabel_2.setBounds(148, 184, 172, 115);
		panel6.add(lblNewLabel_2);
		
		JButton btnproducttomain = new JButton("To Main");
		btnproducttomain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.setVisible(false);
				panel1.setVisible(true);
			}
		});
		btnproducttomain.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnproducttomain.setBounds(339, 264, 109, 35);
		panel6.add(btnproducttomain);
		
		JButton btnpolobuy = new JButton("BUY");
		btnpolobuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.setVisible(false);
				panel2.setVisible(true);
				chckbxPoloCycle.setSelected(true);
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
					Statement stmtt = con.createStatement();
					stmtt.executeUpdate("update table2 set no_of_cy=no_of_cy-1 where cycles='polo'");
					
				}catch(Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
			}});
		btnpolobuy.setBounds(366, 221, 58, 23);
		
		JButton btnbenzbuy = new JButton("BUY");
		btnbenzbuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel6.setVisible(false);
				panel2.setVisible(true);
				chckbxBenzCycle.setSelected(true);
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
					Statement stmt = con.createStatement();
					stmt.executeUpdate("update table2 set no_of_cy=no_of_cy-1 where cycles='benz'");
					
				}catch(Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
			}
		});
		btnbenzbuy.setBounds(366, 95, 58, 23);	
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement stmm = con.createStatement();
			ResultSet rss=stmm.executeQuery("select no_of_cy from table2 ");
			rss.next();
			if(rss.getInt(1) >=1)
				panel6.add(btnbenzbuy);
			rss.next();
			if(rss.getInt(1) >= 1)
				panel6.add(btnpolobuy);
		}catch(Exception f) {
			JOptionPane.showMessageDialog(null, f);
		} 
	
		
		JLabel lblEnterYourThoughts = new JLabel("Enter your thoughts here:");
		lblEnterYourThoughts.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEnterYourThoughts.setBounds(33, 50, 323, 41);
		panel8.add(lblEnterYourThoughts);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(63, 102, 342, 105);
		panel8.add(textArea);
		
		
		JLabel lblNewLabel_5 = new JLabel("Enter your order id: ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(33, 237, 135, 25);
		panel8.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(219, 241, 137, 21);
		panel8.add(textField);
		textField.setColumns(10);
		
		JButton btnToMain = new JButton("To main");
		btnToMain.setBounds(150, 273, 109, 33);
		panel8.add(btnToMain);
		btnToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String T=textArea.getText();
				String o=textField.getText();
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
					Statement st = con.createStatement();
					st.executeUpdate("insert into table3 values("+o+",'"+T+"')");
					
				
				}catch(Exception f) {
					JOptionPane.showMessageDialog(null, f);
				}
				panel8.setVisible(false);
				panel1.setVisible(true);
				textArea.setText("");
				textField.setText("");
			}
		});
		btnToMain.setBounds(150, 273, 109, 33);
		panel8.add(btnToMain);
		
	}

	private ImageIcon ImageIcon(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
