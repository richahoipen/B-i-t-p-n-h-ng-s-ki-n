package frame_DangNhap_DangKi;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import org.imgscalr.Scalr;

import dataBase_DAO.NhanVien_DAO;
import entities.NhanVien;
import frame_DanhSach.Frame_DanhSachHangHoaKho;
import list_DAO.HangHoaKho_List;

public class Frame_TrangChu_NhanVien extends JFrame implements ActionListener, ChangeListener, MouseListener
{
	private javax.swing.JButton btnChenAnh;
	private javax.swing.JButton btnDangXuat;
	private javax.swing.JButton btnDanhSachHangHoa;
	private javax.swing.JButton btnDanhSachHoaDon;
	private javax.swing.JButton btnInHoaDon;
	private javax.swing.JButton btnThayDoiThongTin;
	private javax.swing.JButton btnThoat;
	private javax.swing.JButton btnXemThongTin;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lblAnh;
	private javax.swing.JLabel lblDanhSachNhanVienKhac;
	private javax.swing.JLabel lblDiaChi;
	private javax.swing.JLabel lblEmail;
	private javax.swing.JLabel lblGioiTinh;
	private javax.swing.JLabel lblHoVaTen;
	private javax.swing.JLabel lblMatKhau;
	private javax.swing.JLabel lblSoDienThoai;
	private javax.swing.JLabel lblTenDangNhap;
	private javax.swing.JLabel lblTieuDe;
	private javax.swing.JLabel lblTuoi;
	private javax.swing.JPanel pnlAnh;
	private javax.swing.JPanel pnlThongTinCaNhan;
	private javax.swing.JRadioButton radHienThi;
	private javax.swing.JTable table;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtTuoi;
	private javax.swing.JTextField txtEmail;
	private javax.swing.JTextField txtGioiTinh;
	private javax.swing.JTextField txtHoVaTen;
	private javax.swing.JPasswordField txtMatKhau;
	private javax.swing.JTextField txtSoDienThoai;
	private javax.swing.JTextField txtTenDangNhap;
	private DefaultTableModel tableModel;
	private NhanVien_DAO sqlNhanVien = new NhanVien_DAO();

	public Frame_TrangChu_NhanVien(NhanVien n) 
	{
		setTitle("Xin chào: "+n.getHoVaTen());
		setSize(920, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initComponents();
		String tuoiString=Integer.toString(n.getTuoi());
		setTextField(n.getTenDangNhap(),n.getMatKhau(),n.getHoVaTen(),n.getGioiTinh(),n.getEmail(),n.getSoDienThoai(),n.getDiaChi(),tuoiString);
	}

	private void initComponents() {

		pnlThongTinCaNhan = new javax.swing.JPanel();
		pnlAnh = new javax.swing.JPanel();
		lblAnh = new javax.swing.JLabel();
		lblHoVaTen = new javax.swing.JLabel();
		lblGioiTinh = new javax.swing.JLabel();
		lblSoDienThoai = new javax.swing.JLabel();
		lblEmail = new javax.swing.JLabel();
		lblTuoi = new javax.swing.JLabel();
		lblDiaChi = new javax.swing.JLabel();
		lblTieuDe = new javax.swing.JLabel();
		lblTenDangNhap = new javax.swing.JLabel();
		txtTenDangNhap = new javax.swing.JTextField();
		lblMatKhau = new javax.swing.JLabel();
		txtHoVaTen = new javax.swing.JTextField();
		txtGioiTinh = new javax.swing.JTextField();
		txtSoDienThoai = new javax.swing.JTextField();
		txtEmail = new javax.swing.JTextField();
		txtDiaChi = new javax.swing.JTextField();
		txtTuoi = new javax.swing.JTextField();
		btnThayDoiThongTin = new javax.swing.JButton();
		btnChenAnh = new javax.swing.JButton();
		radHienThi = new javax.swing.JRadioButton();
		txtMatKhau = new javax.swing.JPasswordField();
		btnDangXuat = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		btnDanhSachHangHoa = new javax.swing.JButton();
		btnDanhSachHoaDon = new javax.swing.JButton();
		btnInHoaDon = new javax.swing.JButton();
		btnThoat = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		lblDanhSachNhanVienKhac = new javax.swing.JLabel();
		btnXemThongTin = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		pnlThongTinCaNhan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		pnlAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		lblAnh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblAnh.setText("");

		javax.swing.GroupLayout pnlAnhLayout = new javax.swing.GroupLayout(pnlAnh);
		pnlAnh.setLayout(pnlAnhLayout);
		pnlAnhLayout.setHorizontalGroup(pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlAnhLayout.createSequentialGroup().addGap(26, 26, 26).addComponent(lblAnh)
						.addContainerGap(27, Short.MAX_VALUE)));
		pnlAnhLayout.setVerticalGroup(pnlAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlAnhLayout.createSequentialGroup().addGap(60, 60, 60).addComponent(lblAnh)
						.addContainerGap(63, Short.MAX_VALUE)));

