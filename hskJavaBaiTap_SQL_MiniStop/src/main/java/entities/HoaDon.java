package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "HoaDon")
@NamedQuery(name = "HoaDon.findAll", query = "FROM HoaDon")
public class HoaDon 
{
	
	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", tenHoaDon=" + tenHoaDon + ", ngayLap=" + ngayLap + ", giamGia="
				+ giamGia + ", tongThanhTien=" + tongThanhTien + "]";
	}
	/**
	 * @return the maHoaDon
	 */
	public String getMaHoaDon() {
		return maHoaDon;
	}
	/**
	 * @param maHoaDon the maHoaDon to set
	 */
	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	/**
	 * @return the tenHoaDon
	 */
	public String getTenHoaDon() {
		return tenHoaDon;
	}
	/**
	 * @param tenHoaDon the tenHoaDon to set
	 */
	public void setTenHoaDon(String tenHoaDon) {
		this.tenHoaDon = tenHoaDon;
	}
	/**
	 * @return the ngayLap
	 */
	public LocalDate getNgayLap() {
		return ngayLap;
	}
	/**
	 * @param ngayLap the ngayLap to set
	 */
	public void setNgayLap(LocalDate ngayLap) {
		this.ngayLap = ngayLap;
	}
	/**
	 * @return the giamGia
	 */
	public double getGiamGia() {
		return giamGia;
	}
	/**
	 * @param giamGia the giamGia to set
	 */
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	/**
	 * @return the nhanVien
	 */
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	/**
	 * @param nhanVien the nhanVien to set
	 */
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	/**
	 * @return the listHangHoa
	 */
	public List<HangHoa> getListHangHoa() {
		return listHangHoa;
	}
	/**
	 * @param listHangHoa the listHangHoa to set
	 */
	public void setListHangHoa(List<HangHoa> listHangHoa) {
		this.listHangHoa = listHangHoa;
	}
	@Id
	@Column(name="maHoaDon",length=100,nullable=false)
	private String maHoaDon;
	@Column(name="tenHoaDon",length=100,nullable=false)
	private String tenHoaDon;
	@Column(name="ngayLap",length=100,nullable=false)
	private LocalDate ngayLap;
	@Column(name="giamGia",length=100,nullable=false)
	private double giamGia;
	@Column(name="tongThanhTien",length=100,nullable=false)
	private double tongThanhTien=thanhTienHoaDon();
	//Nối bảng
	@ManyToOne
    @JoinColumn(name = "tenDangNhap")
	private NhanVien nhanVien;
	@OneToMany(mappedBy = "hoaDon", cascade = CascadeType.ALL)
	private List<HangHoa> listHangHoa = new ArrayList<>();
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(String maHoaDon, String tenHoaDon, LocalDate ngayLap, double giamGia) {
		super();
		this.maHoaDon = maHoaDon;
		this.tenHoaDon = tenHoaDon;
		this.ngayLap = ngayLap;
		this.giamGia = giamGia;
	}	
	public double thanhTienHoaDon()
	{
		double s=0;
		for(HangHoa h:listHangHoa)
		{
			s+=h.getThanhTien()-h.getThanhTien()*getGiamGia();
		}
		return s;
	}
}
