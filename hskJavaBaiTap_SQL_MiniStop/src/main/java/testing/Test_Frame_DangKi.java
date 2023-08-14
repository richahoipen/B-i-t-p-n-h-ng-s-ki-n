package testing;

import frame_DangNhap_DangKi.Frame_DangKi;

public class Test_Frame_DangKi {

	public static void main(String[] args) 
	{
		java.awt.EventQueue.invokeLater(new Runnable() 
		{
            public void run() {
                new Frame_DangKi().setVisible(true);
            }
        });
	}

}
