package testing;


import dataBase_DAO.NhanVien_DAO;
import entities.NhanVien;
import frame_DangNhap_DangKi.Frame_TrangChu_NhanVien;

public class Test_Frame_TrangChu_NhanVien 
{
	public static void main(String[] args) 
	{
		
		NhanVien_DAO sqlNhanVien=new NhanVien_DAO();
		String tenDangNhap="minh123";
		final NhanVien n=sqlNhanVien.duLieuNhanVien(tenDangNhap);
		java.awt.EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				new Frame_TrangChu_NhanVien(n).setVisible(true);
			}
		});
	}
}
