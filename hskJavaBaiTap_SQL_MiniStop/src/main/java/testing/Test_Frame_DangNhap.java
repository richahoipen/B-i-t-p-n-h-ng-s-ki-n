package testing;

import frame_DangNhap_DangKi.Frame_DangNhap;

public class Test_Frame_DangNhap 
{

	public static void main(String[] args) 
	{
		java.awt.EventQueue.invokeLater(new Runnable() 
		{
            public void run() {
                new Frame_DangNhap().setVisible(true);
            }
        });
	}

}
