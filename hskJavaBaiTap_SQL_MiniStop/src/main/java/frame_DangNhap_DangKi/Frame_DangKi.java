package frame_DangNhap_DangKi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import dataBase_DAO.NhanVien_DAO;
import entities.NhanVien;

public class Frame_DangKi extends JFrame implements ActionListener, ChangeListener {
	// Variables declaration - do not modify
	// Variables declaration - do not modify
	private javax.swing.JButton btnDangKi;
	private javax.swing.JButton btnDangNhap;
	private javax.swing.JButton btnTroVe;
	private javax.swing.JCheckBox checkBoxAccept;
	private javax.swing.JLabel lblDiaChi;
	private javax.swing.JLabel lblDieuKien;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblGioiTinh;
	private javax.swing.JLabel lblHoVaTen;
	private javax.swing.JLabel lblMatKhau;
	private javax.swing.JLabel lblSoDienThoai;
	private javax.swing.JLabel lblTenDangNhap;
	private javax.swing.JLabel lblTieuDe;
	private javax.swing.JLabel lblTuoi;
	private javax.swing.JRadioButton radHienThi;
	private javax.swing.JRadioButton radNam;
	private javax.swing.JRadioButton radNu;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtHoVaTen;
	private javax.swing.JPasswordField txtMatKhau;
	private javax.swing.JTextField txtSoDienThoai;
	private javax.swing.JTextField txtTenDangNhap;
	private javax.swing.JTextField txtTuoi;
	private NhanVien_DAO sqlNhanVien = new NhanVien_DAO();

	public Frame_DangKi() {
		setTitle("Đăng nhập tài khoản");
		setSize(507, 344);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initComponents();
		
	}

	private void initComponents() {

		lblTieuDe = new javax.swing.JLabel();
		lblTenDangNhap = new javax.swing.JLabel();
		lblMatKhau = new javax.swing.JLabel();
		lblHoVaTen = new javax.swing.JLabel();
		lblGioiTinh = new javax.swing.JLabel();
		lblEmail = new javax.swing.JLabel();
		lblSoDienThoai = new javax.swing.JLabel();
		lblDiaChi = new javax.swing.JLabel();
		lblTuoi = new javax.swing.JLabel();
		txtTenDangNhap = new javax.swing.JTextField();
		txtHoVaTen = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		radNam = new javax.swing.JRadioButton();
		radNu = new javax.swing.JRadioButton();
		txtTuoi = new javax.swing.JTextField();
		txtSoDienThoai = new javax.swing.JTextField();
		txtDiaChi = new javax.swing.JTextField();
		lblDieuKien = new javax.swing.JLabel();
		btnTroVe = new javax.swing.JButton();
		btnDangKi = new javax.swing.JButton();
		btnDangNhap = new javax.swing.JButton();
		checkBoxAccept = new javax.swing.JCheckBox();
		txtMatKhau = new javax.swing.JPasswordField();
		radHienThi = new javax.swing.JRadioButton();
		ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radNam);
        genderGroup.add(radNu);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		lblTieuDe.setBackground(new java.awt.Color(255, 255, 255));
		lblTieuDe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		lblTieuDe.setForeground(new java.awt.Color(255, 0, 0));
		lblTieuDe.setText("ĐĂNG KÍ THÔNG TIN NHÂN VIÊN MINISTOP");

		lblTenDangNhap.setText("Tên đăng nhập:");

		lblMatKhau.setText("Mật khẩu:");

		lblHoVaTen.setText("Họ và tên:");

		lblGioiTinh.setText("Giới tính:");

		lblEmail.setText("Email:");

		lblSoDienThoai.setText("Số điện thoại:");

		lblDiaChi.setText("Địa chỉ:");

		lblTuoi.setText("Tuổi:");

		radNam.setText("Nam");

		radNu.setText("Nữ");

		lblDieuKien.setText("Tôi sẽ chấp hành theo đúng quy định của Ministop:\n");

		btnTroVe.setText("Thoát");

		btnDangKi.setText("Đăng kí");

		btnDangNhap.setText("Đăng Nhập");

		checkBoxAccept.setText("Đồng ý");

