package entities;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "HangHoaKho")
@NamedQuery(name = "HangHoaKho.findAll", query = "FROM HangHoaKho")
public class HangHoaKho 
{
	/**
	 * @return the ngaySanXuatLocalDate
	 */
	public LocalDate getNgaySanXuatLocalDate() {
		return ngaySanXuat.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public LocalDate getNgayHetHanLocalDate() {
		return ngayHetHan.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	/**
	 * @param ngayHetHanLocalDate the ngayHetHanLocalDate to set
	 */

	public String toString() {
		return "HangHoaKho [maHangHoa=" + maHangHoa + ", tenHangHoa=" + tenHangHoa + ", ngaySanXuat=" + ngaySanXuat
				+ ", ngayHetHan=" + ngayHetHan + ", giaCa=" + giaCa + ", soLuong=" + soLuong + "]";
	}
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
		HangHoaKho other = (HangHoaKho) obj;
		if (maHangHoa == null) {
			if (other.maHangHoa != null)
				return false;
		} else if (!maHangHoa.equals(other.maHangHoa))
			return false;
		return true;
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
	public Date getNgaySanXuat() {
		return ngaySanXuat;
	}
	/**
	 * @param ngaySanXuat the ngaySanXuat to set
	 */
	public void setNgaySanXuat(Date ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	/**
	 * @return the ngayHetHan
	 */
	public Date getNgayHetHan() {
		return ngayHetHan;
	}
	/**
	 * @param ngayHetHan the ngayHetHan to set
	 */
	public void setNgayHetHan(Date ngayHetHan) {
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
	@Id
	@Column(name="maHangHoa",length=100,nullable=false)
	private String maHangHoa;
	@Column(name="tenHangHoa",length=100,nullable=false)
	private String tenHangHoa;		
	@Column(name="giaCa",length=100,nullable=false)
	private double giaCa;
	@Column(name="soLuong",length=100,nullable=false)
	private int soLuong;
	@Column(name="ngaySanXuat",length=100,nullable=false)
	private LocalDate ngaySanXuatLocalDate;
	@Column(name="ngayHetHan",length=100,nullable=false)
	private LocalDate ngayHetHanLocalDate;
	
	private Date ngaySanXuat;	
	private Date ngayHetHan;
	public HangHoaKho() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HangHoaKho(String maHangHoa, String tenHangHoa, Date ngaySanXuat, Date ngayHetHan, double giaCa,
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
