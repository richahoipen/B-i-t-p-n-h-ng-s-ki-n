package dataBase_DAO;


import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dataBase.Connect;

import entities.NhanVien;



public class NhanVien_DAO 
{

	public NhanVien_DAO() {
		super();
		
	}
	Connect con=new Connect();
	//--NhanVien(String tenDangNhap, String matKhau, String hoVaTen, String gioiTinh, String email,String soDienThoai, String diaChi, int tuoi)
	/*
	 * insert into NhanVien(tenDangNhap,matKhau,hoVaTen,gioiTinh,email,soDienThoai,diaChi,tuoi) 
		values ('minh123','12345','Nguyen Van Minh','Nam','minhcute@gmail.com','0987646635','Hue',35)
	 */
	public void themNhanVien(NhanVien n)
	{		
		try 
		{			
			
			String sqlInsert ="insert into NhanVien(tenDangNhap,matKhau,hoVaTen,gioiTinh,email,soDienThoai,diaChi,tuoi) "
			+"values ('"
			+n.getTenDangNhap()+"','"
			+n.getMatKhau()+"','"
			+n.getHoVaTen()+"','"
			+n.getGioiTinh()+"','"
			+n.getEmail()+"','"
			+n.getSoDienThoai()+"','"
			+n.getDiaChi()+"',"
			+n.getTuoi()+")";								
			con.stmt().executeUpdate(sqlInsert);
			JOptionPane.showMessageDialog(null,"Bạn đã đăng kí thành công.");
			con.con().close();			
		} catch (SQLException e1) 
		{	
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}
	/*
	 * try {
			// Kết nối tới cơ sở dữ liệu
			conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();
			// User1(tenUser,matKhau,hoTenNguoiDung,email,diaChi, soCCCD, soDT, tuoi,
			// gioiTinh)
			ResultSet rs = stmt.executeQuery("SELECT tenUser, matKhau FROM User1");

			while (rs.next()) {
				// Lấy giá trị của cột và lưu vào mảng String
				String tenUser2 = rs.getString("tenUser");
				String matKhau2 = rs.getString("matKhau");
				if (tenUser.equalsIgnoreCase(tenUser2) && matKhau.equalsIgnoreCase(matKhau2)) {
					find = true;
					break;
				}

			}
			if (find == true) {
				JOptionPane.showMessageDialog(null, "Đăng nhập thành công.");
				new FrmTrangChu(tenUser).setVisible(true);
				// new FrmGiaoDienTTCNUser(tenUser,matKhau).setVisible(true);
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng.");
			}

			// In ra các giá trị trong mảng String

			stmt.close();
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Lỗi dữ liệu.");
		}
	 */
	public boolean kiemTraTaiKhoanNhanVien(String tenDangNhap, String matKhau)
	{
		String sqlSelect="Select tenDangNhap, matKhau from NhanVien";
		ResultSet rs;
		try 
		{
			rs = con.stmt().executeQuery(sqlSelect);
			while (rs.next()) 
			{
				// Lấy giá trị của cột và lưu vào mảng String
				String tenDangNhap2 = rs.getString("tenDangNhap");
				String matKhau2 = rs.getString("matKhau");
				if (tenDangNhap.equalsIgnoreCase(tenDangNhap2) && matKhau.equalsIgnoreCase(matKhau2)) 
				{
					return true;
				}
			}		
		} catch (SQLException e2) 
		{
			e2.printStackTrace();
			JOptionPane.showMessageDialog(null, e2.getMessage());
			return false;
		}		
		return false;
		
	}
	public boolean kiemTraDeDoiMatKhau(String tenDangNhap,String email, String soDienThoai)
	{
		String sqlSelect="Select tenDangNhap, email,soDienThoai from NhanVien";
		ResultSet rs;
		try 
		{
			rs = con.stmt().executeQuery(sqlSelect);
			while (rs.next()) 
			{
				// Lấy giá trị của cột và lưu vào mảng String
				String tenDangNhap2 = rs.getString("tenDangNhap");
				String email2=rs.getString("email");
				String soDienThoai2=rs.getString("soDienThoai");
				if (tenDangNhap.equalsIgnoreCase(tenDangNhap2) && email.equalsIgnoreCase(email2) && soDienThoai.equalsIgnoreCase(soDienThoai2)) 
				{
					return true;
				}
			}		
		} catch (SQLException e3) 
		{
			e3.printStackTrace();
			JOptionPane.showMessageDialog(null, e3.getMessage());
			return false;
		}		
		return false;
	}
	/*
	 * UPDATE NhanVien
		SET matKhau = 'an1234'
		WHERE tenDangNhap = 'an123';
	 */
	public boolean doiMatKhauTaiKhoan(String tenDangNhap, String matKhau)
	{
		String sqlUpdate="UPDATE NhanVien SET matKhau = '"+matKhau+"' WHERE tenDangNhap = '"+tenDangNhap+"';";
		try 
		{											
			con.stmt().executeUpdate(sqlUpdate);
			JOptionPane.showMessageDialog(null,"Đổi mật khẩu thành công.");		
			con.con().close();	
			con.stmt().close();
			return true;
		} catch (SQLException e4) 
		{	
			e4.printStackTrace();
			JOptionPane.showMessageDialog(null, e4.getMessage());
			return false;
		}
	}
	/*
	 * Connect connect=new Connect();
		try 
		{
			//delete from  Country where name ='Spain'
			java.sql.Statement stmt=connect.con().createStatement();
			String sqlQueryAll = "select*from Country";
			ResultSet rs = stmt.executeQuery(sqlQueryAll);			           			        
            while (rs.next()) 
            {
                String name=rs.getString("name");
                String capital=rs.getString("capital");
                int population=rs.getInt("population");
                String clubChampion=rs.getString("clubChampion");
                Country c = new Country(name, capital, population, clubChampion);
                if (dao.addCountry(c)) //kiểm tra khoá chính
                {
                	String[] row = {name, capital, Integer.toString(population), clubChampion +""};
    				tableModel.addRow(row);
                }    
            }           
            rs.close();
            stmt.close();
            connect.con().close();			
		} catch (Exception e3) 
		{	
			e3.printStackTrace();
			JOptionPane.showMessageDialog(null, e3.getMessage());
		}
	 */
	public NhanVien duLieuNhanVien(String tenDangNhap)
	{
		//select*from NhanVien where tenDangNhap='an12343'
		String sqlSelect="select*from NhanVien where tenDangNhap='"+tenDangNhap+"'";
		ResultSet rs=con.resultSet(sqlSelect);
		NhanVien n;
		try 
		{
			while(rs.next())
			{
				String getTenDangNhap=rs.getString("tenDangNhap");
				String getMatKhau=rs.getString("matKhau");
				String getHoVaTen=rs.getString("hoVaTen");
				String getGioiTinh=rs.getString("gioiTinh");
				String getSoDienThoai=rs.getString("soDienThoai");
				String getEmail=rs.getString("email");
				String getDiaChi=rs.getString("diaChi");
				String getTuoi=rs.getString("tuoi");
				int getTuoiInt=Integer.parseInt(getTuoi);
				n=new NhanVien(getTenDangNhap, getMatKhau, getHoVaTen, getGioiTinh, getEmail, getSoDienThoai, getDiaChi, getTuoiInt);
				return n;
			}	
		} catch (SQLException e5) 
		{			
			e5.printStackTrace();
			JOptionPane.showMessageDialog(null, e5.getMessage());
			return null;
		}
		return null;
	}
	public void thayDoiThongTin(NhanVien n)
	{
		String sqlUpdate="UPDATE NhanVien\r\n"
				+ "SET tenDangNhap = '"+n.getTenDangNhap()+"',\r\n"
				+ "matKhau='"+n.getMatKhau()+"',\r\n"
				+ "hoVaTen='"+n.getHoVaTen()+"',\r\n"
				+ "gioiTinh='"+n.getGioiTinh()+"',\r\n"
				+ "email='"+n.getEmail()+"',\r\n"
				+ "soDienThoai='"+n.getSoDienThoai()+"',\r\n"
				+ "diaChi='"+n.getDiaChi()+"',\r\n"
				+ "tuoi="+n.getTuoi()+"\r\n"
				+ "WHERE tenDangNhap = '"+n.getTenDangNhap()+"';";
		try 
		{											
			con.stmt().executeUpdate(sqlUpdate);
			JOptionPane.showMessageDialog(null,"Thay đổi thông tin thành công.");		
			con.con().close();	
			con.stmt().close();
		} catch (SQLException e6) 
		{	
			e6.printStackTrace();
			JOptionPane.showMessageDialog(null, e6.getMessage());
		}	
	}
	/*
	 * try 
		{
			//delete from  Country where name ='Spain'
			java.sql.Statement stmt=connect.con().createStatement();
			String sqlQueryAll = "select*from Country";
			ResultSet rs = stmt.executeQuery(sqlQueryAll);			           			        
            while (rs.next()) 
            {
                String name=rs.getString("name");
                String capital=rs.getString("capital");
                int population=rs.getInt("population");
                String clubChampion=rs.getString("clubChampion");
                Country c = new Country(name, capital, population, clubChampion);
                if (dao.addCountry(c)) //kiểm tra khoá chính
                {
                	String[] row = {name, capital, Integer.toString(population), clubChampion +""};
    				tableModel.addRow(row);
                }    
            }           
            rs.close();
            stmt.close();
            connect.con().close();			
		} catch (Exception e3) 
		{	
			e3.printStackTrace();
			JOptionPane.showMessageDialog(null, e3.getMessage());
		}
	 */
	public void xuatBangNhanVienKhac(DefaultTableModel tableModel,String tenDangNhap)
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
		} catch (SQLException e7) 
		{	
			e7.printStackTrace();
			JOptionPane.showMessageDialog(null, e7.getMessage());
		}
		
	}
}
