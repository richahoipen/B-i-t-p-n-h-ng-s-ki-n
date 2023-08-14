package dataBase_DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;

import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dataBase.Connect;
import entities.HangHoaKho;

public class HangHoaKho_DAO {

	Connect con = new Connect();

	public HangHoaKho_DAO() {
		super();
	}

	// Hàm thêm hàng hoá
	/*
	 * try {
	 * 
	 * String sqlInsert
	 * ="insert into NhanVien(tenDangNhap,matKhau,hoVaTen,gioiTinh,email,soDienThoai,diaChi,tuoi) "
	 * +"values ('" +n.getTenDangNhap()+"','" +n.getMatKhau()+"','"
	 * +n.getHoVaTen()+"','" +n.getGioiTinh()+"','" +n.getEmail()+"','"
	 * +n.getSoDienThoai()+"','" +n.getDiaChi()+"'," +n.getTuoi()+")";
	 * con.stmt().executeUpdate(sqlInsert);
	 * JOptionPane.showMessageDialog(null,"Bạn đã đăng kí thành công.");
	 * con.con().close(); } catch (Exception e1) { e1.printStackTrace();
	 * JOptionPane.showMessageDialog(null, e1.getMessage()); } insert into
	 * HangHoaKho(maHangHoa,tenHangHoa,ngaySanXuat,ngayHetHan,giaCa,soLuong) values
	 * ('G234','Glister','2022-08-02','2024-03-23',20000,20) "+ +"
	 */
	public void themHangHoaKho(HangHoaKho h) {
		try {
			String sqlInsert = "insert into HangHoaKho(maHangHoa,tenHangHoa,ngaySanXuat,ngayHetHan,giaCa,soLuong) \r\n"
					+ "values ('" + h.getMaHangHoa() + "','" + h.getTenHangHoa()+ "','" + h.getNgaySanXuatLocalDate() + "','"
					+ h.getNgayHetHanLocalDate() + "'," + h.getGiaCa() + "," + h.getSoLuong() + ")";
			con.stmt().executeUpdate(sqlInsert);
			JOptionPane.showMessageDialog(null, "Hàng hoá với mã là "+h.getMaHangHoa()+" đã được thêm vào kho.");

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	// delete from HangHoaKho where maHangHoa='A01';
	public void xoaHangHoaKho(String maHangHoa) 
	{
		try 
		{
			String sqlDelete="delete from HangHoaKho where maHangHoa='"+maHangHoa+"';";
			con.stmt().executeUpdate(sqlDelete);
			JOptionPane.showMessageDialog(null, "Hàng hoá với mã là "+maHangHoa+" đã được xoá.");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	/*
	 * public void xuatBangNhanVienKhac(DefaultTableModel tableModel,String tenDangNhap)
	{
		String sqlSelect="select hoVaTen, gioiTinh, email, soDienThoai, diaChi, tuoi from NhanVien \r\n"
				+ "WHERE tenDangNhap <> '"+tenDangNhap+"';";
		try 
		{
			ResultSet rs=con.resultSet(sqlSelect);
			while(rs.next())
			{
				String hoVaTen=rs.getString("hoVaTen");
				String gioiTinh=rs.getString("gioiTinh");
				String email=rs.getString("email");
				String soDienThoai=rs.getString("soDienThoai");
				String diaChi=rs.getString("diaChi");
				int tuoiInt=rs.getInt("tuoi");
				String[] row = {hoVaTen,gioiTinh,email,soDienThoai,diaChi,Integer.toString(tuoiInt)+""};
				tableModel.addRow(row);
			}
			con.con().close();	
			con.stmt().close();	
		} catch (Exception e7) 
		{	
			e7.printStackTrace();
			JOptionPane.showMessageDialog(null, e7.getMessage());
		}
		
	}
	 */
	/*
	 * use Ministop
	SELECT * FROM HangHoaKho
	ORDER BY tenHangHoa;
	 */
	
	public void xuatDanhSachHangHoaKho(DefaultTableModel tableModel)
	{
		String sqlSelect="Select*from HangHoaKho ORDER BY tenHangHoa;";
		try
		{
			ResultSet rs=con.resultSet(sqlSelect);
			while(rs.next())
			{
				String maHangHoa=rs.getString("maHangHoa");
				String tenHangHoa=rs.getString("tenHangHoa");
				Date ngaySanXuat=rs.getDate("ngaySanXuat");
				//LocalDate ngaySanXuatLocalDate=ngaySanXuat.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				Date ngayHetHan=rs.getDate("ngayHetHan");
				//LocalDate ngayHetHanLocalDate=ngayHetHan.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
				double giaCa=rs.getDouble("giaCa");
				int soLuong=rs.getInt("soLuong");
				HangHoaKho h=new HangHoaKho(maHangHoa, tenHangHoa, ngaySanXuat, ngayHetHan, giaCa, soLuong);
				//String[] row= {h.getMaHangHoa(),h.getTenHangHoa(),dateFormatter.format(h.getNgaySanXuatLocalDate()),dateFormatter.format(h.getNgayHetHanLocalDate()),Double.toString(giaCa),Integer.toString(soLuong)};
				String[] row= {h.getMaHangHoa(),h.getTenHangHoa(),ngaySanXuat.toString(),ngayHetHan.toString(),Double.toString(giaCa),Integer.toString(soLuong)};
				tableModel.addRow(row);
			}
			con.con().close();	
			con.stmt().close();		
		}catch(SQLException e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}		
	}
	/*
	 * UPDATE HangHoaKho
		SET maHangHoa='EUSU',
		tenHangHoa='Sua nguoi gia',
		ngaySanXuat='2020-03-02',
		ngayHetHan='2023-03-02',
		giaCa=500000,
		soLuong=100
		WHERE maHangHoa='EUR2';
	 */
	public void capNhatHangHoaKho(HangHoaKho h)
	{
		String sqlUpdate="UPDATE HangHoaKho\r\n"
				+ "		SET maHangHoa='"+h.getMaHangHoa()+"',\r\n"
				+ "		tenHangHoa='"+h.getTenHangHoa()+"',\r\n"
				+ "		ngaySanXuat='"+h.getNgaySanXuatLocalDate()+"',\r\n"
				+ "		ngayHetHan='"+h.getNgayHetHanLocalDate()+"',\r\n"
				+ "		giaCa="+h.getGiaCa()+",\r\n"
				+ "		soLuong="+h.getSoLuong()+"\r\n"
				+ "		WHERE maHangHoa='"+h.getMaHangHoa()+"';";
		try 
		{
			
			con.stmt().executeUpdate(sqlUpdate);
			JOptionPane.showMessageDialog(null, "Hàng hoá với mã là "+h.getMaHangHoa()+" đã được cập nhật.");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
	}
}
