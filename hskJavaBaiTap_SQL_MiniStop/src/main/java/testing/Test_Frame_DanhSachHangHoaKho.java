
package testing;

import frame_DanhSach.Frame_DanhSachHangHoaKho;
import list_DAO.HangHoaKho_List;

public class Test_Frame_DanhSachHangHoaKho
{	

	public static void main(String[] args) 
	{
		final HangHoaKho_List dao = new HangHoaKho_List();
		final String tenDangNhap="minh123";
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_DanhSachHangHoaKho(dao,tenDangNhap).setVisible(true);
            }
        });
	}
}
