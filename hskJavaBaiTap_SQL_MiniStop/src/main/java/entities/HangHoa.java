package entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "HangHoa")
@NamedQuery(name = "HangHoa.findAll", query = "FROM HangHoa")
public class HangHoa 
{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maHangHoa == null) ? 0 : maHangHoa.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HangHoa other = (HangHoa) obj;
		if (maHangHoa == null) {
			if (other.maHangHoa != null)
				return false;
		} else if (!maHangHoa.equals(other.maHangHoa))
			return false;
		return true;
	}
	/**
	 * @return the thanhTien
	 */
	public double getThanhTien() {
		return thanhTien;
	}
	/**
	 * @param thanhTien the thanhTien to set
	 */
	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}
	@Override
	public String toString() {
		return "HangHoa [maHangHoa=" + maHangHoa + ", tenHangHoa=" + tenHangHoa + ", ngaySanXuat=" + ngaySanXuat
				+ ", ngayHetHan=" + ngayHetHan + ", giaCa=" + giaCa + ", soLuong=" + soLuong + ", thanhTien="
				+ thanhTien + "]";
	}
	/**
	 * @return the maHangHoa
	 */
	public String getMaHangHoa() {
		return maHangHoa;
	}
	/**
	 * @param maHangHoa the maHangHoa to set
	 */
	public void setMaHangHoa(String maHangHoa) {
		this.maHangHoa = maHangHoa;
	}
	/**
	 * @return the tenHangHoa
	 */
	public String getTenHangHoa() {
		return tenHangHoa;
	}
	/**
	 * @param tenHangHoa the tenHangHoa to set
	 */
	public void setTenHangHoa(String tenHangHoa) {
		this.tenHangHoa = tenHangHoa;
	}
	/**
	 * @return the ngaySanXuat
	 */
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	/**
	 * @param ngaySanXuat the ngaySanXuat to set
	 */
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	/**
	 * @return the ngayHetHan
	 */
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	/**
	 * @param ngayHetHan the ngayHetHan to set
	 */
	public void setNgayHetHan(LocalDate ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	/**
	 * @return the giaCa
	 */
	public double getGiaCa() {
		return giaCa;
	}
	/**
	 * @param giaCa the giaCa to set
	 */
	public void setGiaCa(double giaCa) {
		this.giaCa = giaCa;
	}
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	/**
	 * @return the hoaDon
	 */
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	/**
	 * @param hoaDon the hoaDon to set
	 */
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
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
	@Id
	@Column(name="maHangHoa",length=100,nullable=false)
	private String maHangHoa;
	@Column(name="tenHangHoa",length=100,nullable=false)
	private String tenHangHoa;
	@Column(name="ngaySanXuat",length=100,nullable=false)
	private LocalDate ngaySanXuat;
	@Column(name="ngayHetHan",length=100,nullable=false)
	private LocalDate ngayHetHan;
	@Column(name="giaCa",length=100,nullable=false)
	private double giaCa;
	@Column(name="soLuong",length=100,nullable=false)
	private int soLuong;
	@Column(name="thanhTien",length=100,nullable=false)
	private double thanhTien=soLuong*giaCa;
	//Nối bảng
	@ManyToOne
    @JoinColumn(name = "maHoaDon")
	private HoaDon hoaDon;
	@ManyToOne
    @JoinColumn(name = "tenDangNhap")
	private NhanVien nhanVien;
	public HangHoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangHoa(String maHangHoa, String tenHangHoa, LocalDate ngaySanXuat, LocalDate ngayHetHan, double giaCa,
			int soLuong) {
		super();
		this.maHangHoa = maHangHoa;
		this.tenHangHoa = tenHangHoa;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.giaCa = giaCa;
		this.soLuong = soLuong;
	}
	
}
