package list_DAO;

import java.util.ArrayList;

import entities.HangHoaKho;

public class HangHoaKho_List 
{
	/**
	 * @return the listHangHoaKho
	 */
	public ArrayList<HangHoaKho> getListHangHoaKho() {
		return listHangHoaKho;
	}

	/**
	 * @param listHangHoaKho the listHangHoaKho to set
	 */
	public void setListHangHoaKho(ArrayList<HangHoaKho> listHangHoaKho) {
		this.listHangHoaKho = listHangHoaKho;
	}

	private ArrayList<HangHoaKho> listHangHoaKho;

	public HangHoaKho_List() {
		super();
		setListHangHoaKho(new ArrayList<HangHoaKho>());
		
	}
	public boolean themHangHoaKho(HangHoaKho h)
	{
		if(!listHangHoaKho.contains(h))
		{
			listHangHoaKho.add(h);
			return true;
		}
		return false;
	}
	public HangHoaKho timKiemHangHoaKho(String maHangHoa)
	{
		for(HangHoaKho h:listHangHoaKho)
		{
			if(h.getMaHangHoa().equalsIgnoreCase(maHangHoa))
				return h;
		}
		return null;
	}
	public boolean xoaHangHoaKho(String maHangHoa)
	{
		HangHoaKho h=timKiemHangHoaKho(maHangHoa);
		if(h!=null)
		{
			listHangHoaKho.remove(h);
			return true;
		}
		return false;
	}
}