		radHienThi.setText("Hiển thị");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(50, 50, 50).addComponent(lblTieuDe,
								javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addComponent(lblDieuKien)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(checkBoxAccept).addGap(0, 0, Short.MAX_VALUE))
										.addGroup(layout.createSequentialGroup().addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblTenDangNhap).addComponent(lblMatKhau)
												.addComponent(lblHoVaTen).addComponent(lblGioiTinh)
												.addComponent(lblEmail).addComponent(lblSoDienThoai)
												.addComponent(lblTuoi).addComponent(lblDiaChi))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addComponent(txtTenDangNhap,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 257,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(0, 139, Short.MAX_VALUE))
														.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
																.createSequentialGroup()
																.addGroup(layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																		.addComponent(txtHoVaTen,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				257, Short.MAX_VALUE)
																		.addComponent(
																				txtEmail,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				257, Short.MAX_VALUE)
																		.addGroup(layout.createSequentialGroup()
																				.addComponent(radNam)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																				.addComponent(radNu).addGap(29, 29, 29))
																		.addComponent(txtSoDienThoai,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				257, Short.MAX_VALUE)
																		.addComponent(txtDiaChi,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				257, Short.MAX_VALUE)
																		.addComponent(
																				txtTuoi,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				41,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(txtMatKhau))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)
																.addGroup(layout.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(btnTroVe,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				96,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnDangNhap,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				96,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(btnDangKi,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				96,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(radHienThi))))))))
				.addContainerGap(24, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(lblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblTenDangNhap)
								.addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblMatKhau)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(radHienThi)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblHoVaTen)
								.addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lblGioiTinh)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(radNam).addComponent(radNu).addComponent(btnDangKi)))
						.addGap(11, 11, 11)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblEmail)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(btnDangNhap)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblSoDienThoai)
								.addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTroVe))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblDiaChi).addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblTuoi).addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblDieuKien, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(checkBoxAccept))
						.addContainerGap(12, Short.MAX_VALUE)));
		addActionListener();
		pack();		
	}
	private void addActionListener() 
	{
		checkBoxAccept.addActionListener(this);
		radHienThi.addChangeListener(this);
		radNam.addActionListener(this);
		radNu.addActionListener(this);
		btnDangKi.addActionListener(this);
		btnDangNhap.addActionListener(this);
		btnTroVe.addActionListener(this);
	}

	private boolean kiemTraDuLieu() 
	{
		String tenDangNhap = txtTenDangNhap.getText();
		String matKhau = new String(txtMatKhau.getPassword());
		String hoVaTen = txtHoVaTen.getText();
		String email = txtEmail.getText();
		String soDienThoai = txtSoDienThoai.getText();
		String tuoi = txtTuoi.getText();
		int tuoiInt = Integer.parseInt(tuoi);		
		if (tenDangNhap.trim().equals("") || matKhau.trim().equals("") || hoVaTen.trim().equals("")
				|| email.trim().equals("") || soDienThoai.trim().equals("") || tuoi.trim().equals("")) 
		{
			JOptionPane.showMessageDialog(null, "Vui lòng nhập hết dữ liệu.");
			return false;
		}
		if (!matKhau.matches(".*\\d.*")) {
			JOptionPane.showMessageDialog(null, "Mật khẩu phải chứa số.");
			txtMatKhau.requestFocus();
			return false;
		}
		if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
			JOptionPane.showMessageDialog(null, "Email không hợp lệ.");
			txtEmail.requestFocus();
			return false;
		}
		if (!soDienThoai.matches("\\d{10}")) {
			JOptionPane.showMessageDialog(null, "Số điện thoại không hợp lệ.");
			txtSoDienThoai.requestFocus();
			return false;
		}
		if (!tuoi.matches("\\d+")) {
			JOptionPane.showMessageDialog(null, "Tuổi không hợp lệ.");
			txtTuoi.requestFocus();
			return false;
		}
		if (tuoiInt <= 20) {
			JOptionPane.showMessageDialog(null, "Tuổi phải lớn hơn 20.");
			return false;
		}
		if (!radNam.isSelected() && !radNu.isSelected()) {
			JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính.");
			return false;
		}
		if (!checkBoxAccept.isSelected()) {
			JOptionPane.showMessageDialog(null, "Bạn chưa đồng ý quy định.");
			return false;
		}
		return true;
	}
	private void resetAll()
	{
		txtDiaChi.setText("");
		txtEmail.setText("");
		txtHoVaTen.setText("");
		txtMatKhau.setText("");
		txtSoDienThoai.setText("");
		txtTenDangNhap.setText("");
		txtTuoi.setText("");
		radNam.setSelected(false);
		radNu.setSelected(false);
		checkBoxAccept.setSelected(false);		
	}
	private String gioiTinh() 
	{
		if (radNam.isSelected()) 
		{
			return "Nam";
		} else
			return "Nu";
	}

	private void themSQL() 
	{
		String tenDangNhap = txtTenDangNhap.getText();
		String matKhau = new String(txtMatKhau.getPassword());
		String hoVaTen = txtHoVaTen.getText();
		String email = txtEmail.getText();
		String soDienThoai = txtSoDienThoai.getText();
		String diaChi = txtDiaChi.getText();
		String tuoi = txtTuoi.getText();
		int tuoiInt = Integer.parseInt(tuoi);
		// NhanVien(String tenDangNhap, String matKhau, String hoVaTen, String gioiTinh,
		// String email,String soDienThoai, String diaChi, int tuoi)
		NhanVien n = new NhanVien(tenDangNhap, matKhau, hoVaTen, gioiTinh(), email, soDienThoai, diaChi, tuoiInt);
		sqlNhanVien.themNhanVien(n);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object o = e.getSource();
		if (o.equals(btnDangKi)) 
		{
			if(kiemTraDuLieu())
			{
				themSQL();
				resetAll();
			}				
		}
		if(o.equals(btnDangNhap))
		{
			new Frame_DangNhap().setVisible(true);
			dispose();
		}
		if(o.equals(btnTroVe))
		{
			System.exit(0);
		}
	}

	@Override
	public void stateChanged(ChangeEvent e) 
	{
		if (radHienThi.isSelected()) 
		{
			txtMatKhau.setEchoChar((char) 0);
		} else 
		{
			txtMatKhau.setEchoChar('\u2022');
		}
	}

}
