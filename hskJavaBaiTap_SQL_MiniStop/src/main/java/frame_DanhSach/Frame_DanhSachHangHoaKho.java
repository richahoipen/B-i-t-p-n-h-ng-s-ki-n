package frame_DanhSach;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.time.LocalDate;

import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dataBase_DAO.HangHoaKho_DAO;
import dataBase_DAO.NhanVien_DAO;
import entities.HangHoaKho;
import entities.NhanVien;
import frame_DangNhap_DangKi.Frame_TrangChu_NhanVien;
import list_DAO.HangHoaKho_List;


public class Frame_DanhSachHangHoaKho extends JFrame implements ActionListener, MouseListener {
	/**
	 * @return the tenDangNhap
	 */
	public String getTenDangNhap() {
		return tenDangNhap;
	}

	/**
	 * @param tenDangNhap the tenDangNhap to set
	 */
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	private javax.swing.JButton btnCapNhat;
	private javax.swing.JButton btnThem;
	private javax.swing.JButton btnThemVaoHoaDon;
	private javax.swing.JButton btnTroVe;
	private javax.swing.JButton btnXemDanhSach;
	private javax.swing.JButton btnXoa;
	private com.toedter.calendar.JDateChooser dateHetHan;
	private com.toedter.calendar.JDateChooser dateSanXuat;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable table;
	private javax.swing.JLabel lblGiaCa;
	private javax.swing.JLabel lblGiaCa1;
	private javax.swing.JLabel lblMaHangHoa;
	private javax.swing.JLabel lblMaHangHoa1;
	private javax.swing.JLabel lblNgayHetHan;
	private javax.swing.JLabel lblNgayHetHan1;
	private javax.swing.JLabel lblNgaySanXuat;
	private javax.swing.JLabel lblNgaySanXuat1;
	private javax.swing.JLabel lblSetGiaCa;
	private javax.swing.JLabel lblSetMaHangHoa;
	private javax.swing.JLabel lblSetNgayHetHan;
	private javax.swing.JLabel lblSetNgaySanXuat;
	private javax.swing.JLabel lblSetSoLuong;
	private javax.swing.JLabel lblSetTenHangHoa;
	private javax.swing.JLabel lblSoLuong;
	private javax.swing.JLabel lblSoLuong1;
	private javax.swing.JLabel lblTenHangHoa;
	private javax.swing.JLabel lblTenHangHoa1;
	private javax.swing.JLabel lblThongTin;
	private javax.swing.JLabel lblTieuDe;
	private javax.swing.JTextField txtGiaCa;
	private javax.swing.JTextField txtMaHangHoa;
	private javax.swing.JTextField txtSoLuong;
	private javax.swing.JTextField txtTenHangHoa;
	private DefaultTableModel tableModel;
	private String tenDangNhap;
	private HangHoaKho_List dao;
	private List<HangHoaKho> list;
	private HangHoaKho_DAO sqlHangHoaKho = new HangHoaKho_DAO();
	private NhanVien_DAO sqlNhanVien = new NhanVien_DAO();
	