		lblHoVaTen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblHoVaTen.setText("Họ và tên: ");

		lblGioiTinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblGioiTinh.setText("Giới tính:");

		lblSoDienThoai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblSoDienThoai.setText("Số điện thoại:");

		lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblEmail.setText("Email:");

		lblTuoi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblTuoi.setText("Tuổi:");

		lblDiaChi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblDiaChi.setText("Địa chỉ:");

		lblTieuDe.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
		lblTieuDe.setForeground(new java.awt.Color(51, 51, 255));
		lblTieuDe.setText("THÔNG TIN NHÂN VIÊN");

		lblTenDangNhap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblTenDangNhap.setText("Tên đăng nhập:");

		txtTenDangNhap.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
		txtTenDangNhap.setForeground(new java.awt.Color(255, 0, 0));

		lblMatKhau.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
		lblMatKhau.setText("Mật khẩu:");

		txtHoVaTen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		txtHoVaTen.setForeground(new java.awt.Color(255, 0, 0));

		txtGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		txtGioiTinh.setForeground(new java.awt.Color(255, 0, 0));

		txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		txtSoDienThoai.setForeground(new java.awt.Color(255, 0, 0));

		txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		txtEmail.setForeground(new java.awt.Color(255, 0, 0));

		txtDiaChi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		txtDiaChi.setForeground(new java.awt.Color(255, 0, 0));

		txtTuoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		txtTuoi.setForeground(new java.awt.Color(255, 0, 0));

		btnThayDoiThongTin.setText("Thay đổi thông tin");

		btnChenAnh.setText("Chèn ảnh");
		btnChenAnh.setActionCommand("");
		btnChenAnh.setFocusPainted(false);

		radHienThi.setText("Hiển thị mật khẩu");

		btnDangXuat.setText("Đăng xuất");

