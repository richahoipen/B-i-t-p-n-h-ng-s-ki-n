package frame_DangNhap_DangKi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import dataBase_DAO.NhanVien_DAO;

public class Frame_LayMatKhau extends JFrame implements ActionListener, ChangeListener {

	private javax.swing.JButton btnDangKiTaiKhoan;
	private javax.swing.JButton btnDoiMatKhau;
	private javax.swing.JButton btnKiemTra;
	private javax.swing.JButton btnTroVe;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblMatKhau;
	private javax.swing.JLabel lblNhapLaiMatKhau;
	private javax.swing.JLabel lblSoDienThoai;
	private javax.swing.JLabel lblTenDangNhap;
	private javax.swing.JLabel lblTieuDe;
	private javax.swing.JRadioButton radHienThi;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JPasswordField txtMatKhau;
	private javax.swing.JPasswordField txtNhapLaiMatKhau;
	private javax.swing.JTextField txtSoDienThoai;
	private javax.swing.JTextField txtTenDangNhap;
	private NhanVien_DAO sqlNhanVien = new NhanVien_DAO();
	public Frame_LayMatKhau() {
		setTitle("Lấy mật khẩu cho tài khoản");
		setSize(460, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initComponents();
	}

	private void initComponents() {

		lblTieuDe = new javax.swing.JLabel();
		lblTenDangNhap = new javax.swing.JLabel();
		lblMatKhau = new javax.swing.JLabel();
		lblNhapLaiMatKhau = new javax.swing.JLabel();
		txtTenDangNhap = new javax.swing.JTextField();
		txtMatKhau = new javax.swing.JPasswordField();
		txtNhapLaiMatKhau = new javax.swing.JPasswordField();
		radHienThi = new javax.swing.JRadioButton();
		lblEmail = new javax.swing.JLabel();
		txtEmail = new javax.swing.JTextField();
		lblSoDienThoai = new javax.swing.JLabel();
		txtSoDienThoai = new javax.swing.JTextField();
		btnKiemTra = new javax.swing.JButton();
		btnDoiMatKhau = new javax.swing.JButton();
		btnTroVe = new javax.swing.JButton();
		btnDangKiTaiKhoan = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		lblTieuDe.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
		lblTieuDe.setForeground(new java.awt.Color(255, 51, 0));
		lblTieuDe.setText("Lấy mật khẩu cho tài khoản.");

		lblTenDangNhap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblTenDangNhap.setText("Tên đăng nhập:");

		lblMatKhau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblMatKhau.setText("Mật khẩu mới:");

		lblNhapLaiMatKhau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblNhapLaiMatKhau.setText("Nhập lại mật khẩu:");

		radHienThi.setText("Hiển thị mật khẩu");

		lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblEmail.setText("Nhập email:");

		lblSoDienThoai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblSoDienThoai.setText("Số điện thoại:");

		btnKiemTra.setText("Kiểm tra");

		btnDoiMatKhau.setText("Đổi mật khẩu");

		btnTroVe.setText("Trở về");

		btnDangKiTaiKhoan.setText("Đăng kí tài khoản");
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(69, 69, 69).addComponent(lblTieuDe))
						.addGroup(layout.createSequentialGroup().addGap(27, 27, 27).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblNhapLaiMatKhau)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
										.addComponent(btnKiemTra, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblMatKhau, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblSoDienThoai).addComponent(lblEmail).addComponent(lblTenDangNhap))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(txtNhapLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 242,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(radHienThi)
										.addGroup(layout.createSequentialGroup().addComponent(btnDoiMatKhau)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnTroVe)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(btnDangKiTaiKhoan)))))
				.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(12, 12, 12).addComponent(lblTieuDe)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblTenDangNhap).addComponent(txtTenDangNhap,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmail))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSoDienThoai))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnKiemTra).addComponent(btnDoiMatKhau).addComponent(btnTroVe)
								.addComponent(btnDangKiTaiKhoan))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMatKhau))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblNhapLaiMatKhau).addComponent(txtNhapLaiMatKhau,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(radHienThi)
						.addGap(31, 31, 31)));
		khoaComponent();
		pack();
		addActionListener();
	}
	private void khoaComponent()
	{
		txtMatKhau.setEnabled(false);
		txtNhapLaiMatKhau.setEnabled(false);
		radHienThi.setEnabled(false);
		btnDoiMatKhau.setEnabled(false);
	}
	private void moKhoaComponent()
	{
		txtMatKhau.setEnabled(true);
		txtNhapLaiMatKhau.setEnabled(true);
		radHienThi.setEnabled(true);
		btnDoiMatKhau.setEnabled(true);
	}
	private void addActionListener() 
	{
		btnDangKiTaiKhoan.addActionListener(this);
		btnDoiMatKhau.addActionListener(this);
		btnKiemTra.addActionListener(this);
		btnTroVe.addActionListener(this);
		radHienThi.addChangeListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent e) 
	{
		if (radHienThi.isSelected()) 
		{
			txtMatKhau.setEchoChar((char) 0);
			txtNhapLaiMatKhau.setEchoChar((char) 0);
		} else 
		{
			txtMatKhau.setEchoChar('\u2022');
			txtNhapLaiMatKhau.setEchoChar('\u2022');
		}
	}	
	private boolean kiemTraTextField()
	{
		String tenDangNhap=txtTenDangNhap.getText();
		String email=txtEmail.getText();
		String soDienThoai=txtSoDienThoai.getText();
		if(tenDangNhap.trim().equals("")||email.trim().equals("")||soDienThoai.trim().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Vui lòng nhập hết dữ liệu.");
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
		return true;
	}
	private void lockField()
	{
		txtTenDangNhap.setEnabled(false);
		txtEmail.setEnabled(false);
		txtSoDienThoai.setEnabled(false);
	}
	private void resetField()
	{
		txtTenDangNhap.setText("");
		txtEmail.setText("");
		txtSoDienThoai.setText("");
	}
	private void kiemTraTaiKhoan()
	{
		String tenDangNhap=txtTenDangNhap.getText();
		String email=txtEmail.getText();
		String soDienThoai=txtSoDienThoai.getText();
		if(sqlNhanVien.kiemTraDeDoiMatKhau(tenDangNhap, email, soDienThoai))
		{
			JOptionPane.showMessageDialog(null, "Đã xác minh là tài khoản của bạn, hãy nhập mật khẩu mới.");
			moKhoaComponent();
			lockField();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Không xác minh được tài khoản của bạn.");
			resetField();
		}
	}
	private boolean kiemTraTextFieldMatKhau()
	{
		String matKhau=new String(txtMatKhau.getPassword());
		String nhapLaiMatKhau=new String(txtNhapLaiMatKhau.getPassword());
		if(matKhau.trim().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu mới.");
			txtMatKhau.requestFocus();
			return false;
		}
		if (!matKhau.matches(".*\\d.*")) {
			JOptionPane.showMessageDialog(null, "Mật khẩu phải chứa số.");
			txtMatKhau.requestFocus();
			return false;
		}
		if(!matKhau.equalsIgnoreCase(nhapLaiMatKhau))
		{
			JOptionPane.showMessageDialog(null, "Mật khẩu không khớp.");
			txtMatKhau.requestFocus();
			return false;
		}
		return true;
	}
	private void doiMatKhau()
	{
		String tenDangNhap=txtTenDangNhap.getText();
		String matKhau=new String(txtMatKhau.getPassword());
		if(sqlNhanVien.doiMatKhauTaiKhoan(tenDangNhap, matKhau))
		{
			//JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công.");
			new Frame_DangNhap().setVisible(true);
			dispose();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object o=e.getSource();
		if(o.equals(btnTroVe))
		{
			new Frame_DangNhap().setVisible(true);
			dispose();
		}
		if(o.equals(btnDangKiTaiKhoan))
		{
			new Frame_DangKi().setVisible(true);
			dispose();
		}
		if(o.equals(btnKiemTra))
		{
			if(kiemTraTextField())
			{
				kiemTraTaiKhoan();
			}
		}
		if(o.equals(btnDoiMatKhau))
		{
			if(kiemTraTextFieldMatKhau())
			{
				doiMatKhau();
			}			
		}

	}

}
