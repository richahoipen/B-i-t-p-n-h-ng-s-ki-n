package frame_DangNhap_DangKi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import dataBase_DAO.NhanVien_DAO;
import entities.NhanVien;

public class Frame_DangNhap extends JFrame implements ActionListener, ChangeListener
{
	private javax.swing.JButton btnDangKi;
	private javax.swing.JButton btnQuenMatKhau;
	private javax.swing.JButton btnThoat;
	private javax.swing.JButton btnDangNhap;
	private javax.swing.JPasswordField txtMatKhau;
	private javax.swing.JProgressBar progressBar;
	private javax.swing.JLabel lblChuoiCapcha;
	private javax.swing.JRadioButton radHienThi;
	private javax.swing.JLabel lblMaCapcha;
	private javax.swing.JLabel lblMatKhau;
	private javax.swing.JLabel lblTenDangNhap;
	private javax.swing.JLabel lblTieuDe;
	private javax.swing.JTextField txtCapcha;
	private javax.swing.JTextField txtTenDangNhap;
	private NhanVien_DAO sqlNhanVien = new NhanVien_DAO();

	public Frame_DangNhap() 
	{
		setTitle("Đăng nhập tài khoản");
		setSize(458, 294);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initComponents();
	}

	private void initComponents() 
	{

		lblTieuDe = new javax.swing.JLabel();
		lblTenDangNhap = new javax.swing.JLabel();
		lblMatKhau = new javax.swing.JLabel();
		txtTenDangNhap = new javax.swing.JTextField();
		txtMatKhau = new javax.swing.JPasswordField();
		lblMaCapcha = new javax.swing.JLabel();
		txtCapcha = new javax.swing.JTextField();
		radHienThi = new javax.swing.JRadioButton();
		lblChuoiCapcha = new javax.swing.JLabel();
		btnDangNhap = new javax.swing.JButton();
		btnQuenMatKhau = new javax.swing.JButton();
		btnDangKi = new javax.swing.JButton();
		btnThoat = new javax.swing.JButton();
		progressBar = new javax.swing.JProgressBar(0, 100);
		progressBar.setStringPainted(true);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		lblTieuDe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
		lblTieuDe.setForeground(new java.awt.Color(255, 0, 0));
		lblTieuDe.setText("ĐĂNG NHẬP THÔNG TIN NHÂN VIÊN");

		lblTenDangNhap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblTenDangNhap.setText("Tên đăng nhập:");

		lblMatKhau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblMatKhau.setText("Mật khẩu:");


		lblMaCapcha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblMaCapcha.setText("Mã Capcha:");

		radHienThi.setText("Hiển thị mật khẩu");

		lblChuoiCapcha.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
		lblChuoiCapcha.setText(generateRandomString());

		btnDangNhap.setText("Đăng nhập");

		btnQuenMatKhau.setText("Quên mật khẩu");

		btnDangKi.setText("Đăng kí tài khoản");

		btnThoat.setText("Thoát");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup().addGap(57, 57, 57).addComponent(lblTieuDe,
								javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addGap(16, 16, 16)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lblTenDangNhap).addComponent(lblMatKhau)
										.addComponent(lblMaCapcha))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(radHienThi)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(txtTenDangNhap)
												.addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE,
														272, Short.MAX_VALUE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE,
																115, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(28, 28, 28).addComponent(lblChuoiCapcha,
																javax.swing.GroupLayout.PREFERRED_SIZE, 74,
																javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addGroup(layout.createSequentialGroup().addContainerGap()
								.addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnQuenMatKhau)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnDangKi)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(progressBar,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)))
				.addContainerGap(19, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(lblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblTenDangNhap)
								.addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMatKhau))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(radHienThi)
						.addGap(11, 11, 11)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(lblMaCapcha)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(lblChuoiCapcha)))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnDangNhap).addComponent(btnQuenMatKhau).addComponent(btnDangKi)
								.addComponent(btnThoat))
						.addGap(28, 28, 28).addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(24, Short.MAX_VALUE)));

		pack();
		addActionListener();
	}

	private void addActionListener() 
	{
		radHienThi.addChangeListener(this);
		btnDangKi.addActionListener(this);
		btnDangNhap.addActionListener(this);
		btnQuenMatKhau.addActionListener(this);
		btnThoat.addActionListener(this);
	}
	private void resetAll()
	{
		txtTenDangNhap.setText("");
		txtMatKhau.setText("");
		txtCapcha.setText("");
		radHienThi.setSelected(false);
	}
	private String generateRandomString() 
	{
		// Chuỗi các ký tự chữ in hoa
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Chuỗi các ký tự số
        String digits = "0123456789";

        // Tạo ngẫu nhiên một kí tự số
        Random random = new Random();
        char randomDigit = digits.charAt(random.nextInt(digits.length()));

        // Tạo ngẫu nhiên 3 kí tự chữ in hoa
        StringBuilder randomLetters = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char randomLetter = uppercaseLetters.charAt(random.nextInt(uppercaseLetters.length()));
            randomLetters.append(randomLetter);
        }

        // Kết hợp kí tự số và kí tự chữ in hoa để tạo chuỗi kết quả
        return randomLetters.toString() + randomDigit;
    }
	private void kiemTraTaiKhoan()
	{
		String tenDangNhap=txtTenDangNhap.getText();
		String matKhau=new String(txtMatKhau.getPassword());
		String capcha=txtCapcha.getText();
		String capchaLablel=lblChuoiCapcha.getText();
		
		if (tenDangNhap.trim().equals("") || matKhau.trim().equals("")) 
		{
			JOptionPane.showMessageDialog(null, "Vui lòng nhập tên và mật khẩu.");
			lblChuoiCapcha.setText(generateRandomString());
		}
		else
		{
			
			if(sqlNhanVien.kiemTraTaiKhoanNhanVien(tenDangNhap, matKhau))
			{			
				if(capcha.equalsIgnoreCase(capchaLablel))
				{					
					JOptionPane.showMessageDialog(null, "Đăng nhập thành công.");
					startProgress(tenDangNhap);
				
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Mã Capcha sai.");
				}				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng.");
				resetAll();
				lblChuoiCapcha.setText(generateRandomString());
			}
		}
	}
	private void startProgress(final String tenDangNhap) 
	{
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() 
		{
			@Override
			public void run() {
				for (int i = 0; i <= 100; i++) 
				{
					final int progress = i;

					try {
						Thread.sleep(50); // Giả lập quá trình download
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					SwingUtilities.invokeLater(new Runnable() 
					{
						@Override
						public void run() 
						{
							progressBar.setValue(progress);
							progressBar.setString(progress + "%");
						}
					});
				}
				final NhanVien n=sqlNhanVien.duLieuNhanVien(tenDangNhap);
				new Frame_TrangChu_NhanVien(n).setVisible(true);
				dispose();
			}
		});
		executorService.shutdown();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object o = e.getSource();
		if(o.equals(btnDangKi))
		{
			new Frame_DangKi().setVisible(true);
			dispose();
		}
		if(o.equals(btnDangNhap))
		{			
			kiemTraTaiKhoan();			
		}
		if(o.equals(btnQuenMatKhau))
		{
			new Frame_LayMatKhau().setVisible(true);
			dispose();
		}
		if(o.equals(btnThoat))
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