		javax.swing.GroupLayout pnlThongTinCaNhanLayout = new javax.swing.GroupLayout(pnlThongTinCaNhan);
		pnlThongTinCaNhan.setLayout(pnlThongTinCaNhanLayout);
		pnlThongTinCaNhanLayout.setHorizontalGroup(pnlThongTinCaNhanLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnlThongTinCaNhanLayout.createSequentialGroup().addContainerGap()
						.addGroup(pnlThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblHoVaTen).addComponent(lblGioiTinh).addComponent(lblSoDienThoai)
								.addComponent(lblEmail).addComponent(lblDiaChi).addComponent(lblTuoi)
								.addComponent(pnlAnh, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(pnlThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblTieuDe, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(pnlThongTinCaNhanLayout.createSequentialGroup()
										.addGroup(pnlThongTinCaNhanLayout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(txtHoVaTen, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtSoDienThoai, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtGioiTinh, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 120,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtTuoi, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 40,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
														pnlThongTinCaNhanLayout.createSequentialGroup()
																.addComponent(btnThayDoiThongTin)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(btnDangXuat))
												.addGroup(pnlThongTinCaNhanLayout.createSequentialGroup()
														.addGroup(pnlThongTinCaNhanLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
																		pnlThongTinCaNhanLayout.createSequentialGroup()
																				.addGroup(pnlThongTinCaNhanLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(lblTenDangNhap)
																						.addComponent(lblMatKhau))
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED))
																.addGroup(pnlThongTinCaNhanLayout
																		.createSequentialGroup()
																		.addComponent(btnChenAnh).addGap(26, 26, 26)))
														.addGroup(pnlThongTinCaNhanLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING,
																		false)
																.addComponent(radHienThi).addComponent(txtTenDangNhap)
																.addComponent(txtMatKhau,
																		javax.swing.GroupLayout.DEFAULT_SIZE, 130,
																		Short.MAX_VALUE))))
										.addGap(0, 34, Short.MAX_VALUE)))));
		pnlThongTinCaNhanLayout
				.setVerticalGroup(pnlThongTinCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pnlThongTinCaNhanLayout.createSequentialGroup().addContainerGap()
								.addGroup(pnlThongTinCaNhanLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(pnlThongTinCaNhanLayout.createSequentialGroup()
												.addComponent(lblTieuDe)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(pnlThongTinCaNhanLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblTenDangNhap).addComponent(txtTenDangNhap,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(9, 9, 9)
												.addGroup(pnlThongTinCaNhanLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblMatKhau).addComponent(txtMatKhau,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(pnlThongTinCaNhanLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(radHienThi).addComponent(btnChenAnh))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(pnlThongTinCaNhanLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(btnThayDoiThongTin).addComponent(btnDangXuat)))
										.addComponent(pnlAnh, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18, 18, 18)
								.addGroup(pnlThongTinCaNhanLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblHoVaTen).addComponent(txtHoVaTen,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(pnlThongTinCaNhanLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblGioiTinh).addComponent(txtGioiTinh,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(pnlThongTinCaNhanLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblSoDienThoai).addComponent(txtSoDienThoai,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(pnlThongTinCaNhanLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblEmail).addComponent(txtEmail,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(pnlThongTinCaNhanLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblDiaChi).addComponent(txtDiaChi,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(pnlThongTinCaNhanLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblTuoi).addComponent(txtTuoi,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(117, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		btnDanhSachHangHoa.setText("Danh sách hàng hoá ");

		btnDanhSachHoaDon.setText("Danh sách hoá đơn");

		btnInHoaDon.setText("In hoá đơn");

		btnThoat.setText("Thoát");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(btnDanhSachHangHoa)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(btnDanhSachHoaDon)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnInHoaDon)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(btnThoat)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnDanhSachHangHoa).addComponent(btnDanhSachHoaDon)
								.addComponent(btnInHoaDon).addComponent(btnThoat))
						.addContainerGap(17, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 40, Short.MAX_VALUE));

		lblDanhSachNhanVienKhac.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		lblDanhSachNhanVienKhac.setForeground(new java.awt.Color(0, 0, 255));
		lblDanhSachNhanVienKhac.setText("Thông tin các nhân viên khác:");

		btnXemThongTin.setText("Xem thông tin");

		String[] headers = "Họ và tên ;Giới tính ;Email ;Số điện thoại ;Địa chỉ ;Tuổi".split(";");
		tableModel = new DefaultTableModel(headers, 0);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(table = new JTable(tableModel));
		jScrollPane1.setViewportView(table);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(pnlThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addComponent(lblDanhSachNhanVienKhac, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(btnXemThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 140,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(jScrollPane1))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(pnlThongTinCaNhan, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(lblDanhSachNhanVienKhac, javax.swing.GroupLayout.DEFAULT_SIZE, 50,
												Short.MAX_VALUE)
										.addComponent(btnXemThongTin, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(167, 167, 167)
						.addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
		lockTextField();
		addActionListener();
	}

	private void addActionListener() 
	{
		radHienThi.addChangeListener(this);
		btnThayDoiThongTin.addActionListener(this);
		btnDangXuat.addActionListener(this);
		btnXemThongTin.addActionListener(this);
		btnChenAnh.addActionListener(this);
		btnDanhSachHangHoa.addActionListener(this);
		lblAnh.addMouseListener(this);
	}
	private void lockTextField()
	{
		txtDiaChi.setEnabled(false);
		txtEmail.setEnabled(false);
		txtGioiTinh.setEnabled(false);
		txtHoVaTen.setEnabled(false);
		txtMatKhau.setEnabled(false);
		txtSoDienThoai.setEnabled(false);
		txtTenDangNhap.setEnabled(false);
		txtTuoi.setEnabled(false);
	}
	private void setTextField(String tenDangNhap,String matKhau,String hoVaTen,String gioiTinh, String email, String soDienThoai,String diaChi,String tuoi)
	{
		txtTenDangNhap.setText(tenDangNhap);
		txtMatKhau.setText(matKhau);
		txtHoVaTen.setText(hoVaTen);
		txtGioiTinh.setText(gioiTinh);
		txtEmail.setText(email);
		txtSoDienThoai.setText(soDienThoai);
		txtDiaChi.setText(diaChi);
		txtTuoi.setText(tuoi);
	}
	private void openTextField()
	{
		txtDiaChi.setEnabled(true);
		txtEmail.setEnabled(true);
		txtGioiTinh.setEnabled(true);
		txtHoVaTen.setEnabled(true);
		txtMatKhau.setEnabled(true);
		txtSoDienThoai.setEnabled(true);
		txtTenDangNhap.setEnabled(true);
		txtTuoi.setEnabled(true);
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
	private boolean kiemTraDuLieu() 
	{
		String tenDangNhap = txtTenDangNhap.getText();
		String matKhau = new String(txtMatKhau.getPassword());
		String hoVaTen = txtHoVaTen.getText();
		String email = txtEmail.getText();
		String soDienThoai = txtSoDienThoai.getText();
		String tuoi = txtTuoi.getText();
		String gioiTinh=txtGioiTinh.getText();
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
		if(!gioiTinh.equalsIgnoreCase("Nam") && !gioiTinh.equalsIgnoreCase("Nu"))
		{
			txtGioiTinh.setText("null");
			return false;
		}
		return true;
	}
	private void thayDoiThongTin()
	{
		String tenDangNhap = txtTenDangNhap.getText();
		String matKhau = new String(txtMatKhau.getPassword());
		String hoVaTen = txtHoVaTen.getText();
		String email = txtEmail.getText();
		String soDienThoai = txtSoDienThoai.getText();
		String tuoi = txtTuoi.getText();
		String gioiTinh=txtGioiTinh.getText();
		int tuoiInt = Integer.parseInt(tuoi);	
		NhanVien n=new NhanVien(tenDangNhap, matKhau, hoVaTen, gioiTinh, email, soDienThoai, gioiTinh, tuoiInt);
		sqlNhanVien.thayDoiThongTin(n);
		lockTextField();
	}
	private void xemThongTin()
	{
		String tenDangNhap=txtTenDangNhap.getText();
		sqlNhanVien.xuatBangNhanVienKhac(tableModel, tenDangNhap);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object o = e.getSource();
		String thayDoi="Thay đổi";
		if(o.equals(btnThayDoiThongTin) && btnThayDoiThongTin.getText().equalsIgnoreCase("Thay đổi thông tin"))
		{
			btnDangXuat.setText(thayDoi);
			btnThayDoiThongTin.setEnabled(false);
			openTextField();
		}
		if(o.equals(btnDangXuat) && btnDangXuat.getText().equalsIgnoreCase(thayDoi))
		{
			if(kiemTraDuLieu())
			{
				thayDoiThongTin();
				String tenDangNhap=txtTenDangNhap.getText();
				final NhanVien n=sqlNhanVien.duLieuNhanVien(tenDangNhap);
				java.awt.EventQueue.invokeLater(new Runnable() 
				{
					public void run() 
					{
						new Frame_TrangChu_NhanVien(n).setVisible(true);
						dispose();
					}
				});
			}
		}
		if(o.equals(btnDangXuat))
		{
			if(btnDangXuat.getText().equalsIgnoreCase("Đăng xuất"))
			{
				java.awt.EventQueue.invokeLater(new Runnable() 
				{
		            public void run() {
		                new Frame_DangNhap().setVisible(true);
		                dispose();
		            }
		        });
			}
		}
		if(o.equals(btnXemThongTin))
		{
			tableModel.setRowCount(0);
			xemThongTin();
		}
	}
	private void xoaAnhAction()
	{
		int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn xoá ảnh không.");
        if (option == JOptionPane.YES_OPTION) 
        {
            lblAnh.setText("");
        }
	}
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		Object o = e.getSource();
		if(o.equals(lblAnh))
		{
			xoaAnhAction();
		}
		if(o.equals(btnDanhSachHangHoa))
		{
			HangHoaKho_List dao = new HangHoaKho_List();
			new Frame_DanhSachHangHoaKho(dao, txtTenDangNhap.getText());
			dispose();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