	public Frame_DanhSachHangHoaKho(HangHoaKho_List dao,String tenDangNhap) {
		setTitle("Danh sách hàng hoá kho do nhân viên có tên đăng nhập là "+tenDangNhap+" quản lí");
		setSize(2000, 550);
		this.dao = dao;// set dao
		list = dao.getListHangHoaKho();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		initComponents();
	}

	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		btnTroVe = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		lblMaHangHoa = new javax.swing.JLabel();
		lblTenHangHoa = new javax.swing.JLabel();
		txtMaHangHoa = new javax.swing.JTextField();
		txtTenHangHoa = new javax.swing.JTextField();
		lblNgaySanXuat = new javax.swing.JLabel();
		dateSanXuat = new com.toedter.calendar.JDateChooser();
		lblNgayHetHan = new javax.swing.JLabel();
		dateHetHan = new com.toedter.calendar.JDateChooser();
		lblSoLuong = new javax.swing.JLabel();
		lblGiaCa = new javax.swing.JLabel();
		txtGiaCa = new javax.swing.JTextField();
		txtSoLuong = new javax.swing.JTextField();
		lblThongTin = new javax.swing.JLabel();
		lblMaHangHoa1 = new javax.swing.JLabel();
		lblTenHangHoa1 = new javax.swing.JLabel();
		lblNgaySanXuat1 = new javax.swing.JLabel();
		lblNgayHetHan1 = new javax.swing.JLabel();
		lblGiaCa1 = new javax.swing.JLabel();
		lblSoLuong1 = new javax.swing.JLabel();
		lblSetMaHangHoa = new javax.swing.JLabel();
		lblSetTenHangHoa = new javax.swing.JLabel();
		lblSetNgaySanXuat = new javax.swing.JLabel();
		lblSetNgayHetHan = new javax.swing.JLabel();
		lblSetGiaCa = new javax.swing.JLabel();
		lblSetSoLuong = new javax.swing.JLabel();
		lblTieuDe = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		btnThem = new javax.swing.JButton();
		btnXoa = new javax.swing.JButton();
		btnXemDanhSach = new javax.swing.JButton();
		btnCapNhat = new javax.swing.JButton();
		btnThemVaoHoaDon = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		table = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 255, 255));
		setPreferredSize(new java.awt.Dimension(1050, 550));

		btnTroVe.setText("Trở về");
		/*
		 * clearSelectionButton.addActionListener(e -> {
                // Xóa lựa chọn trên JTable
                table.clearSelection();
            });
		*/
		
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(btnTroVe)
						.addContainerGap(19, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(btnTroVe)
						.addContainerGap(21, Short.MAX_VALUE)));

		lblMaHangHoa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblMaHangHoa.setText("Mã hàng hoá: ");

		lblTenHangHoa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblTenHangHoa.setText("Tên hàng hoá:");

		lblNgaySanXuat.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblNgaySanXuat.setText("Ngày sản xuất:");

		lblNgayHetHan.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblNgayHetHan.setText("Ngày hết hạn:");

		lblSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblSoLuong.setText("Số lượng:");

		lblGiaCa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblGiaCa.setText("Giá cả:");
		lblGiaCa.setToolTipText("");

		lblThongTin.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
		lblThongTin.setText("Thông tin chi tiết:");

		lblMaHangHoa1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblMaHangHoa1.setText("Mã hàng hoá: ");

		lblTenHangHoa1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblTenHangHoa1.setText("Tên hàng hoá:");

		lblNgaySanXuat1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblNgaySanXuat1.setText("Ngày sản xuất:");

		lblNgayHetHan1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblNgayHetHan1.setText("Ngày hết hạn:");

		lblGiaCa1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblGiaCa1.setText("Giá cả (VND):");
		lblGiaCa1.setToolTipText("");

		lblSoLuong1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
		lblSoLuong1.setText("Số lượng:");

		lblSetMaHangHoa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

		lblSetTenHangHoa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

		lblSetNgaySanXuat.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

		lblSetNgayHetHan.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

		lblSetGiaCa.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

		lblSetSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblThongTin, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createSequentialGroup()
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lblMaHangHoa).addComponent(lblTenHangHoa)
										.addComponent(lblNgaySanXuat))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtTenHangHoa).addComponent(txtMaHangHoa)
										.addGroup(jPanel2Layout.createSequentialGroup()
												.addComponent(dateSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(0, 151, Short.MAX_VALUE))))
						.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lblNgayHetHan).addComponent(lblGiaCa).addComponent(lblSoLuong))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(jPanel2Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel2Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(dateHetHan, javax.swing.GroupLayout.DEFAULT_SIZE,
																150, Short.MAX_VALUE)
														.addComponent(txtGiaCa))
												.addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblMaHangHoa1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(lblSetMaHangHoa))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblTenHangHoa1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(lblSetTenHangHoa))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblNgaySanXuat1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(lblSetNgaySanXuat))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblNgayHetHan1)
										.addGap(18, 18, 18).addComponent(lblSetNgayHetHan))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblGiaCa1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(lblSetGiaCa))
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(lblSoLuong1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(lblSetSoLuong)))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblMaHangHoa).addComponent(txtMaHangHoa,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblTenHangHoa).addComponent(txtTenHangHoa,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(lblNgaySanXuat).addComponent(dateSanXuat,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblNgayHetHan).addComponent(dateHetHan,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(lblGiaCa).addComponent(txtGiaCa, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblSoLuong).addComponent(txtSoLuong,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(lblThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblMaHangHoa1).addComponent(lblSetMaHangHoa))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblTenHangHoa1).addComponent(lblSetTenHangHoa))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblNgaySanXuat1).addComponent(lblSetNgaySanXuat))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblNgayHetHan1).addComponent(lblSetNgayHetHan))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblGiaCa1).addComponent(lblSetGiaCa))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblSoLuong1).addComponent(lblSetSoLuong))
						.addContainerGap(93, Short.MAX_VALUE)));

		lblTieuDe.setFont(new java.awt.Font("Arial", 3, 35)); // NOI18N
		lblTieuDe.setForeground(new java.awt.Color(255, 0, 0));
		lblTieuDe.setText("KHO HÀNG HOÁ MINISTOP");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));

		btnThem.setText("Thêm");

		btnXoa.setText("Xoá");

		btnXemDanhSach.setText("Xem danh sách");

		btnCapNhat.setText("Cập nhật");

		btnThemVaoHoaDon.setText("Thêm vào hoá đơn");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(
						jPanel4Layout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btnXemDanhSach).addGap(18, 18, 18)
										.addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(btnThemVaoHoaDon)
										.addGap(0, 0, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnXemDanhSach, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnThemVaoHoaDon)));

		String[] headers = "Mã hàng hoá;Tên hàng hoá;Ngày sản xuất;Ngày hết hạn;Giá cả (VND);Số lượng (món)".split(";");
		tableModel = new DefaultTableModel(headers, 0);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(table = new JTable(tableModel));
		jScrollPane1.setViewportView(table);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(60, 60, 60)
						.addComponent(
								lblTieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 463,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTieuDe))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1)))
				.addContainerGap()));
		pack();
		addActionListener();
		addMouseListener();
	}

	private void addActionListener() 
	{
		btnThem.addActionListener(this);
		btnXoa.addActionListener(this);
		btnXemDanhSach.addActionListener(this);
		btnCapNhat.addActionListener(this);
	}
	private void addMouseListener() 
	{
		table.addMouseListener(this);
		lblSetGiaCa.addMouseListener(this);
		lblSetMaHangHoa.addMouseListener(this);
		lblSetNgayHetHan.addMouseListener(this);
		lblSetSoLuong.addMouseListener(this);
		lblSetTenHangHoa.addMouseListener(this);
		lblSetNgayHetHan.addMouseListener(this);
		lblSetNgaySanXuat.addMouseListener(this);
	}
	/*
	 * public void mouseClicked(MouseEvent e) 
	{
		int row=table.getSelectedRow();
		txtName.setEnabled(false);
		txtName.setText(table.getValueAt(row, 0).toString());
		txtCapital.setText(table.getValueAt(row, 1).toString());
		txtPopulation.setText(table.getValueAt(row, 2).toString());
		txtClubChampion.setText(table.getValueAt(row, 3).toString());
	}
	 */
	private void setText(int row)
	{
		txtMaHangHoa.setText(table.getValueAt(row, 0).toString());
		txtTenHangHoa.setText(table.getValueAt(row, 1).toString());
		txtGiaCa.setText(table.getValueAt(row, 4).toString());
		txtSoLuong.setText(table.getValueAt(row, 5).toString());		
		dateSanXuat.setDate(new Date());
		dateHetHan.setDate(new Date());		
	}
	private void setLabel(int row)
	{
		lblSetMaHangHoa.setText(table.getValueAt(row, 0).toString());
		lblSetTenHangHoa.setText(table.getValueAt(row, 1).toString());
		lblSetNgaySanXuat.setText(table.getValueAt(row, 2).toString());
		lblSetNgayHetHan.setText(table.getValueAt(row, 3).toString());
		lblSetGiaCa.setText(table.getValueAt(row, 4).toString());
		lblSetSoLuong.setText(table.getValueAt(row, 5).toString());
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		int row=table.getSelectedRow();
		setText(row);	
		setLabel(row);
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
	private LocalDate getDateSanXuatJDateChooser() 
	{
        Date date = dateSanXuat.getDate();
        if(date!=null)  
        	return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        else
        	return null;
    }
	private LocalDate getDateHetHanJDateChooser() 
	{
        Date date = dateHetHan.getDate();
        if(date!=null)  
        	return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        else
        	return null;
    }
	private boolean kiemTraTextField()
	{
		String maHangHoa=txtMaHangHoa.getText();
		String tenHangHoa=txtTenHangHoa.getText();
		String giaCa=txtGiaCa.getText();
		double giaCaDouble=Double.parseDouble(giaCa);
		String soLuong=txtSoLuong.getText();
		int soLuongInt=Integer.parseInt(soLuong);		
		if(maHangHoa.trim().equals("")||tenHangHoa.trim().equals("")||giaCa.trim().equals("")||soLuong.trim().equals(""))
		{
			JOptionPane.showMessageDialog(null, "Vui lòng nhập hết dữ liệu.");
			return false;
		}
		if(getDateSanXuatJDateChooser()==null||getDateHetHanJDateChooser()==null)
		{
			JOptionPane.showMessageDialog(null, "Vui lòng chọn ngày tháng năm.");
			return false;
		}
		//"\\d+"
		if(!maHangHoa.matches("^[a-zA-Z0-9]{4}$"))
		{
			JOptionPane.showMessageDialog(null, "Mã hàng hoá không hợp lệ.");
			txtMaHangHoa.requestFocus();
			return false;
		}
		if(!giaCa.matches("\\d+"))
		{
			JOptionPane.showMessageDialog(null, "Giá cả phải là số. Ví dụ 10000");
			txtGiaCa.requestFocus();
			return false;
		}
		if(giaCaDouble<=0)
		{
			JOptionPane.showMessageDialog(null, "Giá cả không được âm.");
			txtGiaCa.requestFocus();
			return false;
		}
		if(!soLuong.matches("\\d+"))
		{
			JOptionPane.showMessageDialog(null, "Số lượng phải là số.");
			txtSoLuong.requestFocus();
			return false;
		}
		if(soLuongInt<=0)
		{
			JOptionPane.showMessageDialog(null, "Số lượng không được âm.");
			txtSoLuong.requestFocus();
			return false;
		}
		if(getDateSanXuatJDateChooser().isAfter(getDateHetHanJDateChooser()))
		{
			JOptionPane.showMessageDialog(null, "Ngày sản xuất phải trước ngày hết hạn.");
			return false;
		}
		return true;
	}
	/*
	 * try 
		{
			String name = txtName.getText();
			String capital = txtCapital.getText();
			String population = txtPopulation.getText();
			String clubChampion = txtClubChampion.getText();
			Country c = new Country(name, capital, Integer.parseInt(population), clubChampion);
			if (dao.addCountry(c)) 
			{
				String[] row = { name, capital, population, clubChampion +""};
				tableModel.addRow(row);
				sqlCountries.insertCountry(c);
				resetField();
			} else 
			{
				JOptionPane.showMessageDialog(null, "Country can't same name.");
				txtName.selectAll();
				txtName.requestFocus();
			}
		} catch (Exception ex) 
		{
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR 1: " + ex.getMessage());

		}
	 */
	private void resetField()
	{
		txtMaHangHoa.setText("");
		txtTenHangHoa.setText("");
		txtGiaCa.setText("");
		txtSoLuong.setText("");
		dateSanXuat.setDate(new Date());
		dateHetHan.setDate(new Date());
	}
	private void themActions()
	{
		String maHangHoa=txtMaHangHoa.getText();
		String tenHangHoa=txtTenHangHoa.getText();
		String giaCa=txtGiaCa.getText();
		double giaCaDouble=Double.parseDouble(giaCa);
		String soLuong=txtSoLuong.getText();
		int soLuongInt=Integer.parseInt(soLuong);
		//HangHoaKho(String maHangHoa, String tenHangHoa, LocalDate ngaySanXuat, LocalDate ngayHetHan, double giaCa,int soLuong)		
		//DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try 
		{
			HangHoaKho h=new HangHoaKho(maHangHoa, tenHangHoa,dateSanXuat.getDate(), dateHetHan.getDate(), giaCaDouble, soLuongInt);
			if (dao.themHangHoaKho(h)) 
			{
				String[] row = {maHangHoa,tenHangHoa,dateSanXuat.getDate().toString(),dateHetHan.getDate().toString(),Double.toString(giaCaDouble),soLuong+""};
				tableModel.addRow(row);
				sqlHangHoaKho.themHangHoaKho(h);
				resetField();			
			}else 
			{
				JOptionPane.showMessageDialog(null, "Hàng hoá trùng nhau.");
				txtMaHangHoa.selectAll();
				txtMaHangHoa.requestFocus();
			}
		} catch (Exception ex) 
		{
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}		
	}
	/*
	 * private void deleteCountry() 
	{
		int row = table.getSelectedRow();
		if (row != -1) 
		{
			String name = ((String) table.getModel().getValueAt(row, 0));
			int kTra = JOptionPane.showConfirmDialog(this, "Chắc chắn xoá không", "Chú ý", JOptionPane.YES_NO_OPTION);
			if (kTra == JOptionPane.YES_OPTION) 
			{
				if (dao.deleteCountry(name))
				{
					tableModel.removeRow(row);
					sqlCountries.deleteCountry(name);
					txtName.setEnabled(true);
				}
					
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Choose row to delete.");
		}
	}
	 */
	private void xoaActions()
	{
		int row = table.getSelectedRow();
		if (row != -1) 
		{
			String maHangHoa = ((String) table.getModel().getValueAt(row, 0));
			tableModel.removeRow(row);
			sqlHangHoaKho.xoaHangHoaKho(maHangHoa);		
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng để xoá.");
		}
	}
	private void capNhatActions()
	{	
		int row = table.getSelectedRow();
		if (row != -1) 
		{
			String maHangHoa=txtMaHangHoa.getText();
			String tenHangHoa=txtTenHangHoa.getText();
			String giaCa=txtGiaCa.getText();
			double giaCaDouble=Double.parseDouble(giaCa);
			String soLuong=txtSoLuong.getText();
			int soLuongInt=Integer.parseInt(soLuong);
			HangHoaKho h=new HangHoaKho(maHangHoa, tenHangHoa,dateSanXuat.getDate(), dateHetHan.getDate(), giaCaDouble, soLuongInt);
			sqlHangHoaKho.capNhatHangHoaKho(h);	
			tableModel.setValueAt(h.getMaHangHoa(), row, 0);
			tableModel.setValueAt(h.getTenHangHoa(), row, 1);
			tableModel.setValueAt(h.getNgaySanXuatLocalDate(), row, 2);
			tableModel.setValueAt(h.getNgayHetHanLocalDate(), row, 3);
			tableModel.setValueAt(h.getGiaCa(), row, 4);
			tableModel.setValueAt(h.getSoLuong(), row, 5);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng để cập nhật.");
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object o=e.getSource();
		
		if(o.equals(btnThem))
		{
			int row = table.getSelectedRow();
			if(row!=-1)
			{
				JOptionPane.showMessageDialog(null, "Đang chọn dòng thì không thể thêm.");
				table.clearSelection();
			}
			if(kiemTraTextField()==true)
			{
				themActions();
			}
		}
		if(o.equals(btnXoa))
		{
			xoaActions();
		}
		if(o.equals(btnXemDanhSach))
		{
			tableModel.setRowCount(0);
			sqlHangHoaKho.xuatDanhSachHangHoaKho(tableModel);
		}
		if(o.equals(btnTroVe))
		{
			NhanVien n=sqlNhanVien.duLieuNhanVien(getTenDangNhap());
			new Frame_TrangChu_NhanVien(n).setVisible(true);
			dispose();			
		}
		if(o.equals(btnCapNhat))
		{			
			capNhatActions();			
		}
	}

}
